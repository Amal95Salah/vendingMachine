package vendingMachine;

import java.util.Scanner;

import drivers.USDController;
import inputOutput.Card;
import inputOutput.Product;
import inputOutput.Snack;
import payments.ByCard;
import payments.ByCash;
import payments.Payment;
import drivers.Calculator;
import utilities.ScannerSingleton;
import utilities.SetUp;

public class Main {

//The machine has five rows to display snack items
static int row =5;
//Each row has 5 columns 
static int column  =5;

public static void main(String[] args){
	   Scanner scanner = ScannerSingleton.getScannerSingleton().getScanner();
           VendingMachine machineInterface = new SnackVendingMachine();
           Product snacks[][] = new Snack[row][column ];
           Calculator calculator = new Calculator();
           
           //Create dummy data for the vedning machine
           snacks= SetUp.initialize(row, column);
           
           //Vending Machine displays the products(Snacks)
           machineInterface.displayProducts(row, column, snacks);
           //Users enter on the Keypad the number of product they want
           int keypad[] = Keypad.enter(row,column);
           //The VendingMachine select the product
           machineInterface.selectProduct(snacks[keypad[0]][keypad[1]]);
           
           //The vending Machine check if the count of the product > 0 "the product is available"
           while(machineInterface.getSelectedProduct().getCount()<=0) {
        	   System.out.println("This product is not available, please select onther");
               machineInterface.displayProducts(row, column, snacks);
                keypad = Keypad.enter(row,column);
               machineInterface.selectProduct(snacks[keypad[0]][keypad[1]]);        	   
           }
           
           machineInterface.displayPaymentMessage();
           Payment payment;
           if(Integer.parseInt(scanner.nextLine()) == 1) { // pay by card
        	   payment = new ByCard();
           }
           else { // pay by cash
        	   payment = new ByCash();

           }
           payment.pay(machineInterface, calculator);
           // Count of this product must be decreased by 1
           machineInterface.getSelectedProduct().getSnack();
           // Vending Machine calculate the total by using its wallet
           machineInterface.displayTotalMessage();
           // The wallet return the change.
           calculator.getChange(machineInterface.getSelectedProduct());
           machineInterface.displayChangeMessage();
           
    }
}
