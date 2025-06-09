package com.designPatterns.structural.ProxyPatter.NetworkServiceProxy;

public class RealNetworkService implements NetworkService {
	private String Data;

	@Override
	public String fetchData(String input) {
		// TODO Auto-generated method stub
		Data = "Data fetched from remote server for input: " + input;
		return Data;
	}
	
	

}
