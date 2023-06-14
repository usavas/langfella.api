package com.appicient.langfella.domain.language;

import com.appicient.langfella.domain.common.Entity;

public class Language extends Entity {
    private int id;
    private String shortCode;
    private String name;

    public Language(int id, String shortCode, String name) {
        this.id = id;
        this.shortCode = shortCode;
        this.name = name;
    }

    public Language(String shortCode, String name) {
        this.shortCode = shortCode;
        this.name = name;
    }
}
