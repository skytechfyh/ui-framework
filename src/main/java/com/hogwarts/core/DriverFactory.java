package com.hogwarts.core;

/**
 * @author fyh
 * @date 2020/11/12
 * @desc
 */
public class DriverFactory {

	private static DriverFactory instance;

	private DriverFactory() {

	}

	public static DriverFactory getInstance() {
		return instance;
	}

	public static IDriver getDriver(){
		return new LocalDriver();
	}

}
