package com.ljheee.factory;
/**
 * �ù����ɴ���Doc
 * Doc����������
 * @author Administrator
 *
 */
public class MyBeanFactory {

	static String res;
	
	public enum Type{
		WORD,EXCEL,PPT
	}
	
	public static Doc getBean(Type type){
		Doc doc = null;
		switch (type) {
		
		case WORD:
			doc = new Word(res);
			break;
			
		case EXCEL:
			doc = new Excel(res);
			break;
			
		case PPT:
			doc = new Ppt(res);
			break;

		default:
			break;
		}
		
		
		return doc;
	}
}
