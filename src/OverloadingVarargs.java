
public class OverloadingVarargs {

	static void f(Character... args) {
		
		System.out.print("first");
		for(Character c: args) {
			System.out.print(" " + c);
			System.out.println();
		}
	}
	
    static void f(Integer... args) {
		
		System.out.print("second");
		for(Integer c: args) {
			System.out.print(" " + c);
			System.out.println();
		}
	}
    
    static void f(Long... args) {
		
		System.out.println("third");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f('a', 'b', 'c');
		f(1);
		f(2,1);
		f(0);
		f(0L);
		
	}

}
