package com.appicient.langfella.application.databaseports.models;

import com.appicient.langfella.domain.language.Language;
import com.appicient.langfella.domain.reading.Author;
import com.appicient.langfella.domain.reading.ContentItem;
import com.appicient.langfella.domain.words.Word;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "reading")
public class Reading{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
//    @ManyToOne
//    private final Language language;
    private String source;
//    @ManyToMany
//    private final List<Author> authors;
//    @OneToMany
//    private final List<ContentItem> contentItems;
//    @OneToMany
//    private List<Word> words;

    public Reading(
            String title,
//            Language language,
            String source
//            List<ContentItem> contentItems,
//            List<Author> authors
    ) {
        this.title = title;
//        this.language = language;
        this.source = source;
//        this.contentItems = contentItems;
//        this.authors = authors;
//        this.words = new ArrayList<>(); // for when new reading is created
    }

    public Reading(
            int id,
            String title,
//            Language language,
            String source
//            List<ContentItem> contentItems,
//            List<Author> authors
    ) {
        this.id = id;
        this.title = title;
//        this.language = language;
        this.source = source;
//        this.contentItems = contentItems;
//        this.authors = authors;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

//    public Language getLanguage() {
//        return language;
//    }

    public String getSource() {
        return source;
    }

//    public List<Author> getAuthors() {
//        return authors;
//    }

//    public List<ContentItem> getContentItems() {
//        return contentItems;
//    }

//    public List<Word> getWords() {
//        return words;
//    }


    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
