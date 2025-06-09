package com.designPatterns.behavioural.templateMEthod.ReportGeneration;

abstract public class ReportTemplate {
	
	public final void generateReport() {
		gatheringData();
		processingData();
		formattingReport();
		printingData();
	}
	
	abstract protected void gatheringData();
	abstract protected void processingData();
	protected void formattingReport() {
		System.out.println("Formatting the report with appropriate layout and style.");
	}
	
	protected void printingData() {
		System.out.println("Printing the report for final review and distribution.");
	}
}
