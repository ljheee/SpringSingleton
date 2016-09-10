package com.ljheee.db.proxy;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 日志处理（代理）
 * @author ljheee
 *
 */
public class ServiceLogProxy implements Service{
	
	private Service service;
	Logger logger;
	
	/**
	 * 
	 * @param service	被代理的服务
	 */

	public ServiceLogProxy(Service service) {
		super();
		this.service = service;
		logger = Logger.getLogger(service.getClass().getName());
	}

	@Override
	public boolean login(String name, String password) {
		
		logger.log(Level.INFO, "start login log");
		boolean b = service.login(name, password);
		
		logger.log(Level.INFO, "end login log");
		return b;
	}

	@Override
	public void createOrder() {

		logger.log(Level.INFO, "start cteate ");
		service.createOrder();;
		logger.log(Level.INFO, "end cteate ");
		
	}

}
