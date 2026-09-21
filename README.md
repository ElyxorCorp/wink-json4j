# Wink json4j

* Copyright (c) 2009-2013 The Apache Software Foundation
* Copyright (c) 2017 Elyxor, Inc

This product includes software developed at:
* [The Apache Software Foundation (http://www.apache.org/)](http://www.apache.org/)
* [Elyxor, Inc (http://www.elyxor.com)](http://www.elyxor.com)


Source Code: [GitHub (https://github.com/ElyxorCorp/wink-json4j)](https://github.com/ElyxorCorp/wink-json4j) 

The original project was (http://wink.apache.org) of which **wink-json4j** was a subproject.  The parent project was sunset on 
2017/04/25.

**WARNING**: It is not recommended to use this library.  Jackson supports ordered JSON and xml and is a much faster solution.  
see the next section for details. Details of the `jackson` implementation can be found in 
`org.apache.wink.json4j.tests.PerformanceTests::test_parseGeneratedJsonNativeVsJackson`


## Performance: native vs. Jackson parsing

`org.apache.wink.json4j.tests.PerformanceTests` includes benchmarks comparing this library's
native JSON/XML parsing against `com.fasterxml.jackson` (`ObjectMapper`/`XmlMapper`), for both
flat and 4-level-deep nested data. Test fixtures are generated on the fly by
`org.apache.wink.json4j.utils.TestFileGenerator`.

**Methodology:** record counts are fixed per format (5,000 for JSON, 13,332 for XML - chosen so
the flat files land around 40,000 lines), and the *same* record counts are reused for the
4-level nested variant, so flat-vs-nested comparisons aren't confounded by different record
counts. Each file is parsed 100 times per library, averaged across 3 independent JVM runs (cold
start each time, no shared warm-up). Native JSON parsing uses `JSON.parse(is, true)` (ordered,
matching the native generator's `OrderedJSONObject`-based output) for a fair comparison; XML has
no such distinction since `XML.toJson()` and Jackson's `readTree()` are both inherently
order-preserving.

The 4-level nested shape is `record` (level 1) -> `profile` (level 2) -> `stats`
(level 3) -> `details` (level 4, the leaf).

### Fixture sizes (same record count, flat vs. nested)

| Format | Structure | Records | Lines | File size |
|---|---|---|---|---|
| JSON | Flat | 5,000 | 40,001 | ~945 KB |
| JSON | Nested (4-level) | 5,000 | 75,001 | ~1.50 MB |
| XML | Flat | 13,332 | 39,999 | ~2.39 MB |
| XML | Nested (4-level) | 13,332 | 119,991 | ~4.26 MB |

### Timing results (ms per parse, averaged over 3 runs)

| Format | Structure | Native | Jackson | Native is Nx slower |
|---|---|---|---|---|
| JSON | Flat | 35.03 ms | 6.24 ms | 5.6x |
| JSON | Nested (4-level) | 57.64 ms | 8.87 ms | 6.5x |
| XML | Flat | 153.41 ms | 33.67 ms | 4.6x |
| XML | Nested (4-level) | 189.79 ms | 49.35 ms | 3.9x |

### Nesting overhead at fixed record count (nested / flat, same engine)

| Format | Native | Jackson |
|---|---|---|
| JSON | 1.65x slower | 1.42x slower |
| XML | 1.24x slower | 1.47x slower |

### Interpretation

- Jackson is consistently faster, by roughly 4-7x across all four combinations tested.
- json4j's native parser is hit harder by nesting for JSON (1.65x slowdown vs. Jackson's 1.42x),
  consistent with `OrderedJSONObject`'s per-object insertion-order bookkeeping compounding at
  each nesting level.
- For XML, both libraries absorb nesting overhead similarly (1.24x vs. 1.47x); the small
  difference is within the run-to-run variance observed (roughly 15-20%).
- Caveats: no JIT warm-up phase before timing (so both sides include some JIT-compilation cost
  in the average), single machine/JVM, and only one nesting depth (4 levels) was tested.

To reproduce, run the relevant `test_*` methods in `PerformanceTests` (they are `@Ignore`d in
the normal test suite; invoke them directly, e.g. via `PerformanceTests`'s own `main` method).
