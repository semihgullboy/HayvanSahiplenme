import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		BarinakSahibi bs1= new BarinakSahibi();
	    BarinakSahibi bs2= new BarinakSahibi("semih","gulboy","smhglby",546,50,"gulboypet","turgutlu");
		System.out.println("HOŞGELDİNİZ");
		System.out.println("GİRİŞ YAPMAK İSTEDİĞİNİZ SECENEGİ GİRİNİZ");
		System.out.println("1- Barınak Sahibi Girisi ");
		System.out.println("2- Veteriner Girisi");
		System.out.println("3- Kullanıcı Girisi");
		Scanner klavye = new Scanner(System.in);
		int a = klavye.nextInt();
				switch (a){
			case 1:
			System.out.println("KAYIT YAPMAK İÇİN 1 SEÇİNİZ , GİRİŞ YAPMAK İÇİN 2 SEÇİNİZ, SİFRE DEGİSTİRMEK İÇİN 3 SEÇİNİZ.");
			int b =klavye.nextInt();
			if(b ==1){
	   bs1.uyekayit();
	   bs1.uyegiris();

		}
			if(b==2){
				bs2.uyegiris();
				
			}
			if(b  == 3){
				bs2.setsifredegistirme();
                bs2.uyegiris();
			}

		}
		
		

	}

}
