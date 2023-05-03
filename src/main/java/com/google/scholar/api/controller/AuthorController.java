package com.google.scholar.api.controller;

import com.google.scholar.api.model.Article;
import com.google.scholar.api.model.Author;
import com.google.scholar.api.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;
 //@RequestParam(value = "q", required = false) String query,query,
    /*@GetMapping("/search")
    public ResponseEntity<List<Author>> search(@RequestParam(value = "author_id", required = false) String authorId) {
        List<Author> authors = authorService.search( authorId);
        return ResponseEntity.ok(authors);
    }*/

   /* @GetMapping("/{id}")
    public ResponseEntity<Author> getById(@PathVariable String id) {
        Optional<Author> author = authorService.getById(id);
        return author.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }*/
    @GetMapping("/{authorId}")
    public List<Author> search(@PathVariable String authorId) {
        List<Author> authors = authorService.search(authorId);
        authorService.saveAll(authors);
        return authors;
    }

    // Nuevo método para buscar por author_id
   /*@GetMapping("/search-by-id")
    public ResponseEntity<List<Author>> searchById(@RequestParam("author_id") String authorId) {
        List<Author> authors = authorService.search( authorId);
        return ResponseEntity.ok(authors);
    }*/

}

