// Importing Random java package
import java.util.Random;
public class LuckyFive {
    public static void main (String[] args) {
        // creating a Random object called 'randomGen'
        Random randomGen = new Random();
        // Generating a number between 1 and 6
        int dieRoll = randomGen.nextInt(6) + 1;
        // Creating a while loop where it continues running
        // as long as dieRoll does not equal 5
        while (dieRoll != 5) {
            System.out.println(dieRoll);
            // Here we reset dieRoll with a new random value
            // otherwise we will get an infinite loop.
            dieRoll = randomGen.nextInt(6) +1;
        }
    }
    
}
