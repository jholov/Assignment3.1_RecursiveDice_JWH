/**
 * Class to test a dice and set the number of times 
 * you want to roll it
 * @author Jake Holovka
 *
 */
public class RecDieRollerDriver {
	

	public static void main(String[] args) {
		
		RecDieRoller dice = new RecDieRoller();
		
		for (int i=0; i<=1000; i++) {
		
			dice.roll(6);
			
		}//end for loop
		
		System.out.println("Mean of dice rolls: "+dice.calMean(1000));
		
	}//end main 

}//end class
