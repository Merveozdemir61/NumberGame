import java.util.Scanner;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		int tutulanSayi = (int) (Math.random() * 100 + 1);
		int tahmin = 0;

		int denemeSayisi = 1;

		while (tahmin != tutulanSayi) {
			String cevap = JOptionPane.showInputDialog(null, "1 ile 100 aras�nda bir tahmin yap", "Tahmin Oyunu", 3);
			tahmin = Integer.parseInt(cevap);
			JOptionPane.showMessageDialog(null, "" + tahminEt(tahmin, tutulanSayi, denemeSayisi));
			denemeSayisi++;
		}

	}

	public static String tahminEt(int tahmin, int tutulanSayi, int denemeSayisi) {
		if (tahmin < 0 || tahmin == 0 || tahmin > 100) {
			return "Ge�ersiz Cevap";
		}
		String sonuc = "";

		if (tahmin == tutulanSayi) {
			sonuc = "Do�ru ! \n Toplam deneme sayisi : " + denemeSayisi;
		}

		else if (tahmin < tutulanSayi) {
			sonuc = "Tahmin k���k ! \n Toplam deneme sayisi : " + denemeSayisi;
		}

		else if (tahmin > tutulanSayi) {
			sonuc = "Tahmin b�y�k ! \n Toplam deneme sayisi : " + denemeSayisi;
		}
		return sonuc;
	}

}
