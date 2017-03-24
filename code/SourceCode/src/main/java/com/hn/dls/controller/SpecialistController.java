package com.hn.dls.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hn.dls.entity.Specialist;
import com.hn.dls.service.SpecialistManager;

import net.sf.json.JSONArray;

@Controller
@RequestMapping(value = "/specialist")



public class SpecialistController {

	@Resource(name="specialistService")
	private SpecialistManager specialistService;
	
	/**
	 * 查询所有专家信息
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "all")
	@ResponseBody
	public JSONArray findAllMsg(HttpServletRequest request, HttpServletResponse response) throws Exception{
		List<Specialist> list =specialistService.findAllList();
		return new JSONArray().fromObject(list);
	}
}
