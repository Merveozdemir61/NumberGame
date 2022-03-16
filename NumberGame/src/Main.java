import java.util.Scanner;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		int tutulanSayi = (int) (Math.random() * 100 + 1);
		int tahmin = 0;

		int denemeSayisi = 1;

		while (tahmin != tutulanSayi) {
			String cevap = JOptionPane.showInputDialog(null, "1 ile 100 arasýnda bir tahmin yap", "Tahmin Oyunu", 3);
			tahmin = Integer.parseInt(cevap);
			JOptionPane.showMessageDialog(null, "" + tahminEt(tahmin, tutulanSayi, denemeSayisi));
			denemeSayisi++;
		}

	}

	public static String tahminEt(int tahmin, int tutulanSayi, int denemeSayisi) {
		if (tahmin < 0 || tahmin == 0 || tahmin > 100) {
			return "Geçersiz Cevap";
		}
		String sonuc = "";

		if (tahmin == tutulanSayi) {
			sonuc = "Doðru ! \n Toplam deneme sayisi : " + denemeSayisi;
		}

		else if (tahmin < tutulanSayi) {
			sonuc = "Tahmin küçük ! \n Toplam deneme sayisi : " + denemeSayisi;
		}

		else if (tahmin > tutulanSayi) {
			sonuc = "Tahmin büyük ! \n Toplam deneme sayisi : " + denemeSayisi;
		}
		return sonuc;
	}

}
