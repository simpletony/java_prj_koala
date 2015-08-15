

public class OverloadingVarargs2 {
	static void f(float i, Character... args) {
		System.out.println("first");
	}
	static void f(char c, Character... args) {
		
		System.out.print("second");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(1, 'a');
		f('a','b');
		Spiciness howHot = Spiciness.MEDIUM;
		
		System.out.println(howHot);
		
		
		for (Spiciness s: Spiciness.values()) {
			System.out.println(s + ", ordinal " + s.ordinal());
		}
	}

}
