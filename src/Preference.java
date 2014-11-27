import static net.mindview.util.Print.print;

import java.util.Random;

class MathOps {
    public static void main(String [] args) {
        Random rand = new Random(74);
        int i, j, k;
        j = rand.nextInt(100) + 1;
        print("j : " + j);
        k = rand.nextInt(100) + 1;
        print("k : " + k);
        i = j + k;
        print("j + k : " + i );
        i = j - k;
        print("j - k : " + i );
        i = k/j;
        print("k/j : " + i );
        i = k*j;
        print("k*j : " + i );
        i = k%j;
        print("k%j : " + i );
        j %= k;
        print("j%= k : " + j );
// Floating - point number tests
        float u, v, w;
        v = rand.nextFloat();
        print("v : " + v );
        w = rand.nextFloat();
        print("w : " + w );
        u = v + w;
        print("v + w : " + u);
        u = v - w;
        print("v - w : " + u);
        u = v * w;
        print("v * w : " + u);
        u = v / w;
        print("v / w : " + u);
// The following also works for char,
// byte, short, int, long, and double
        u += v;
        print("u += v : " + u);
        u -= v;
        print("u -= v : " + u);
        u *= v;
        print("u *= v : " + u);
        u /= v;
        print("u /= v : " + u);
    } 
}

class Tank {
   int level;
}

class Letter {
	  char c;
	}

class PassObject {
   static void f(Letter y) {
      y.c = 'z';
   }

	public static void main1(String [] args) {
	   Letter x = new Letter();
	   x.c = 'a';
	   print("1: x.c: " + x.c);
	   f(x);
	   print("2: x.c: " + x.c);
	}
}

class AutoInc {
	public static void main1(String[] args) {
		
		int i = 1;
		print("i :" + i);
		print("++ i :" + ++i);
		print("i ++ :" + i++);
		print("i :" + i);
		print("--i :" + --i);
		print("i-- :" + i--);
		print("i :" + i);
	}

}


class Assignment {
	
   public static void main(String [] args) {
       Tank t1 = new Tank();
       Tank t2 = new Tank();
       t1.level = 9; 
       t2.level = 47;
       print("1: t1.level: " +  t1.level +  ",  t2.level: " + t2.level);
       t1 = t2;
       print("2: t1.level: " +  t1.level +  ",  t2.level: " + t2.level);
       t1.level = 27;
       print("3: t1.level: " +  t1.level +  ",  t2.level: " + t2.level);
       
       PassObject.main1(args);
       AutoInc.main1(args);
   }
}


class Bool {
	public static void main(String[] args) {
		
		Random rand = new Random(47);
		int i = rand.nextInt(100);
		int j = rand.nextInt(100);
		print("i = " + i);
		print("j = " + j);
		print("i > j is " + (i > j));
		print("i < j is " + (i < j));
		print("i >= j is " + (i >= j));
		print("i <= j is " + (i <= j));
		print("i == j is " + (i == j));
		print("i != j is " + (i != j));
		print("(i < 10) && (j < 10) is " + ((i < 10) && (j < 10)));	
		print("(i < 10) || (j < 10) is " + ((i < 10) || (j < 10)));	
	}
}


class Value {
	int i;
}

class EqualsMethod {

	public static void main1(String[] args) {
		
		Integer n1 = new Integer(47);
		Integer n2 = new Integer(47);	
		System.out.println(n1.equals(n2));
	}
	public static void main2(String[] args) {
		
		Value n1 = new Value();
		Value n2 = new Value();
		n1.i = n2.i = 100;
		System.out.println(n1.equals(n2));
	}
}


class Equivalence {

	public static void main(String[] args) {
		
		Integer n1 = new Integer(47);
		Integer n2 = new Integer(47);		
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		
		
		EqualsMethod.main1(args);
		EqualsMethod.main2(args);
	}

}


class ShortCircuit {

	public static void main(String[] args) {
		
		boolean b = test1(0) && test2(2) && test3(2);
		print("expression is " + b);
	}
	static boolean test1(int val) {
		print("test1(" + val + ")");
		print("result: " + (val < 2));
		return val < 1;
	}
	static boolean test2(int val) {
		print("test2(" + val + ")");
		print("result: " + (val < 2));
		return val < 2;
	}
	static boolean test3(int val) {
		print("test3(" + val + ")");
		print("result: " + (val < 3));
		return val < 3;
	}
}

class Exponents {
	public static void main(String[] args) {
		
		float expFloat = 1.39e-43f;
        expFloat = 1.39E-43f;
        System.out.println(expFloat);
        double expDouble = 47e47d;
        double expDouble2 = 47e47;
        System.out.println(expDouble);
	}

}

class Literals {

	public static void main(String[] args) {
		
		int i1 = 0x2f;
		print("i1: " + Integer.toBinaryString(i1));
		int i2 = 0x2F;
		print("i2: " + Integer.toBinaryString(i2));
		int i3 = 0177;
		print("i3: " + Integer.toBinaryString(i3));
		char c = 0xffff;
		print("c: " + Integer.toBinaryString(c));
		byte b = 0x7f;
		print("b: " + Integer.toBinaryString(b));
		short s = 0x7fff;
		print("s: " + Integer.toBinaryString(s));


		long n1 = 200L;
		long n2 = 200l;
		long n3 = 200;
		float f1 = 1;
		float f2 = 1F;
		float f3 = 1f;
		double d1 = 1d;
		double d2 = 1D;

	}

}


class URShift {

	public static void main1(String[] args) {
		
		int i = -1;
		print(Integer.toBinaryString(i));
		
		i >>>= 10;
		print(Integer.toBinaryString(i));
		
		long l = -1;
		print(Long.toBinaryString(l));
				
		l >>>= 10;
		print(Long.toBinaryString(l));
				
		short s = -1;
		print(Integer.toBinaryString(s));
		
		s >>>= 10;
		print(Integer.toBinaryString(s));
				
		byte b = -1;
		print(Integer.toBinaryString(b));
		
		b >>>= 10;
		print(Integer.toBinaryString(b));
		
		b = -1;
		print(Integer.toBinaryString(b));

		print(Integer.toBinaryString(b >>> 10));
	}

}

class StringOperators {

	public static void main(String[] args) {
		
		int x = 0, y = 1, z = 2;
		String s = "x, y, z ";
		print(s + x + y + z);
		print(x + " "  + s);
		s += "(summed) = ";
		print(s+ (x + y + z));
		print("" + x);
		
		URShift.main1(args);
	}

}
//
//// Tests all the operators on all the primitive data types
//// to show which ones are accepted by the Java compiler.
//
//class AllOps {
//	
//	// To accept the results of a boolean test:
//	void f(boolean b) {}
//	void boolTest(boolean x, boolean y) {
//		// Arithmetic operators:
//		//! x = x * y;
//		f(x == y);
//		f(x != y);
//		f(!y);
//		x = x && y;
//		x = x || y;
//		// Bitwise operators:
//		x = x & y;
//		x = x | y;
//		x = x ^ y;
//		
//		
//		x &= y;
//		x ^= y;
//		x |= y;
//		
//		
//	}
//}

class CastingNumbers {

	public static void main(String[] args) {
		
		double above = 0.7, below = 0.4;
		float fabove = 0.7f, fbelow = 0.4f;
		
		print("(int)above: " +  (int)above);
		print("(int)below: " +  (int)below);
		print("(int)fabove: " +  (int)fabove);
		print("(int)fbelow: " +  (int)fbelow);
		
		print("Math.round(above): " +  Math.round(above));
		print("Math.round(below): " +  Math.round(below));
		print("Math.round(fabove): " +  Math.round(fabove));
		print("Math.round(fbelow): " +  Math.round(fbelow));
	}

}

class Casting {

	public static void main(String[] args) {
		
		int i = 200;
		long lng = (long) i;
		lng = i;
		long lng2 = (long)200;
		lng2 = 200;
		i = (int) lng2;
		
		
		CastingNumbers.main(args);
	}

}

class Preference {

	public static void main(String[] args) {
		
		   int x = 1, y = 2, z = 3;
		   int a = x + y - 2 /2 + z;
		   int b = x + (y - 2)/(2 + z);
		   System.out.println("a =  " + a + " b = " + b);
		   
		   Bool.main(args);
		   Assignment.main(args);
		   Equivalence.main(args);
		   ShortCircuit.main(args);
		   Literals.main(args);
		   StringOperators.main(args);
		   Casting.main(args);
	}

}
