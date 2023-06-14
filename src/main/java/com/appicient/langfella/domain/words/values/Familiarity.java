package com.appicient.langfella.domain.words.values;

import com.appicient.langfella.domain.common.Value;

public class Familiarity extends Value {
    /**
     * 1 to 5, from new to immersed.
     */
    private int rememberingLevel;
    /**
     * new, familiar, immersed etc.
     */
    private String description;
}
