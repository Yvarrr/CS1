public class SumOfTwoDice {

	public static void main(String[] args) {
		
	double a = Math.random();
	double b = (a * 5) + 1;
	long c = Math.round(b);
	// System.out.println(a);
	// System.out.println(b);
	// System.out.println(c);
	
	double d = Math.random();
	double e = (d * 5) + 1;
	long f = Math.round(e);
	
	System.out.println(c + f);
	}
}
		
		
		
		
		
		
/*
1. Generate random number
2. Make the random number an integer between 1 and 6
3. Sum them up
4. Display the result
*/