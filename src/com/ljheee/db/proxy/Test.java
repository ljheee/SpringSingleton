package com.ljheee.db.proxy;

public class Test {
	
	
	Service service;
	
	

	public Test(Service service) {
		super();
		this.service = service;
	}



	public Service getService() {
		return service;
	}



	public void setService(Service service) {
		this.service = service;
	}

	public void start(){
		boolean isLogin = service.login("ljh", "ppp");
		if(isLogin){
			service.createOrder();
		}
	}


	public static void main(String[] args) {

//		Service service = new ServiceImpl();
//		service.login("ljh", "123");
//		service.createOrder();
		
		
		Test test = new Test(new ServiceLogProxy(new ServiceImpl()));
		test.start();
		
	}

}
