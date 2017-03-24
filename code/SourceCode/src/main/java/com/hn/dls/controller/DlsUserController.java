package com.hn.dls.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hn.dls.entity.SysAppUser;
import com.hn.dls.service.SysAppUserManager;

import net.sf.json.JSONObject;

@Controller
@RequestMapping(value = "/dlsuser")
public class DlsUserController {

	@Resource(name = "sysAppUserService")
	private SysAppUserManager sysAppUserService;

	/**
	 * 用户登录
	 * 
	 * @param request
	 * @param response
	 * @param username
	 * @param password
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "login")
	@ResponseBody
	public JSONObject CheckUser(HttpServletRequest request, HttpServletResponse response, String username,
			String password) throws Exception {
		JSONObject jsonObject = new JSONObject();
		String result = "error";
		SysAppUser sysAppUser = null;
		// 获取登录信息
		sysAppUser = sysAppUserService.getUserByNameAndPwd(username, password);
		if (sysAppUser != null) {
			result = "success";
			String ip = "";
			if (request.getHeader("x-forwarded-for") == null) {
				ip = request.getRemoteAddr();
			} else {
				ip = request.getHeader("x-forwarded-for");
			}
			Date date = new Date();
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String logintime = format.format(date);
			sysAppUser.setIp(ip);
			sysAppUser.setLastLogin(logintime);
			sysAppUserService.saveLoginMsg(sysAppUser);
			jsonObject = jsonObject.fromObject(sysAppUser);
			HttpSession session =request.getSession();
			session.setAttribute("loginUser", sysAppUser);
			jsonObject.put("result", result);
		}
		jsonObject.put("result", result);
		return jsonObject;
	}

	/**
	 * 修改密码
	 * 
	 * @param request
	 * @param response
	 * @param username
	 * @param newpassword
	 */
	@RequestMapping(value = "changepwd")
	@ResponseBody
	public JSONObject ChangePwd(HttpServletRequest request, HttpServletResponse response, String username,
			String password) {
		JSONObject jsonObject = new JSONObject();
		String result = "error";
		SysAppUser sysAppUser = new SysAppUser();
		sysAppUser.setUsername(username);
		sysAppUser.setPassword(password);
		try {
			sysAppUserService.updatePwd(sysAppUser);
			result="success";
			jsonObject.put("result", result);
			return jsonObject;
		} catch (Exception e) {
			// TODO: handle exception
		}
		jsonObject.put("result", result);
		return jsonObject;
	}

}
