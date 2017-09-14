import java.util.Scanner;

public class AreaTriangle {
	
	public static void main(String[] args) {
		//Initialise a Scanner to read from the command line
		Scanner in = new Scanner(System.in);
		
		//Tell the user what you want
		System.out.print("Please enter the width of the triangle ");
		
		//Collect the input
		int width = in.nextInt();
		
		//Tell the user what you want
		System.out.print("Please enter the height of the triangle ");
		
		//Collect the input
		int height = in.nextInt();
		
		//Give some output
		System.out.println("The area of the triangle is " + 0.5*width*height);
	}
}