package com.appicient.langfella.domain.words;

import com.appicient.langfella.domain.common.Entity;
import com.appicient.langfella.domain.language.Language;
import com.appicient.langfella.domain.words.values.Familiarity;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Word extends Entity {
    private int id;
    private String text;
    private ArrayList<Translation> translations = new ArrayList<>();
    private Familiarity familiarity;
    private Language language;
    private ArrayList<String> exampleSentences = new ArrayList<>();

    public Word(String text, Language language) {
        this.text = text;
        this.language = language;
    }

    public Word(int id, String text, ArrayList<Translation> translations, Familiarity familiarity, Language sourceLanguage, ArrayList<String> exampleSentences) {
        this.id = id;
        this.text = text;
        this.translations = translations;
        this.familiarity = familiarity;
        this.language = sourceLanguage;
        this.exampleSentences = exampleSentences;
    }

    public void addTranslation(Translation translation){
        this.translations.add(translation);
    }

    public void addExampleSentence(String exampleSentence){
        this.exampleSentences.add(exampleSentence);
    }

    public void updateFamiliarity(Familiarity familiarity){
        this.familiarity = familiarity;
    }

    @Override
    public String toString() {
        return this.text + " "
                + this.translations
                .stream()
                .map(Translation::getText)
                .collect(Collectors.joining(", "));

    }
}
