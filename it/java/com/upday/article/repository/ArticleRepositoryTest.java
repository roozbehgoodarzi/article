package com.upday.article.repository;

import com.upday.article.model.Article;

import org.assertj.core.api.Assertions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class ArticleRepositoryTest {

    @Autowired
    ArticleRepository articleRepository;

    @Test
    public void shouldPersistAndRetrieve() {
        Article article = new Article();
        article.setId("1");
        article.setHeader("header");
        articleRepository.save(article);
        Assertions.assertThat(article.getHeader().equals(articleRepository.findById("1")));
    }
}
