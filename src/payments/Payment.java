package payments;

import drivers.Calculator;
import vendingMachine.VendingMachine;

public interface Payment {
	void pay(VendingMachine machineInterface,Calculator calculator);
}
