package id.web.alexanderbryanw;

import java.util.Scanner;

public class Prak5_3_Main {
	public static int faktorial(int n) {
		if (n == 0) {
			return 1;
		} else
			return (n * faktorial(n - 1));
	}

	public static void kombinasi(int n) {
		int kombinasi = faktorial(n) / (faktorial(n - 2) * faktorial(2));
		System.out.println("jumlah kombinasi warna yang mungkin adalah " + kombinasi);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Jumlah warna : ");
		int warna = scan.nextInt();
		System.out.printf("Hasil faktorial dari %d adalah %d\n", warna, faktorial(warna));
		kombinasi(warna);
	}

}
