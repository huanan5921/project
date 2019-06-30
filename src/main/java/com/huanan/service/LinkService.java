package com.huanan.service;

import java.util.List;

import org.springframework.data.domain.Sort.Direction;

import com.huanan.entity.Link;

/**
 * 友情链接Service接口
 * @author Administrator
 *
 */
public interface LinkService {

	/**
	 * 查询所有友情链接
	 * @param direction
	 * @param properties
	 * @return
	 */
	public List<Link> listAll(Direction direction, String... properties);
	
}
