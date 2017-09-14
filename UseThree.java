import java.util.Scanner;

public class UseThree

{
	public static void main ( String[] args )
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please type the first name: ");
		String FirstName = in.next();
		
		System.out.println("Please type the second name: ");
		String SecondName = in.next();
		
		System.out.println("Please type the third name: ");
		String ThirdName = in.next();
		
		System.out.println("Hello " + FirstName + ", " + SecondName + ", " + ThirdName + ".");
		
		
	}
}