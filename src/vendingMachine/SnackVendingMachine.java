package vendingMachine;

import drivers.USDController;
import inputOutput.Product;
import drivers.Calculator;

/**
 * Vending Machine dedicated to snacks
 * 
 * @author amals
 *
 */
public class SnackVendingMachine implements VendingMachine {

    private Product selectedProduct;
    
    @Override
    public Product getSelectedProduct() {
		return selectedProduct;
	}


    // Display all product the vending machine has by its name
    @Override
    public void displayProducts(int row, int column, Product[][] products) {
        System.out.println(" *********************************************");
        System.out.println("     WELCOME TO THE VENDING MACHINE           ");
        System.out.println(" *********************************************");
        System.out.println("            Products available:               ");
        System.out.println("                                              ");
        System.out.println();
        for(int j =0; j< column ; j++) {    
        for(int i =0; i< row ; i++) {    	   
            System.out.print(products[j][i].getName()+"_"+products[j][i].getCode() + '\t'); 
         } 
        System.out.println(); 

        }
        
        
        System.out.println("                                              ");
        System.out.println(" Please select your product: (code) like 01 ");


    }

    // Select the product and display the price
    @Override
    public void selectProduct(Product product) {
        this.selectedProduct = product;
        System.out.println("The price of " + product.getName() + " is " + product.getPrice()+"cents");
    }

    @Override
    public void displayPaymentMessage() {
    	System.out.println("Do you want to pay by card? if yes please press 1, if no press 0");
    	
    }
    
    @Override
   public void displayCardNumberMessage() {
    	System.out.println("please Enter a valid card Id");

    }
    
    //Should be an API contact with the bank to check if it is valid and the amount
    @Override
    public boolean checkCardValidity(Long id) {
    return true;
    }

    
    //Allow users to enter the money coins or cards
    @Override
    public void displayEnterMoneyMessage() {  	
        System.out.println(" The Machine accepts only USD Currency: c10, c20, c50, $1, $20, $50 ");
        System.out.println("Plese enter money:\n");

    }

    // Calculate the total by invoke the wallet of the vending machine
    @Override
    public void displayTotalMessage() {
        System.out.print("The total you entered is: "+Calculator.total+ " cents");
    }
    
    // return the change in format {50$, 20$, 1$, 50 cents, 2cents, 10 cent}
    @Override
    public void displayChangeMessage() {
        System.out.println("                                              ");
        System.out.println("Your change is: "+ Calculator.change[0]+" dollars and  " + Calculator.change[1]+ " cents");
        USDController.returned(Calculator.change[0], Calculator.change[1]);
        System.out.println("\ncard_50$: "+ USDController.getDollar()[0] + "\t card_20$: " + USDController.getDollar()[1]+
        "\n"+"coin_1$: "+ USDController.getCent()[0] + " \t coin_50c: " + USDController.getCent()[1]+ "\t coin_20c: " +USDController.getCent()[2]+
        " \t coin_10c: "+ USDController.getCent()[3]); 

    }
}
