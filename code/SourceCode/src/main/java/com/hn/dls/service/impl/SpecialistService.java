package com.hn.dls.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hn.dls.dao.DlsdaoSupport;
import com.hn.dls.entity.Specialist;
import com.hn.dls.service.SpecialistManager;

@Service("specialistService")
public class SpecialistService implements SpecialistManager {

	
	@Resource(name = "dlsdaoSupport")
	private DlsdaoSupport dlsDao;
		
	/**
	 * 获取所有专家列表
	 * @return
	 * @throws Exception 
	 */
	@Override
	public List<Specialist> findAllList() throws Exception {
		
		return (List<Specialist>) dlsDao.findForList("SpecialistMapper.findAllMsg", 123);
	}

}
