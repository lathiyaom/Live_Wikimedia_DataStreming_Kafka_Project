package net.javaguides.springboot.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "wikimedia_table")  // Ensure the table name matches the one in your DB
public class WikimediaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String wikiEventData;

    // No-args constructor (required by JPA)
    public WikimediaData() {
    }

    // Constructor with parameters
    public WikimediaData(Long id, String wikiEventData) {
        this.id = id;
        this.wikiEventData = wikiEventData;
    }

    // Getter and Setter for id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for wikiEventData
    public String getWikiEventData() {
        return wikiEventData;
    }

    public void setWikiEventData(String wikiEventData) {
        this.wikiEventData = wikiEventData;
    }
}
