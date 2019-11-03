package com.upday.article.repository;

import com.upday.article.model.Article;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticleRepository extends MongoRepository<Article, String> { }
