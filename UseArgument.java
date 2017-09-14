public class UseArgument {

	public static void main(String[] args) {
		System.out.print("Hi, ");
		System.out.print(args[2]);
		System.out.print(", ");
		System.out.print(args[1]);
		System.out.print(" and ");
		System.out.print(args[0]);
		System.out.print(".");
	}
}

// args[0] is the first argument entered into the command line,
// it is the first string in the array of arguments entered as commands