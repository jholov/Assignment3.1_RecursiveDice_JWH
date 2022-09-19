import java.util.Random;
/**
 * This class creates a dice that rolls and tracks 
 * the amount of times it hits a certain side
 * @author Jake Holovka
 *
 */
public class RecDieRoller {
	
	Random rand = new Random();
	int counter = 0;
	int mean = 0;
	/**
	 * Rolls a die and tracks how many times 
	 * a 2 is hit
	 * @param number of sides on die
	 * @return 
	 */
	public int roll (int sides) {
		
		int die = rand.nextInt(sides)+1;
	
		System.out.println(die);
		counter =counter +1;
		
		if (die != 2) {
				
			roll(sides);
			
		}else if (die == 2) {
			
			System.out.println("Count to get a 2: "+counter);
			mean = counter + mean;
			counter=0;
		}	
			return die;
			
	}//end roll
	/**
	 * calculates the mean of how many rolls
	 * it takes a dice to hit a 2
	 * @param Numrolls
	 * @return
	 */
	public int calMean (int Numrolls) {
		int rMean = 0;
		
		rMean = mean/ Numrolls;
		
		return rMean;
	}//end calMean
	
}//end class
