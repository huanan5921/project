package com.huanan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.huanan.entity.Article;

/**
 * 资源Respository接口
 * @author Administrator
 *
 */
public interface ArticleRepository extends JpaRepository<Article, Integer>,JpaSpecificationExecutor<Article>{

}
