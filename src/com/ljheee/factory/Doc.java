package com.ljheee.factory;

public abstract class Doc {
	
	private String title;
	private String res;
	
	

	public String getRes() {
		return res;
	}

	public void setRes(String res) {
		this.res = res;
	}

	public Doc(String res) {
		this.res = res;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public abstract void edit();
	public abstract void create();
	

}
