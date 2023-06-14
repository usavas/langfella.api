package com.appicient.langfella.domain.reading.values;

import com.appicient.langfella.domain.common.Value;

/**
 * TODO: DECIDE
 * is this going to be persisted in DB without ID?
 * Should this be an entity class instead of value class?
 */
public class HtmlTag extends Value {
    private final HtmlTags tag;

    public HtmlTag(HtmlTags tag) {
        this.tag = tag;
    }

    public HtmlTags getTag() {
        return tag;
    }

    public enum HtmlTags {
        h1,
        h2,
        h3,
        h4,
        h5,
        h6,
        p,
        img,
        blockquote,
        ul,
        ol,
        table,
    }
}
