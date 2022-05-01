import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		int numb1,numb2,selection;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		numb1=scan.nextInt();
		System.out.print("\nEnter the second number : ");
		numb2=scan.nextInt();
		System.out.println("\nPlease select the action you want to do : ");
		System.out.println("1-Addition\n2-Extraction\n3-Impact\n4-Divide");
		System.out.println("Your choose : ");
		selection=scan.nextInt();
		
		if(selection == 1) {
			System.out.println("Addition : " +(numb1+numb2));
		}
		else if(selection == 2) {
			System.out.println("Extraction : "+(numb1-numb2));
			
		}
		else if(selection == 3) {
			System.out.println("Impact : "+(numb1*numb2));
			
		}
		else if(selection == 4) {
			if(numb2 == 0) {
				System.out.println("The second number is equal to 0 and the result is uncertain.");
			}
			else {
				System.out.println("Divide : "+(numb1/numb2));
			}
		}
		else {
			System.out.println("You entered an invalid transaction.");
		}
		
		
	}

	
}
