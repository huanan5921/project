package com.huanan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.huanan.entity.Link;
import com.huanan.repository.LinkRepository;
import com.huanan.service.LinkService;

/**
 * 友情链接Service实现类
 * @author Administrator
 *
 */
@Service("linkService")
public class LinkServiceImpl implements LinkService{

	@Autowired
	private LinkRepository linkRepository;
	
	@Override
	public List<Link> listAll(Direction direction, String... properties) {
		Sort sort=new Sort(direction,properties);
		return linkRepository.findAll(sort);
	}

}
