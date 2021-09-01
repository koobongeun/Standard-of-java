package ch02;

public class FloatToBinEx {

	public static void main(String[] args) {
	float f = 9.1234567f;
	int i = Float.floatToIntBits(f);
	
	System.out.printf("%f", f);
	System.out.printf("%X%n", i);

	}

}
