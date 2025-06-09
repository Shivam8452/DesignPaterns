package com.designPatterns.creational.singletonPattern.appSettings;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppSettings appSettings = AppSettings.getInstance();
		
		System.out.println(appSettings.getKey());
		System.out.println(appSettings.getURL());
		
		AppSettings appSettingsCpy = AppSettings.getInstance();
		
		System.out.println(appSettings==appSettingsCpy);
	}

}
