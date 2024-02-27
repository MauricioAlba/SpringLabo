package com.infsis.proyectoSpringBoot.Services.implement;

import com.infsis.proyectoSpringBoot.DTOs.ArticleDTO;
import com.infsis.proyectoSpringBoot.Models.Article;
import com.infsis.proyectoSpringBoot.Services.ArticleService;

import java.util.Optional;

public class ArticleServiceImpl implements ArticleService {


    @Override
    public Optional<ArticleDTO> getArticleById(Integer articleId) {
        return Optional.empty();
    }

    @Override
    public ArticleDTO saveArticle(ArticleDTO articleDTO) {
        return null;
    }

    @Override
    public ArticleDTO updateArticle(Integer articleId, ArticleDTO articleDTO) {
        return null;
    }

    @Override
    public void delete(Integer articleId) {

    }

    private ArticleDTO ArticletoDto(Article article){
        ArticleDTO articleDTO = new ArticleDTO(
                article.getTitle(),
                article.getReference()
        );
        return articleDTO;
    }

    private Article DtoToArticle(ArticleDTO articleDTO){
        Article article = new Article();
        article.setTitle(articleDTO.getTitle());
        article.setReference(articleDTO.getReference());

        return article;
    }
}
