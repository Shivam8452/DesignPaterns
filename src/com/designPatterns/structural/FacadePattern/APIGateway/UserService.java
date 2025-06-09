package com.designPatterns.structural.FacadePattern.APIGateway;

public class UserService {
	
	private String userId;
	
	public String getUserId(String userid) {
		return "The userId is "+userid;
	}

}
