package com.ljheee.factory;

import com.ljheee.factory.MyBeanFactory.Type;

public class Test {

	public static void main(String[] args) {

		Ppt ppt = (Ppt) MyBeanFactory.getBean(Type.PPT);
		
		
		
		
	}

}
