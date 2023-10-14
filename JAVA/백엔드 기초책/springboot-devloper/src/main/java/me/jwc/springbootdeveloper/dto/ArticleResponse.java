package me.jwc.springbootdeveloper.dto;

import me.jwc.springbootdeveloper.domain.Article;

public class ArticleResponse {

    private final String title;
    private final String content;

    public ArticleResponse(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
    }

}
