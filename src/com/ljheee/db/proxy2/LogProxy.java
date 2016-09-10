package com.ljheee.db.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * ��̬����
 * @author ljheee
 *
 */
public class LogProxy implements InvocationHandler{
	
	/**
	 * ���������
	 */
	private OrderService service;
	
	private Logger logger;

	public LogProxy(OrderService service) {
		super();
		this.service = service;
		logger = Logger.getLogger(service.getClass().getName());
	}


	/**
	 * ��������
	 * ���������service�У�ÿ���ķ���ִ�У�����ִ��ǰ��������
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		logger.log(Level.INFO, String.format("��ʼ��  %s(%s)", method.getName(),Arrays.toString(args)));
		
		Object result = method.invoke(service, args);
		
		logger.log(Level.INFO, String.format("������  %s  ���أ� %s", method.getName(),result==null? "null":result.toString()));
		
		return result;
	}

}
