
public class DynamicArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Other.main(new String[]{"fiddle", "de", "dum"});
	}

}

class Other {
	
	public static void main(String[] args) {
		
		for (String s : args) {
			
			System.out.print(s + " ");
		}
	}
}