package id.web.alexanderbryanw;

public class Prak5_3_Method {
	public static int faktorial(int warna) {
		int hasil = 0;
		if (warna == 0){
			return hasil;
		}else
			return warna * faktorial(warna - 1);
	}
}
