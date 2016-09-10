package com.ljheee.db.proxy2;

import java.lang.reflect.Proxy;

public class App {

	public static void main(String[] args) {

		OrderService service = new OrderServiceImpl();
		
		service.createOrder();
		service.cancleOrder();
		
		
		LogProxy logProxy = new LogProxy(service);
		
		OrderService orderService = (OrderService)Proxy.newProxyInstance(
				logProxy.getClass().getClassLoader(), 
				new Class[]{OrderService.class}, 
				logProxy);
		
		orderService.createOrder();
		orderService.cancleOrder();
		orderService.login("ljh", "123456");
		
		
		
	}

}
