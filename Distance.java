public class Distance {
	
	public static void main(String[] args) {
	
	double x = Double.parseDouble(args[0]);
	double y = Double.parseDouble(args[1]);
	
	double D = Math.sqrt(x * x + y * y);
	
	System.out.println();
	System.out.println("The distance from the origin to point (x,y) is " + D);
	}
}
	
	
/*
1. Convert the given arguments, the x and y value, from strings to doubles using
 Double.parseDouble()/ parse the x and y value from the command line argument
2. Write down the formula for distance using these 2 variables
the formula is D = sqrt(x*x + y*y)
3. Print the result
*/