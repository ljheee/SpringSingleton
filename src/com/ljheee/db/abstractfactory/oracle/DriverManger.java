package com.ljheee.db.abstractfactory.oracle;

import com.ljheee.db.abstractfactory.AbstractFactory;
import com.ljheee.db.abstractfactory.Connection;
import com.ljheee.db.abstractfactory.Statement;
/**
 * ����ʲô���Ĺ������ͷ���ʲô���������Ĳ�Ʒ
 * @author ljheee
 *
 */
public class DriverManger implements AbstractFactory{

	AbstractFactory factory;
	
	
	
	public DriverManger(AbstractFactory factory) {
		super();
		this.factory = factory;
	}

	@Override
	public Connection createConnection() {
		// TODO Auto-generated method stub
		return factory.createConnection();
	}

	@Override
	public Statement createStatement() {
		// TODO Auto-generated method stub
		return factory.createStatement();
	}

	
	
}
