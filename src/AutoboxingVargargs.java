
public class AutoboxingVargargs {

	public static void f(Integer...  args) {
		
		for (Integer i: args) {
			System.out.print(i + " ");
		}
		
		System.out.println();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(new Integer(1), new Integer(2));
		f(4,5,6,7,8,9);
		f(10, new Integer(11), 12);
		
	}

}
