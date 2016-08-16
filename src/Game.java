import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
    public static void main(String[] args) throws IOException {
    	int correctNum;
    	int guessCounter = 0;
    	int guess;
    	String name;
    	BufferedReader mInput = new BufferedReader(new InputStreamReader(System.in));
    	
    	System.out.printf("ADMINISTRATOR SETUP%n" + "-------------------%n");
    	System.out.println("What is the name of the item that will go in the jar?");
    	name = mInput.readLine();
    	
    	System.out.printf("What is the maximum number of %ss that can go in the jar?%n", name);
    	int max = Integer.parseInt(mInput.readLine());
    	
        Jar jar = new Jar(name, max);       
        correctNum = jar.fill();
        
        System.out.printf("PLAYER%n" + "------%n");
        System.out.printf("How many %ss do you think are in the jar?"
				+ "%nPick a number between 1 and %d.%n", name, jar.getMax());
        
        do {
        	guess = Integer.parseInt(mInput.readLine());
        	guessCounter++;
        	if (guess > correctNum) {
        		System.out.printf("%d is too high.%n", guess);
        	} else if(guess < correctNum) {
        		System.out.printf("%d is too low.%n", guess);
        	} else {
        		System.out.printf("%d is correct! It took you %d guess(es) to get it right.", guess, guessCounter);
        	}
        } while (guess != correctNum);
    }
}

