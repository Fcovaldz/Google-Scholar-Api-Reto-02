package com.google.scholar.api.controller;

import com.google.scholar.api.model.Article;
import com.google.scholar.api.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/{authorId}")
    public List<Article> search(@PathVariable String authorId) {
        List<Article> articles = articleService.search(authorId);
        articleService.saveAll(articles);
        return articles;
    }

    @GetMapping
    public List<Article> findAll() {
        return articleService.findAll();
    }

}

