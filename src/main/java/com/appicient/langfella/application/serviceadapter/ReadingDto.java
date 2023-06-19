package com.appicient.langfella.application.serviceadapter;

import com.appicient.langfella.domain.language.Language;
import com.appicient.langfella.domain.reading.Author;
import com.appicient.langfella.domain.reading.ContentItem;
import com.appicient.langfella.domain.words.Word;

import java.util.ArrayList;

public class ReadingDto {
        private  int id;
        private final String title;
        private final Language language;
        private final String source;
        private final ArrayList<Author> authors;
        private final ArrayList<ContentItem> contentItems;
        private ArrayList<Word> words;

        public ReadingDto(
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

        public ReadingDto(
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

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Language getLanguage() {
        return language;
    }

    public String getSource() {
        return source;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public ArrayList<ContentItem> getContentItems() {
        return contentItems;
    }

    public ArrayList<Word> getWords() {
        return words;
    }
}
