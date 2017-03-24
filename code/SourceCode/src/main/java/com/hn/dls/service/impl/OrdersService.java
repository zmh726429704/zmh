package com.hn.dls.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hn.dls.dao.DlsDAO;
import com.hn.dls.dao.DlsdaoSupport;
import com.hn.dls.entity.Orders;
import com.hn.dls.service.OrdersManager;

@Service("ordersService")
public class OrdersService implements OrdersManager {


	@Resource(name="dlsdaoSupport")
	private DlsdaoSupport dao;
	
	
	/**
	 * 获取所有订单
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<Orders> getAllMsg() throws Exception {
		return (List<Orders>) dao.findForList("OrdersMapper.getAllMsg", null);
	}

}
