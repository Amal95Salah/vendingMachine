package inputOutput;

/**
 * Products the inside the VM
 * every product has row, column, price, count ,code and name
 * with setters and getters
 * getSnack is to decrease the count by 1 when the user successfully buy one  
 * @author amals
 *
 */

public class Product {

    private int row;
	private int column;
    private int price;
    private int count;
    private String name;
    private String code; // code that user use to purchase

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Product(int row, int column, int price, int count, String name,String code){
        this.row = row;
        this.column = column;
        this.price = price;
        this.count = count;
        this.name = name;
        this.code = code;
    }

    public int getRow(){
        return row;
    }

    public int getPrice(){
        return this.price;
    }
    
    public int getCount(){
        return this.count;
    }
    public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setRaw(int row) {
		this.row = row;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setCount(int count) {
		this.count = count;
	}
    
    public void addProduct(int count) {
    	this.count =+ count;
    }
	
	public void getSnack() {
		this.count--;
	}

	
}
