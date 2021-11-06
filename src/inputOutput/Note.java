package inputOutput;

/**
 * VM accepts cards 20$ and 50$
 * 
 * @author amals
 *
 */
public enum Note {
	  $20(20), $50(50);

    private int value;

    Note(int value){
        this.value = value;
    }
    
    public int getValue(){
        return this.value;
    }
    
    //Check if this card is one of {20$ and 50$}
    public static Boolean isExist(String card) {
        for(Note item : Note.values()) {
            if(card.equals(item.toString())) {
                return true;
            }
        }
        return false;
    }
}
