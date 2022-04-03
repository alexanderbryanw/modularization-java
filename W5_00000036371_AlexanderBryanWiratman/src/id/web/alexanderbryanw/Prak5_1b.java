package id.web.alexanderbryanw;

public class Prak5_1b {
	// object class

	public static int Perkalian(int bil_pertama, int bil_kedua) {
		//modul perkalian yang menggunakan bil1 dan bil2 dari program utama dan hasil perkalian dikembalikan dan diprint pada program utama.
		int hasil = bil_pertama * bil_kedua;
		return hasil;
	}

	public static void Pembagian(float bil_pertama, float bil_kedua) {
		float hasil = bil_pertama / bil_kedua;
		System.out.printf("menghasilkan angka %.2f jika dibagi", hasil);
	}

}
