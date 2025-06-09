package com.designPatterns.behavioural.templateMEthod.ReportGeneration;

public class EmployeeReport extends ReportTemplate {

	@Override
	protected void gatheringData() {
		// TODO Auto-generated method stub
		System.out.println("Gathered Employee data");
	}

	@Override
	protected void processingData() {
		// TODO Auto-generated method stub
		System.out.println("Processed Employee Data");
	}

}
