package com.hn.dls.service;

import java.util.List;

import com.hn.dls.entity.Article;

public interface ArticleManager {
	
	/**
	 * 获取所有文章
	 * @return
	 * @throws Exception 
	 */
	public List<Article> getAllMsg() throws Exception;

}
