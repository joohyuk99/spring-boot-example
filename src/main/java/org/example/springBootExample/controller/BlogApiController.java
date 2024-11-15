package org.example.springBootExample.controller;

import lombok.RequiredArgsConstructor;
import org.example.springBootExample.domain.Article;
import org.example.springBootExample.dto.AddArticleRequest;
import org.example.springBootExample.service.BlogService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class BlogApiController {

    private final BlogService blogService;

    @PostMapping("/api/articles")
    public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequest request) {
        Article savedArticle = blogService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedArticle);
    }
}
