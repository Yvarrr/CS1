public class SpringSeason {

	public static void main(String[] args) {
		int d = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		boolean isSpring; // declares the variable without assigning it a value
		
		isSpring = (d >= 21 && m == 3);
		
		isSpring = isSpring || (m == 4) || (m == 5);
		
		isSpring = isSpring || (d <= 21 && m == 6);
		
		if (isSpring) System.out.println("It's spring");
		else System.out.println("It's not spring");         
		
		//System.out.println(isSpring);
	}
}

/*
1. Let the variables m and d be the arguments taken from the command line
2. Let spring = true if its spring
3. Print result
*/