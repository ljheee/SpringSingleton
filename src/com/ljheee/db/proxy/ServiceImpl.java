package com.ljheee.db.proxy;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ServiceImpl implements Service{

	//Spring IOC/DI解析组件的依赖问题
	String userDao;
	String productDao;
	
//	private static Logger logger =Logger.getLogger(ServiceImpl.class.getName());
	
	
	
	
	@Override
	public boolean login(String name, String password) {
		// log
//		logger.log(Level.INFO,  "start");
		
		System.out.println("Login in:"+name+" ,"+password);
		
//		logger.log(Level.INFO,  "end");
		return true;
	}

	@Override
	public void createOrder() {
		
//		logger.log(Level.INFO,  "start");
		
		System.out.println("createOrder");
		
//		logger.log(Level.INFO,  "end");
		
	}

}
