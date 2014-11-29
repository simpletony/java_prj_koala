import static net.mindview.util.Print.*;
import static net.mindview.util.Range.*;

class BreakAndContinue {
	
	public static void run(String[] args) {
		
		for (int i = 0; i < 100; i ++) {
			if (i == 74) break;
			if (i %9 != 0) continue;
			System.out.print(i + " ");
		}
		
		print();
		
		for (int i : range(100)) {
			if (i == 74) break;
			if (i%9 != 0) continue;
			System.out.print(i + " ");
		}
		
		print();
		int i = 0;
		
		while (true) {
			i ++;
			int j = i *27;
			if (j == 1269) break;
			if (i % 10 != 0) continue;
			System.out.print(i + " ");
		}
	}
}

class WhileTest {
	static boolean condition() {
		boolean result = Math.random() < 0.99;
		print(result + ",");
			return result;
	}
	
	static void main(String[] args) {
		while(condition())
			print("Inside 'while'");
		print("Exited 'while'");
	}
}

class ListCharacters {
	public static void main(String[] args) {
		
		for(char c = 0; c < 128; c ++) {
			if (Character.isLowerCase(c)) {
				print("value: " + (int) c + " character: " + c);
			}
		}
	}
	
}

class LabeledFor {
	
	public static void run(String[] args) {
		
		int i = 0;
//		outer;
		
	}
}
public class IfElse {
	static int result = 0;
	
	static void test(int testval, int target) {
		
		if (testval > target) {
			 result += 1;
		} else if (testval < target){
			result = -1;			
		} else {
			result = 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(10, 5);
		print(result);
		test(5, 10);
		print(result);
		test(5, 5);
		print(result);
		
		WhileTest.main(args);
		ListCharacters.main(args);
		BreakAndContinue.run(args);
	}

}
