package vendingMachine;

import java.util.Scanner;

import utilities.ScannerSingleton;

/** Keypad class 
 * User can select the product by using the Keypad
 * Keypad checks if the input is valid of Vending Machine (5,5)
 * 
 * @author amals
 *
 */
public class Keypad {

	 
    public static int[] enter(int row, int column)
    {
 	     Scanner scanner = ScannerSingleton.getScannerSingleton().getScanner();
 	     int keypad[]= {0,0};
    	 String selectedProductString = scanner.nextLine();
         keypad[0] = Integer.parseInt(selectedProductString)/10;
         keypad[1] = Integer.parseInt(selectedProductString)%10;
         while(keypad[0] >= row || keypad[0] < 0 || keypad[1] >= column || keypad[0] < 0) {
        	 System.out.print("You chose product out the range, please insert valid product");
        	 selectedProductString = scanner.nextLine();
             keypad[0] = Integer.parseInt(selectedProductString)/10;
             keypad[1] = Integer.parseInt(selectedProductString)%10;	 
         }
         
         return keypad;
    }
}
