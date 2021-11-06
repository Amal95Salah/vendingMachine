package payments;

import java.util.Scanner;

import drivers.Calculator;
import utilities.ScannerSingleton;
import vendingMachine.VendingMachine;

public class ByCard implements Payment {
	
	@Override
	public void pay(VendingMachine machineInterface, Calculator calculator) {
	     Scanner scanner = ScannerSingleton.getScannerSingleton().getScanner();

		machineInterface.displayCardNumberMessage();
      	 Long id =  Long.parseLong(scanner.nextLine());
      	 while(!machineInterface.checkCardValidity(id)) {
               machineInterface.displayCardNumberMessage();
      	 }
      	 
		   calculator.total = machineInterface.getSelectedProduct().getPrice();
		
	}

}
