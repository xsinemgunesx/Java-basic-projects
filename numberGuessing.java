import java.util.Random;
import java.util.Scanner;

public class numberGuessing {

	public static void main(String[] args) {
		int guess,bell = 5,i =0;
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int number = random.nextInt(100);
		boolean game_state = false, error = false;
		int[] predictions = new int[5];
		
		System.out.println("Welcome to the number guessing game ! ");
		System.out.println("I kept a number between 0-99.");
		
		while (bell > 0) {
			System.out.println("Your guess : ");
			guess=scan.nextInt();
			
			
			if((guess < 0) || (guess >99)) {
				if(error) {
					System.out.println("You made too many inccorect entries, you lost a life.");
					System.out.println("Remaning life : "+ --bell);
				}
				else {
					error=true;
					System.out.println("Please enter a number between 0-99.");
				}
				continue;
			}
			predictions[i++] = guess;
			if (guess == number ) {
				game_state=true;
				break;
			}
			else {
				System.out.println("Wrong, please try again ! Remaning life : "+ --bell);
			}
		}
		
		if(game_state) {
			System.out.println("Correct guess,congrats !");
			System.out.println("Our number : "+ number);
			System.out.println("Remaning life  : " +bell);
		}
		else
		{
			System.out.println("You failed !");
		}
	}
}
