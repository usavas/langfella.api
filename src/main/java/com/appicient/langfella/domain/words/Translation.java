package com.appicient.langfella.domain.words;

import com.appicient.langfella.domain.common.Entity;
import com.appicient.langfella.domain.language.Language;

public class Translation extends Entity {
    private int id;
    private Language language;
    private String text;

    public Translation(int id, Language language, String text) {
        this.id = id;
        this.language = language;
        this.text = text;
    }

    public Translation(Language language, String text) {
        this.language = language;
        this.text = text;
    }

    public Language getLanguage() {
        return language;
    }

    public String getText() {
        return text;
    }
}
