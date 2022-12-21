package java_eclipse_test;

public class hutogo {
	public static void main(String[] args) {
		int a = 5;
		boolean c;
		c = a < 5;
		System.out.println(c);
		c = a <= 5;
		System.out.println(c);
		c = a > 4;
		System.out.println(c);
		c = a >= 4;
		System.out.println(c);
		c = a == 5;
		System.out.println(c);
		c = a != 5;
		System.out.println(c);
		
		System.out.println("Next");
		boolean d = true;
		boolean e = false;
		c = d && true;
		System.out.println(c);
		c = d && false;
		System.out.println(c);
		c = e || true;
		System.out.println(c);
		c = e || false;
		System.out.println(c);
		c = !d;
		System.out.println(c);
		c = !e;
		System.out.println(c);
	}
}
