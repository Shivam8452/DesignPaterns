package com.SOLIDPricniples.OCP;

import java.util.ArrayList;
import java.util.HashMap;

public class PaymentService {
	
	private HashMap<String, PaymentMethod> pm;
	
	public PaymentService() {
		// TODO Auto-generated constructor stub
		pm = new HashMap();
	}
	
	public void addPayment(String name, PaymentMethod pmm) {
		pm.put(name, pmm);
	}
	
	public void makePayment(String name) {
		PaymentMethod pms = pm.get(name);
		pms.pay();
	}
	
	

}
