package com.designPatterns.structural.ProxyPatter.NetworkServiceProxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyNetworkService implements NetworkService {
	
	private Map<String, String> cache;	
	private RealNetworkService realNetworkService;
	
	public ProxyNetworkService() {
		cache = new HashMap();
	}
	
	 @Override
	    public String fetchData(String input) {
	        String Data;
	        if (cache.containsKey(input)) {
	            System.out.println("Fetching data from cache");
	            
	            // TODO: Return the cached data for the given input.
	            return cache.get(input);
	            
	        }

	        if (realNetworkService == null) {
	            // TODO: Initialize the RealNetworkService if it has not been created yet.
	        	realNetworkService = new RealNetworkService();
	            
	        }
	        
	        // TODO: Fetch data from the real network service using the provided input.
	        Data = realNetworkService.fetchData(input);
	        
	        // TODO: Cache the fetched data with the input as the key for future access.
           cache.put(input, Data);
	    
	        // TODO: Return the fetched data to the client.
           return Data;
	    }

}
