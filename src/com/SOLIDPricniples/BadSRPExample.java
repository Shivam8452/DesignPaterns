package com.SOLIDPricniples;

public class BadSRPExample {
          private double amount;
          
          public BadSRPExample(double amount) {
        	  this.amount=amount;
          }
          
          public void generateInnovice() {
        	  System.out.println("Generated the inovice for amount: "+amount);
          }
          
          public void emailService() {
        	  System.out.println("Sending email");
          }
          
          public void saveToDatabase() {
        	  System.out.println("Saving to database");
          }
}
