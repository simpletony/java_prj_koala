
public class Burrito {

	Spiciness degree;
	public Burrito(Spiciness degree) {
		this.degree = degree;
	}
	public void describle() {
		System.out.print("This burrito is ");
		switch (degree) {
		
		case NOT: System.out.println("not spicy at all.");break;
		case MILD:
		case MEDIUM: System.out.println("a little hot.");break;
		case HOT:
		case FLAMING:
			default:
				System.out.println("maybe too hot");
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Burrito plain = new Burrito(Spiciness.NOT),
				greenChile = new Burrito(Spiciness.MEDIUM),
				jalapeno = new Burrito(Spiciness.HOT);
		plain.describle();
		greenChile.describle();
		jalapeno.describle();
	}

}
