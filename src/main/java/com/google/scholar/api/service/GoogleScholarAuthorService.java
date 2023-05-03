package com.google.scholar.api.service;

import com.google.scholar.api.application.GoogleScholarClient;
import com.google.scholar.api.model.Article;
import com.google.scholar.api.model.GoogleScholarAuthorApiResponse;
import com.google.scholar.api.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoogleScholarAuthorService {

    @Autowired
    private GoogleScholarClient apiClient;

    @Autowired
    private ArticleRepository articleRepository;

    public void searchAndSave(String authorId) {
        GoogleScholarAuthorApiResponse response = apiClient.search("google_scholar_author", authorId, null, null, null, null, null, null, null, null, "your-api-key");

        List<Article> articles = response.getArticles();
        articleRepository.saveAll(articles);
    }
}
