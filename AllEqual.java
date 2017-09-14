public class AllEqual {

	public static void main(String[] args) {
		
		int a,b,c;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		c = Integer.parseInt(args[2]);
		
		if (a == b && b == c) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
	}
}