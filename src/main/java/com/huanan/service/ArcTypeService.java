package com.huanan.service;/*
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　┻　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　佛主保佑 　┣┓
 * 　　　　┃　　永无BUG 　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┗┻┛　┗┻┛
 * Created by 华南 on 2019/6/29.
 */

import com.huanan.entity.ArcType;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface ArcTypeService {

    /**
     * 查询所有资源类别
     * @param direction
     * @param properties
     * @return
     */
    public List<ArcType> listAll(Sort.Direction direction, String properties);

}
