import java.util.Scanner;

public class StartFromHere {
	
	public static void main(String[] args) {
		//Initialise a Scanner to read from the command line
		Scanner in = new Scanner(System.in);
		
		//Tell the user what you want
		System.out.print("Please enter the x^2 term ");
		
		//Collect the input
		int number = in.nextInt();
		
		//Give some output
		System.out.println("This is your number: " + number);
	}
}
		