package com.ljheee.db.singleton;
/**
 * Singleton
 * @author ljheee
 *
 */
public class ConnectionPool {
	
	private static ConnectionPool connectionPool;
	
	private ConnectionPool(){
		
	}
	
	
	public static ConnectionPool getConnectionPool(){
		if(null == connectionPool){
			connectionPool = new ConnectionPool();
		}
		return connectionPool;
	}

}
