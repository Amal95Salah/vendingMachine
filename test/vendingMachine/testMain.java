package vendingMachine;


import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.jupiter.api.Test;

class testMain {

	// Test invalid snack at first time, then select valid snack
	@Test
	void testInvalidSnackMain() {
	    String[] args = null;
	    String simulatedUserInput = String.format("87%s34%s0%s$50%s",System.lineSeparator(),System.lineSeparator(),System.lineSeparator(),System.lineSeparator());
	   
	    final InputStream original = System.in;
		System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

		Main.main(args);
	    System.setIn(original);
	    
	}
	
	//Test Valid Snack and pay with sufficient cash
	@Test
	void testValidSnackAndSufficientCash() {
	    String[] args = null;
	    String simulatedUserInput = String.format("34%s0%s$50%s",System.lineSeparator(),System.lineSeparator(),System.lineSeparator());
	   
	    System.out.print(simulatedUserInput);
	    final InputStream original = System.in;
		System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

		Main.main(args);
	    System.setIn(original);

	}

	//Test valid snack and pay in card
	@Test
	void testValidSnackPayByCard() {
	    String[] args = null;
	    String simulatedUserInput = String.format("34%s1%s123456847%s",System.lineSeparator(),System.lineSeparator(),System.lineSeparator());
	   
	    System.out.print(simulatedUserInput);
	    final InputStream original = System.in;
		System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

		Main.main(args);
	    System.setIn(original);

	}
}
