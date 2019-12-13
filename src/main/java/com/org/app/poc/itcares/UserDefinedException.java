package com.org.app.poc.itcares;

import ch.qos.logback.classic.Logger;

public class UserDefinedException extends Exception {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	public 	UserDefinedException(String exception){
		
		super(exception);
	}
}
