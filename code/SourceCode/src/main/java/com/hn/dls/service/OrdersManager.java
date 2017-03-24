package com.hn.dls.service;

import java.util.List;

import com.hn.dls.entity.Orders;

public interface OrdersManager {

	/**
	 * 获取所有订单
	 * @return
	 * @throws Exception
	 */
	public List<Orders> getAllMsg() throws Exception;
}
