package com.ljheee.db.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 动态代理
 * @author ljheee
 *
 */
public class LogProxy implements InvocationHandler{
	
	/**
	 * 被代理对象
	 */
	private OrderService service;
	
	private Logger logger;

	public LogProxy(OrderService service) {
		super();
		this.service = service;
		logger = Logger.getLogger(service.getClass().getName());
	}


	/**
	 * 方法调用
	 * 被代理对象service中，每个的方法执行，都在执行前面插入代理
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		logger.log(Level.INFO, String.format("开始：  %s(%s)", method.getName(),Arrays.toString(args)));
		
		Object result = method.invoke(service, args);
		
		logger.log(Level.INFO, String.format("结束：  %s  返回： %s", method.getName(),result==null? "null":result.toString()));
		
		return result;
	}

}
