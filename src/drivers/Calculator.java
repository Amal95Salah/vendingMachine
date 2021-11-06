package drivers;

import inputOutput.Product;

/**
 * 
 * Calculator for VM to calculate total and the change
 * 
 * @author amals
 *
 */
public class Calculator {
	public static int total;
	public static int[] change= {0,0};
	    
	    public static void getChange(Product product) {
	    	 change[0] = (total - product.getPrice())/100;
	    	change[1] = (total - product.getPrice())%100;   	
	    	}
}
