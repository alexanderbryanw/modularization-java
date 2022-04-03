package id.web.alexanderbryanw;

public class Prak5_2_Method {

	public static void persegi(int sisi){
		int hasil;
		hasil = sisi*sisi;
		System.out.print("Luas : " + hasil);
	}
	public static void persegipanjang (int panjang, int lebar){
		int hasil;
		hasil = panjang*lebar;
		System.out.print("Luas : " + hasil);
	}
	public static void segitiga (float alas, float tinggi){
		float hasil;
		hasil = (alas*tinggi)/2;
		System.out.printf("Luas : %.2f\n", hasil);
	}
}
