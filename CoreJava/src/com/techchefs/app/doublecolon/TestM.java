package com.techchefs.app.doublecolon;

import lombok.extern.java.Log;

@Log
public class TestM {

	public static void main(String[] args) {
		MyProduct mp = Product :: new;
		
		Product p = mp.getProduct("Product name", 25.5);
		
		log.info("Name is "+p.name);
		log.info("cost is "+p.price);
	}

}
