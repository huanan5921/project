package com.huanan.service.impl;

import java.util.List;

import com.huanan.entity.ArcType;
import com.huanan.repository.ArcTypeRepository;
import com.huanan.service.ArcTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

/**
 * 资源类别Service实现类
 * @author Administrator
 *
 */
@Service("arcTypeService")
public class ArcTypeServiceImpl implements ArcTypeService{

	@Autowired
	private ArcTypeRepository arcTypeRepository;

	@Override
	public List<ArcType> listAll(Direction direction, String properties) {
		Sort sort = new Sort(direction, properties);
		return arcTypeRepository.findAll(sort);
	}
}
