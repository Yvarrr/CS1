public class Sqrt {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		
		double t = 10;
		for (int i = 1; x != x/t; i++) {
			t = (t + x/t)/2.0;
	}
	System.out.println("The square root of " + x + "is " + t);
	}
}