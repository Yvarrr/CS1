public class HarmonicNumber {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);
		
		double result = 0;
		for (int i = 1; i <= n; i++) {
		result = result + 1.0/i; //1.0 instead of 1 because the value needs to be a double, when using integer 1/1 will equal 1, 1/2 and 1/n+2 will all equal 0
		}						// or result += 1.0/i;
	System.out.println(result);
	}
}