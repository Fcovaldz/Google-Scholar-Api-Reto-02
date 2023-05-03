package com.google.scholar.api.service;

import com.google.scholar.api.application.GoogleScholarClient;
import com.google.scholar.api.model.Article;
import com.google.scholar.api.model.GoogleScholarAuthorApiResponse;
import com.google.scholar.api.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private GoogleScholarClient apiClient;

    @Autowired
    private ArticleRepository articleRepository;

    @Value("${serpapi.apikey}")
    private String apiKey;

    public List<Article> search(String authorId) {
        GoogleScholarAuthorApiResponse response = apiClient.search("google_scholar_author", authorId, null, null, null, null, null, null, null, null, apiKey);
        List<Article> articles = response.getArticles();
        return articles;
    }

    public void saveAll(List<Article> articles) {
        articleRepository.saveAll(articles);
    }

    public List<Article> findAll() {
        return articleRepository.findAll();
    }

}

