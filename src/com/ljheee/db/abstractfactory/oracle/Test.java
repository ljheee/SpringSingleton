package com.ljheee.db.abstractfactory.oracle;

import com.ljheee.db.abstractfactory.Connection;

public class Test {

	public static void main(String[] args) {

		DriverManger manger = new DriverManger(new OracleFactory());
		Connection oracleConnection = manger.createConnection();
		
	}

}
