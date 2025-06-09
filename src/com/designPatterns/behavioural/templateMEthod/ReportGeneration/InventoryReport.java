package com.designPatterns.behavioural.templateMEthod.ReportGeneration;

public class InventoryReport extends ReportTemplate {

	@Override
	protected void gatheringData() {
		// TODO Auto-generated method stub
		System.out.println("Gatherd inventory Data");
	}

	@Override
	protected void processingData() {
		// TODO Auto-generated method stub
		System.out.println("Processed inventory Data");

	}

}
