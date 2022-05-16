package be.quirkydev.entities;

import javax.persistence.*;

@Entity
@Table(name = "BOOK", schema="LENDR")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "AUTHOR")
    private String author;
    @Column(name = "PUBLISHER")
    private String publisher;
    @Column(name = "SUMMARY")
    private String summary;
    @Column(name = "PAGES")
    private int pages;
    @Column(name = "LANGUAGE_ID")
    private Long languageId;
    @Column(name = "FORMAT_ID")
    private Long formatId;
    @Column(name = "GENRES")
    private String genres;

    public Book() {
    }

    public Book(String title, String author, String publisher, String summary, int pages, Long languageId, Long formatId, String genres) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.summary = summary;
        this.pages = pages;
        this.languageId = languageId;
        this.formatId = formatId;
        this.genres = genres;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Long getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Long languageId) {
        this.languageId = languageId;
    }

    public Long getFormatId() {
        return formatId;
    }

    public void setFormatId(Long formatId) {
        this.formatId = formatId;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return String.format("%1$s - %2$s", this.title, this.author);
    }
}
