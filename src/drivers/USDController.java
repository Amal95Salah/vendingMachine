package drivers;

import inputOutput.Coin;
import inputOutput.Note;

/**
 * VM accepts only USD currency 
 * USDController validate the cash
 * USDController converted the change to be on format{50$, 20$, 1$, 50 cents, 20 cents and 10 cents
 * 
 * @author amals
 *
 */
public class USDController {
	
	  private static int dollar[] = {0,0};
	  private static int cent[] = {0,0,0,0};

	public static int validate(String cash) { // return the values in cent if its USD currency
		
	if(Coin.isExist(cash))
	{
			return Coin.valueOf(cash).getValue();
				
	}
	if(Note.isExist(cash))
	{
		return Note.valueOf(cash).getValue()*100;
				
	}
	return 0;
	}
	
	public static void returned(int dollars, int cents) {


		int dollar[]= {0,0};
		dollar[0] = dollars / 50;
		dollar[1] = (dollars%50) / 20;
		setDollar(dollar);

		cents = cents + (dollars%50) %20 *100;
		int cent[] = {0,0,0,0};
		cent[0]= cents/100;
		cent[1] = cents%100/50;
		cent[2] = cents%100%50/20;
		cent[3] = cents%100%50%20/10;
		setCent(cent);
		
				
	}

	public static int[] getDollar() {
		return dollar;
	}

	public static void setDollar(int[] dollar) {
		USDController.dollar = dollar;
	}

	public static int[] getCent() {
		return cent;
	}

	public static void setCent(int[] cent) {
		USDController.cent = cent;
	}
}
