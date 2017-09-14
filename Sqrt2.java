public class Sqrt2 {

	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		double epsilon = 1e-15;
		double t = x;
		
		while (Math.abs(t - x/t) > epsilon*t){
			t = (t + x/t) / 2.0;
		}
		System.out.println("The square root of " + x +" is " + t);
	}
}                                         