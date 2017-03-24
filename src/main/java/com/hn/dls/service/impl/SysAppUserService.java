package com.hn.dls.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.hn.dls.dao.DlsDAO;
import com.hn.dls.dao.DlsdaoSupport;
import com.hn.dls.entity.SysAppUser;
import com.hn.dls.service.SysAppUserManager;
import com.hn.dls.utils.MD5;

@Service("sysAppUserService")
public class SysAppUserService implements SysAppUserManager {

	@Resource(name = "dlsdaoSupport")
	private DlsdaoSupport dlsDao;

	/**
	 * 用户登录判断
	 * 
	 * @param username
	 * @param password
	 * @return
	 * @throws Exception
	 */
	public SysAppUser getUserByNameAndPwd(String username, String password) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		password = MD5.md5(password);
		map.put("username", username);
		map.put("password", password);
		return (SysAppUser) dlsDao.findForObject("SysAppUserMapper.getUserInfo", map);
	}

	/**
	 * 更改密码
	 * 
	 * @param sysAppUser
	 * @throws Exception
	 */
	@Override
	public void updatePwd(SysAppUser sysAppUser) throws Exception {
		sysAppUser.setPassword(MD5.md5(sysAppUser.getPassword()));
		dlsDao.update("SysAppUserMapper.changePwd", sysAppUser);
	}

	/**
	 * 保存登录Ip和Time
	 * 
	 * @param sysAppUser
	 * @throws Exception
	 */
	@Override
	public void saveLoginMsg(SysAppUser sysAppUser) throws Exception {		
		dlsDao.update("SysAppUserMapper.updateLoginMsg", sysAppUser);

	}

}
