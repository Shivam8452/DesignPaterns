package com.designPatterns.creational.singletonPattern.appSettings;

public class AppSettings {
	private static AppSettings instancs;
	
	private String apiKey;
	private String dbURL;
	
	private AppSettings() {
		apiKey="API-Key";
		dbURL="http://loaclhost:8080";
	}
	
	public static AppSettings getInstance() {
		if(instancs==null) {
			instancs = new AppSettings();
		}
		
		return instancs;
	}
	
	public String getKey() {
		return apiKey;
	}
	
	public String getURL() {
		return dbURL;
	}
}
