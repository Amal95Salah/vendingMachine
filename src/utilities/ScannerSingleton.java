package utilities;

import java.util.Scanner;

public class ScannerSingleton {

	private Scanner scanner;
	private static ScannerSingleton scannerSingleton;
	
	private ScannerSingleton() {
		scanner = new Scanner(System.in);
	}
	
	public static ScannerSingleton getScannerSingleton() {
		if (scannerSingleton == null) {
			scannerSingleton = new ScannerSingleton();
		}
		
		return scannerSingleton;
	}
	
	public Scanner getScanner() {
		return this.scanner;
	}
}
