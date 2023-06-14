package com.appicient.langfella.domain.reading;

import com.appicient.langfella.domain.common.Entity;
import com.appicient.langfella.domain.reading.values.HtmlTag;

public class ContentItem extends Entity {
    private int id;
    private final HtmlTag htmlTag;
    private final String content;

    public ContentItem(int id, HtmlTag htmlTag, String content) {
        this.id = id;
        this.htmlTag = htmlTag;
        this.content = content;
    }

    public ContentItem(HtmlTag htmlTag, String content) {
        this.htmlTag = htmlTag;
        this.content = content;
    }
}
