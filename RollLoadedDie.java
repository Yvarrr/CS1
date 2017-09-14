public class RollLoadedDie {

	public static void main(String[] args) {
		
		int trials = Integer.parseInt(args[0]);
		int sixes = 0;
		int others = 0;

		// long roll;
		
		for (int t =0; t < trials; t++) {
			
			double a = Math.random();
			System.out.println(a);
				
			if (a < 0.625) others++;
				
				// roll = Math.round(1 + (Math.random() * 4));
			
			else sixes++;
				// roll = 6;
				
		}
		System.out.println("Percentage of others: " + others / trials  * 100.0);
		System.out.println("Percentage of sixes: " + (sixes / trials ) * 100.0);
		// System.out.println("You rolled a " + roll);
		
			
	}
}                                                 