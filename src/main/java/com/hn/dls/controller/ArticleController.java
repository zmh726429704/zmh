package com.hn.dls.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hn.dls.entity.Article;
import com.hn.dls.service.ArticleManager;

import net.sf.json.JSONArray;

@Controller
@RequestMapping(value = "/article")
public class ArticleController {

	@Resource(name="articleService")
	private ArticleManager articleService;
	
	/**
	 * 获取所有文章按时间排序
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "all")
	@ResponseBody
	public JSONArray getAllMsg(HttpServletRequest request, HttpServletResponse response) throws Exception{
		List<Article> list = articleService.getAllMsg();
		return new JSONArray().fromObject(list);
	}
}
