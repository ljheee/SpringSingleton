package com.ljheee.db.proxy2;

public class OrderServiceImpl implements OrderService{

	@Override
	public void createOrder() {
		// TODO Auto-generated method stub
		System.out.println("createOrder");
		
	}

	@Override
	public boolean cancleOrder() {
		// TODO Auto-generated method stub
		System.out.println("cancleOrder");
		return false;
	}

	
	@Override
	public boolean login(String name, String password) {
		// TODO Auto-generated method stub
		System.out.println("login");
		return true;
	}

}
