package ch03;

public class OperatorEx14 {

	public static void main(String[] args) {
	int x = 0xAB, y = 0xF;
	
	System.out.printf("x = %#X \t\t%s%n", x, toBinaryStirng(x));
	System.out.printf("y = %#X \t\t%s%n", y, toBinaryStirng(y));
	System.out.printf("%#X | %#X = %#X \t%s%n", x, y, x|y, toBinaryStirng(x|y));
	System.out.printf("%#X & %#X = %#X \t%s%n", x, y, x&y, toBinaryStirng(x&y));
	System.out.printf("%#X ^ %#X = %#X \t%s%n", x, y, x^y, toBinaryStirng(x^y));
	System.out.printf("%#X ^ %#X ^ %#X = %#X \t%s%n", x, y, y, x^y, x^y, toBinaryStirng(x^y^y));
	}
	
	static String toBinaryStirng(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero+Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
	}

}
