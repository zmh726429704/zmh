package com.hn.dls.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hn.dls.entity.Orders;
import com.hn.dls.service.OrdersManager;

import net.sf.json.JSONArray;

@Controller
@RequestMapping(value = "/orders")
public class OrdersController {

	@Resource(name="ordersService")
	private OrdersManager ordersService;
	
	/**
	 * 获取所有订单
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="all")
	@ResponseBody
	public JSONArray getAllOrders(HttpServletRequest request, HttpServletResponse response) throws Exception{
		List<Orders> list = ordersService.getAllMsg();
		return new JSONArray().fromObject(list);
		
	}
}
