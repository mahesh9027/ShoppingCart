package com.niit.ShoppingCart;

import javax.naming.Context;
import javax.naming.ContextNotEmptyException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {

	public static void main(String[] args){
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("com.niit.shoppingcart");
		context.refresh();
		
	Product p = (Product) context.getBean("product");	
	
	Category c = (Category) context.getBean("catObject");

	

	

	}
}

