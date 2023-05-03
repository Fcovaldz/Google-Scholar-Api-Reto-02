package com.google.scholar.api.service;

import com.google.scholar.api.application.GoogleScholarProfilesApiClient;
import com.google.scholar.api.model.Author;
import com.google.scholar.api.model.GoogleScholarAuthorApiResponse;
import com.google.scholar.api.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    private GoogleScholarProfilesApiClient apiClient;

    @Autowired
    private AuthorRepository authorRepository;

    @Value("${serpapi.apikey}")
    private String apiKey;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    /*public List<Author> search(String query) {
        GoogleScholarAuthorApiResponse response = apiClient.search("google_scholar_profiles", null, null, null, null, null, null, query, "your-api-key");
        List<Author> authors = response.getAuthors();
        return authors;
    }*/
    //String query,  searchQuery,
    public List<Author> search(String authorId) {
        //String searchQuery = query != null ? query : "user:" + authorId;
        GoogleScholarAuthorApiResponse response = apiClient.search("google_scholar_author", null, null, null, null, null, authorId, apiKey);
        List<Author> authors = response.getAuthors();
        return authors;
    }

    public void saveAll(List<Author> authors) {
        authorRepository.saveAll(authors);
    }

    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    public Optional<Author> getById(String id) {
        return authorRepository.findById(id);
    }
}

