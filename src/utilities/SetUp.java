package utilities;

import inputOutput.Product;

/**
 * To initialize the VM
 * Add product to VM {5,5}
 * 
 * @author amals
 *
 */
public class SetUp {

	 
    public static Product[][] initialize(int row, int column)
    {
        Product products[][] = new Product[row][column ];

        for(int i = 0; i< row; i++) {
     	   for(int j = 0; j< column ; j++) {
         	products[i][j] = new Product(i,j,150, 2,"snack",i+""+j);   //row, column, price, count

            }   
        }
        
        // make one product is not available
        products[3][3].setCount(0);
        return products;
    }
}
