package latihan2;

import static java.lang.Math.sqrt;

public class b {
	private static int alas, tinggi, luas;
	
	public static void main(String[] args) {
		alas = 6;
		tinggi = 8;
		
		luas = (int) sqrt((alas * alas) + (tinggi * tinggi));
		System.out.println("Luas segitiga siku-siku dengan alas " + alas + " dan tinggi " + 8 + " adalah " + luas);
	}
}
