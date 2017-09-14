import java.util.Scanner;

public class Quadratic2 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the quadratic coefficient: ");
	
		double a = in.nextDouble();
		
		System.out.print("Please enter the linear coefficient: ");
		
		double b = in.nextDouble();
		
		System.out.print("Please enter the constant: ");
		
		double c = in.nextDouble();
		
		double D = b * b - 4 * a * c;
		
		double X1 = (-1 * b - Math.sqrt(D)) / (2 * a);
		
		double X2 = (-1 * b + Math.sqrt(D)) / (2 * a);
		
		System.out.println();
		System.out.println("The discriminant is " + D);
		System.out.println("The first root is " + X1);
		System.out.println("The second root is " + X2);
	}
}

/*
double D = b * b - 4 * a * c;
double X1 = (-1 * b + Math.sqrt(D)) / (2*a);
double X2 = (-1 * b - Math.sqrt(D)) / (2*a);
*/