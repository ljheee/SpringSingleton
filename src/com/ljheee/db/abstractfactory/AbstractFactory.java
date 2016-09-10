package com.ljheee.db.abstractfactory;

public interface AbstractFactory {

	Connection createConnection();
	Statement  createStatement();
}
