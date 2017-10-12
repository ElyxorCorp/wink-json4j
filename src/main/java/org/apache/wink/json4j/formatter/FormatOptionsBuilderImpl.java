package org.apache.wink.json4j.formatter;

public class FormatOptionsBuilderImpl implements FormatOptionsBuilder {

    private final FormatOptionsImpl formatOptions = new FormatOptionsImpl();

    @Override
    public FormatOptions build() {
        return formatOptions;
    }

    @Override
    public FormatOptionsBuilder setFormat(final FormatOptions.Format format) {
        formatOptions.setFormat(format);
        return this;
    }

    @Override
    public FormatOptionsBuilder setEmptyArrayOnSameLine(final boolean flag) {
        formatOptions.setEmptyObjectsAndArrayClosuresOnSameLine(flag);
        return this;
    }

    @Override
    public FormatOptionsBuilder setEscapeForwardSlashes(final boolean flag) {
        formatOptions.setEscapeForwardSlashes(flag);
        return this;
    }

    @Override
    public FormatOptionsBuilder setSpaceBetweenKeyAndColon(final boolean flag) {
        formatOptions.setSpaceBetweenKeyAndColon(flag);
        return this;
    }

    @Override
    public FormatOptionsBuilder setNewlineString(final String newline) {
        formatOptions.setNewline(newline);
        return this;
    }

    @Override
    public FormatOptionsBuilder setIndentString(final String indent) {
        formatOptions.setIndentString(indent);
        return this;
    }
}
