package payments;

import java.util.Scanner;

import drivers.Calculator;
import drivers.USDController;
import utilities.ScannerSingleton;
import vendingMachine.VendingMachine;

public class ByCash implements Payment {

	
	@Override
	public void pay(VendingMachine machineInterface,Calculator calculator) {
	     Scanner scanner = ScannerSingleton.getScannerSingleton().getScanner();
	    // Allow user to enter the money "coins or cards"
        machineInterface.displayEnterMoneyMessage();
        //  The USD controller of the vending machine validate the money
        while (!(calculator.total >= machineInterface.getSelectedProduct().getPrice())) {
            String allCash = scanner.nextLine(); // coins and notes
            if(USDController.validate(allCash) == 0) {
            System.out.print("The machine acceptes only USD currency");
            }
            calculator.total = calculator.total + USDController.validate(allCash);
        }
	}
}
