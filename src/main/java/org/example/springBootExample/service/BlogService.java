package org.example.springBootExample.service;

import lombok.RequiredArgsConstructor;
import org.example.springBootExample.domain.Article;
import org.example.springBootExample.dto.AddArticleRequest;
import org.example.springBootExample.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
