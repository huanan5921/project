package com.huanan.controller;/*
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
 * Created by 华南 on 2019/6/27.
 */

import com.huanan.entity.Article;
import com.huanan.service.ArticleService;
import com.huanan.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 首页或其他页面跳转控制器
 */
@Controller
public class IndexController {

    @Autowired
    private ArticleService articleService;

    /**
     * 网站根目录路径
     * @return
     */
    @RequestMapping("/")
    public ModelAndView root(HttpServletRequest request){
        request.getSession().setAttribute("tMenu", "t_0");
        Article s_article=new Article();
        s_article.setState(2); // 审核通过的帖子
        List<Article> indexArticleList = articleService.list(s_article, 1, 20, Sort.Direction.DESC,"publishDate");
        Long total=articleService.getTotal(s_article);

        s_article.setHot(true);
        List<Article> indexHotArticleList = articleService.list(s_article, 1, 43, Sort.Direction.DESC,"publishDate");
        ModelAndView mav=new ModelAndView();
        mav.addObject("title", "首页");
        mav.addObject("articleList", indexArticleList);
        mav.addObject("hotArticleList", indexHotArticleList);
        mav.addObject("pageCode", PageUtil.genPagination("/article/list", total, 1, 20, ""));
        mav.setViewName("index");
        return mav;
    }

}
