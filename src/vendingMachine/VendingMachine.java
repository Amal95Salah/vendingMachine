package vendingMachine;

import inputOutput.Product;

/**
 * Interface for any Vending Machine
 * 
 * @author amals
 *
 */
public interface VendingMachine {

void displayProducts(int row, int column, Product[][] products);

void selectProduct(Product product);

void displayEnterMoneyMessage();

void displayTotalMessage();

void displayPaymentMessage();

void displayCardNumberMessage();

boolean checkCardValidity(Long id);

Product getSelectedProduct();

void displayChangeMessage();

}