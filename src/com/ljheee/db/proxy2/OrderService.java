package com.ljheee.db.proxy2;
/**
 * ��������
 * @author Administrator
 *
 */
public interface OrderService {

	void createOrder();
	boolean cancleOrder();
	boolean login(String name, String password);
}
