package com.appicient.langfella.domain.reading;

import com.appicient.langfella.domain.common.Entity;
import com.appicient.langfella.domain.language.Language;
import com.appicient.langfella.domain.words.Word;

import java.util.ArrayList;

public class Reading extends Entity {
    private  int id;
    private String title;
    private final Language language;
    private final String source;
    private final ArrayList<Author> authors;
    private final ArrayList<ContentItem> contentItems;
    private ArrayList<Word> words;

    public Reading(
            String title,
            Language language,
            String source,
            ArrayList<ContentItem> contentItems,
            ArrayList<Author> authors) {
        this.title = title;
        this.language = language;
        this.source = source;
        this.contentItems = contentItems;
        this.authors = authors;
        this.words = new ArrayList<>(); // when new reading is created
    }

    public Reading(
            int id,
            String title,
            Language language,
            String source,
            ArrayList<ContentItem> contentItems,
            ArrayList<Author> authors) {
        this.id = id;
        this.title = title;
        this.language = language;
        this.source = source;
        this.contentItems = contentItems;
        this.authors = authors;
    }

    public void addWord(Word word){
        // maybe some business rules to add word
        this.words.add(word);
    }

    public void removeWord(Word word){
        this.words.remove(word);
    }
}
