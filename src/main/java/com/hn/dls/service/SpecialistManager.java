package com.hn.dls.service;

import java.util.List;

import com.hn.dls.entity.Specialist;

public interface SpecialistManager {

	/**
	 * 获取所有专家列表
	 * @return
	 * @throws Exception 
	 */
	public List<Specialist> findAllList() throws Exception;
}
