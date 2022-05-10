import java.util.Scanner;

public class taskagitMakas {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int user_score = 0;
		int comp_score = 0;
		System.out.println("Welcome to rock,paper,scissors game !");
		System.out.println("1-Rock\n2-Paper\n3-Scissors");
		System.out.print("Kaç el oynamak istersiniz : ");
		int el=scan.nextInt();
		while(true) {
			System.out.print("Your choose : ");
			int choose = scan.nextInt();
			int comp_choose = (int)(Math.random()*3);
			if(choose == 1) {
				if(comp_choose == 1) {
					System.out.println("The computer's choose is Rock.\nResult : Draw ");
					System.out.println("Your score : "+user_score);
					System.out.println("The computer's score : "+comp_score);
					
				}
				else if(comp_choose == 2) {
					System.out.println("The computer's choose is Paper.\nResult : You're lost.");
					comp_score++;
					System.out.println("Your score : "+user_score);
					System.out.println("The computer's score : "+comp_score);
				}
				else {
					System.out.println("The computer's choose is Scissors.\nResult : You're win !");
					user_score++;
					System.out.println("Your score : "+user_score);
					System.out.println("The computer's score : "+comp_score);
					
				}
			}
			if(choose == 2) {
				if(comp_choose == 1) {
					System.out.println("The computer's choose is Rock.\nResult : You're lost ");
					comp_score++;
					System.out.println("Your score : "+user_score);
					System.out.println("The computer's score : "+comp_score);
					
				}
				else if(comp_choose == 2) {
					System.out.println("The computer's choose is Paper.\nResult : Draw.");
			
					System.out.println("Your score : "+user_score);
					System.out.println("The computer's score : "+comp_score);
				}
				else {
					System.out.println("The computer's choose is Scissors.\nResult : You're win !");
					user_score++;
					System.out.println("Your score : "+user_score);
					System.out.println("The computer's score : "+comp_score);
					
				}

				
			}
			if(choose == 3) {
				if(comp_choose == 1) {
					System.out.println("The computer's choose is Rock.\nResult : You're win ! ");
					user_score++;
					System.out.println("Your score : "+user_score);
					System.out.println("The computer's score : "+comp_score);
					
				}
				else if(comp_choose == 2) {
					System.out.println("The computer's choose is Paper.\nResult : You're lost.");
					comp_score++;
					System.out.println("Your score : "+user_score);
					System.out.println("The computer's score : "+comp_score);
				}
				else {
					System.out.println("The computer's choose is Scissors.\nResult : Draw");
					System.out.println("Your score : "+user_score);
					System.out.println("The computer's score : "+comp_score);
					
				}
				
			}
			
		}
		
		
	}
	

}
