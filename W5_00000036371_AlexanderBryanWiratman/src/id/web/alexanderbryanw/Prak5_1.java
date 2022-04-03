package id.web.alexanderbryanw;

import java.util.Scanner;

public class Prak5_1 {
	// driver class
	public static int Penjumlahan(int bil_pertama, int bil_kedua) {
		// modul penjjumlahan bil1 dan bil 2 yang didapatkan dari program utama. Hasil penjumlahan yang dihasilkan dikembalikan dan diprint di dalam program utama.
		int hasil = bil_pertama + bil_kedua;
		return hasil;
	}

	public static void Pengurangan(int bil_pertama, int bil_kedua) {
		int hasil = bil_pertama - bil_kedua;
		System.out.println("Sedangkan pengurangannya adalah " + hasil);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Bilangan 1 : ");
		int bil1 = scan.nextInt();
		System.out.print("Bilangan 2 : ");
		int bil2 = scan.nextInt();
		int jumlah, kali;
		jumlah = Penjumlahan(bil1, bil2);
		System.out.println("Hasil penjumlahan adalah " + jumlah);
		Pengurangan(bil1, bil2);
		kali = Prak5_1b.Perkalian(bil1, bil2);
		System.out.println("Menghasilkan angka " + kali + " jika dikalikan");
		scan.close();
		Prak5_1b.Pembagian(bil1, bil2);
	}

}

/*
 * Prak5_1 disebut sebagai driver class karena berisi perintah utama yang menjalankan keseluruhan program.
 * Prak5_2 disebut sebagai object class karena merupakan modul yang berisi perintah-perintah yang diperlukan oleh driver class atau program utama. Hasil yang diperoleh akan digunakan dan diprint pada program utama.
 */
