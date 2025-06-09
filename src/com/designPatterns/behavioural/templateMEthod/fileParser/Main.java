package com.designPatterns.behavioural.templateMEthod.fileParser;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSVParser csvParser = new CSVParser();
		csvParser.parser();
		
		JSONParser jsonParser = new JSONParser();
		jsonParser.parser();
	}

}
