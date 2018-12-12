package sn.uadb.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.uadb.shop.entities.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer>{

}
