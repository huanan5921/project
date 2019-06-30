package com.huanan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.huanan.entity.Link;

/**
 * 友情链接Respository接口
 * @author Administrator
 *
 */
public interface LinkRepository extends JpaRepository<Link, Integer>,JpaSpecificationExecutor<Link>{

}
