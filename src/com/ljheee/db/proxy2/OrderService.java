package com.ljheee.db.proxy2;
/**
 * ¶©µ¥·þÎñ
 * @author Administrator
 *
 */
public interface OrderService {

	void createOrder();
	boolean cancleOrder();
	boolean login(String name, String password);
}
