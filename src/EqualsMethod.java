
class Value {
	int i;
}

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n1 = new Integer(47);
		Integer n2 = new Integer(47);	
		System.out.println(n1.equals(n2));
		main1(args);
	}
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		Value n1 = new Value();
		Value n2 = new Value();
		n1.i = n2.i = 100;
		System.out.println(n1.equals(n2));
	}
}
