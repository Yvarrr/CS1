import java.util.Scanner;

public class ValueSwitcher {
	
	public static void main(String[] args) {
		//Initialise a Scanner to read from the command line
		Scanner in = new Scanner(System.in);
		
		//Tell the user what you want
		System.out.print("Please enter your first name: ");
		
		//Collect the input
		String FirstName = in.next();
		String FirstName2 = FirstName;
		
		//Tell the user what you want
		System.out.print("Please enter your last name: "); 
		
		//Collect the input
		String LastName = in.next();
		
		//Give some output
		System.out.println(FirstName + " " + LastName);
		
		//Switch the values of the two variables
		FirstName = LastName;
		LastName = FirstName2;
		
		System.out.println(FirstName + " " + LastName);
	}
}