package id.web.alexanderbryanw;

import java.util.Scanner;

public class Prak5_2_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Y = 1;
		while (Y <= 1) {
		System.out.print("Program Hitung Luas\n1. Persegi\n2. Persegi panjang\n3. Segitiga\nPilihan : ");
		Scanner scan = new Scanner(System.in);
		int pilihan = scan.nextInt();
			switch (pilihan) {
			case 1:
				System.out.print("Masukkan sisi : ");
				int sisi = scan.nextInt();
				Prak5_2_Method.persegi(sisi);
				break;
			case 2:
				System.out.print("Masukkan panjang : ");
				int panjang = scan.nextInt();
				System.out.print("Masukkan lebar : ");
				int lebar = scan.nextInt();
				Prak5_2_Method.persegipanjang(panjang, lebar);
				break;
			case 3:
				System.out.print("Masukkan alas = ");
				int alas = scan.nextInt();
				System.out.print("Masukkan tinggi : ");
				int tinggi = scan.nextInt();
				Prak5_2_Method.segitiga(alas, tinggi);
				break;
			default:
				System.out.print("Input salah");
			}

			System.out.print("\nApakah anda ingin mengulang program? (Y/N) : ");
			String ulang = scan.next();
			if (ulang.equalsIgnoreCase("Y")) {
				System.out.println();
			} else if (ulang.equalsIgnoreCase("N")) {
				System.out.println();
				System.out.print("Terima kasih telah menggunakan program ini!");
				System.exit(0);
			}
				
		}
	}
}
