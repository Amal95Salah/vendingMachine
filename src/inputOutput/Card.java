package inputOutput;


/**
 * VM accepts all cards
 * 
 * @author amals
 *
 */
public class Card {
	
	private long id; 
	private String bank;
	private int amount;
	
	
	public Card(long id, String bank, int amount) {
		this.id = id;
		this.bank = bank;
		this.amount = amount;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
