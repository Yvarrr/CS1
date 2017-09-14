public class Quadratic
{
	public static void main (String[] args)
	{
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		double D = b * b - 4 * a * c;
		double X1 = (-1 * b + Math.sqrt(D)) / (2*a);
		double X2 = (-1 * b - Math.sqrt(D)) / (2*a);
		
		System.out.println("D = " + D);
		System.out.println("X1 = " + X1);
		System.out.println("X2 = " + X2);
	}
}


/*

ax^2 + bx + c = 0

D = b^2 - 4ac

x = (-b +- sqrt(D)/2a

1. Ask the command prompt for values of the integer variables a, b and c (using scanner)
/ run the program as java Quadratic a b c
2. Declare the values of the variables as the given arguments
3. Use the variables in the calculation
4. Display the solution in the command promt
*/