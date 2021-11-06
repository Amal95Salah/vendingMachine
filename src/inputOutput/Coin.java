package inputOutput;

/**
 * VM accepts coins 10c, 20c, 50c and 1$
 * 
 * @author amals
 *
 */
public enum Coin {
	  c10(10),  c20(20), c50(50), $1(100);

    private int value;

    Coin(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
    
    //Check if this card is one of {10c,20c,50c,1$}
    public static Boolean isExist(String coin) {
        for(Coin item : Coin.values()) {
            if(coin.equals(item.toString())) {
                return true;
            }
        }
        return false;
    }
}
