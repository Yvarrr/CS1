public class AngleConverter {

	public static void main(String[] args) {
		
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);    
		
		double aConverted = Math.toRadians(a);
		double bConverted = Math.toDegrees(b);
		
		System.out.println();
		System.out.println("The angle is " + aConverted + " radians.");
		System.out.println("The angle is " + bConverted + " degrees.");    
		}
}