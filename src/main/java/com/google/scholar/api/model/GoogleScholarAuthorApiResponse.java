package com.google.scholar.api.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
public class GoogleScholarAuthorApiResponse {

    private List<Article> articles;
    private List<Author> authors;


    public GoogleScholarAuthorApiResponse() {
        // Constructor por defecto vacío requerido por Jackson
    }

    public GoogleScholarAuthorApiResponse(List<Article> articles, List<Author> authors) {
        this.articles = articles;
        this.authors = authors;
    }
    // Getters and setters
}
