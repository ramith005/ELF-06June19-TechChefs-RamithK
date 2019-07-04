package com.techchefs.javaassessment;

/**
 * 
 * @author Ramith
 * 9)	WAP to display the list of products by type or by the given range. (Using Lambda and Stream)
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class TestProduct {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		ProductNew p1 = new ProductNew (1, "Sony Music System", ProductType.ELECTRONICS, 7500);
		ProductNew p2 = new ProductNew (2, "Prestige Cooker", ProductType.AUTO_ACCESSORIES,  1500);
		ProductNew p3 = new ProductNew (3, "Double bedsheet", ProductType.FURNISHING,2500);
		ProductNew p4 = new ProductNew (4, "Stove", ProductType.KITCHEN, 3500);
		ProductNew p5 = new ProductNew (5, "Mixer/Grinder", ProductType.KITCHEN, 5500);
		ProductNew p6 = new ProductNew (6, "Car Shampoo", ProductType.AUTO_ACCESSORIES,700);
		ProductNew p7 = new ProductNew (7, "Curtains", ProductType.FURNISHING,7000);
		ProductNew p8 = new ProductNew (8, "Windsheild wipers", ProductType.AUTO_ACCESSORIES,1700);
		ProductNew p9 = new ProductNew (9, "Dewan bedsheet set", ProductType.FURNISHING,2500);
		ProductNew p10 = new ProductNew (10, "Chimney Stove combo", ProductType.KITCHEN, 12500);
		

		ArrayList<ProductNew> productList = new ArrayList<>();
		
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		productList.add(p5);
		productList.add(p6);
		productList.add(p7);
		productList.add(p8);
		productList.add(p9);
		productList.add(p10);
		
		log.info("List of products by Type - Kitchen");		
		
		List<ProductNew> kitchenProducts = productList.stream().filter(p -> p.getType().equals(ProductType.KITCHEN)).collect(Collectors.toList());
		kitchenProducts.forEach( p -> log.info(p.toString()));
		
		log.info("List of products by Type - Furnishing");		
		
		List<ProductNew> furnishingProducts = productList.stream().filter(p -> p.getType().equals(ProductType.FURNISHING)).collect(Collectors.toList());
		furnishingProducts.forEach( p -> log.info(p.toString()));

		log.info("List of products by range");		
		List<ProductNew>productsinRange = filterByRange(5000, 10000, productList);
		productsinRange.forEach( k -> log.info(k.toString()));
		
		
		
	}
	
	static List<ProductNew> filterByRange(double lowerRange, double higerRange, ArrayList<ProductNew> productList) {
		
		return productList.stream().filter( s -> s.getCost() >= lowerRange).filter( s -> s.getCost() <= higerRange).collect(Collectors.toList());		
		
	}

}
