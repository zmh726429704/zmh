package com.hn.dls.service;

import javax.servlet.http.HttpServletRequest;

import com.fh.util.PageData;
import com.hn.dls.entity.SysAppUser;

public interface SysAppUserManager {

    /**
     * 用户登录判断
     * @param username
     * @param password
     * @return
     * @throws Exception
     */
	public SysAppUser getUserByNameAndPwd(String username, String password)throws Exception;
	
	/**
	 * 更改密码
	 * @param sysAppUser
	 * @throws Exception
	 */
	public void updatePwd(SysAppUser sysAppUser) throws Exception;
	
	/**
	 * 保存登录Ip和Time
	 * @param sysAppUser
	 * @throws Exception
	 */
	public void saveLoginMsg(SysAppUser sysAppUser) throws Exception;
}
