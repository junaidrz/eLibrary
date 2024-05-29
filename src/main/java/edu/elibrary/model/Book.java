package edu.elibrary.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO ,generator = "native")
    private Long id;
    private String shortName;
    private String longName;
    private String author;
    private String genre;
    private String description;
    private String title;
    private String filePath;

}