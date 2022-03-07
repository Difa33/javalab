package latihan2;

public class c {
	private static double phi, jari_jari, volume;
	private static int diameter, tinggi;
	
	public static void main(String[] args) {
		phi = 3.14;
		diameter = 5;
		jari_jari = diameter * 0.5;
		tinggi = 10;
		
		System.out.println(jari_jari);
		volume = phi * jari_jari * jari_jari * tinggi;
		System.out.println("Volume tabung dengan diameter " + diameter + " dan tinggi " + tinggi + " adalah " + volume);
	}
}