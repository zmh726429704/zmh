package com.hn.dls.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hn.dls.dao.DlsdaoSupport;
import com.hn.dls.entity.Article;
import com.hn.dls.service.ArticleManager;

@Service("articleService")
public class ArticleService implements ArticleManager{

	@Resource(name = "dlsdaoSupport")
	private DlsdaoSupport dlsDao;
	
	/**
	 * 获取所有文章
	 * @return
	 * @throws Exception 
	 */
	@Override
	public List<Article> getAllMsg() throws Exception {
		return (List<Article>) dlsDao.findForList("ArticleMapper.getAllMsg", null);
	}

	
}
