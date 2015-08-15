
public class OptionalTrailingArguments {


	static void printArray(int required, String... trailing) {
		System.out.print("required:" + required + " ");
		for (Object obj : trailing )
			System.out.print(obj + " ");
		System.out.println();	
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArray(1, "one");
		printArray(2, "two", "three");
		printArray(0);
	}

}
