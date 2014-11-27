import static net.mindview.util.Print.print;

import  java.util.*;

//
//class TernaryIfElse {
//	static int ternary(int i) {
//		return i < 10 ? i * 100 : i * 10;
//	}
//	
//	static int standardIfElse(int i) {
//		if (i < 10) {
//			return i * 100;
//		} else { 
//			return i * 10;
//		}
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		print(ternary(9));
//		print(ternary(10));
//		print(standardIfElse(9));
//		print(standardIfElse(10));		
//	}
//
//}

class ShowProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperties().list(System.out);
	      System.out.println(System.getProperty("user.name"));
	      System.out.println(
	          System.getProperty("java.library.path"));
	}

}

/** The first Thinking in Java example program.
 * Displays a string and today's date.
 * @author Bruce Eckel
 * @author www.MindView.net
 * @version 4.0
*/
public class HelloDate {
	/** Entry point to class  application.
	 * @param args array of string arguments
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     System.out.print("Hello, it's: ");
	     System.out.println(new Date());
	     
	     ShowProperties.main(args);
//	     TernaryIfElse.main(args);
	}
}
