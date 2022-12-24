import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		BarinakSahibi bs1= new BarinakSahibi();
	    BarinakSahibi bs2= new BarinakSahibi("semih","gulboy","smhglby",546,50);
		Veteriner v1 = new Veteriner();
		Veteriner v2 = new Veteriner("Melike","Sasmaz","mlksmz",547,51,5);
		Kullanici k1= new Kullanici();
		Kullanici k2 = new Kullanici("İbrahim","Sen","ıbrhm",548,53,23,"Turgutlu");
		Barınak b1 =new Barınak();
		Barınak b2 =new Barınak("Gulboypet","Ordu",100,52,586);
		Kopekler kopek1 =new Kopekler();
		Kopekler.Pitbull p1=  kopek1.new Pitbull();
		p1.uyari();
		HastaKopek h1=new HastaKopek();
		HastaKopek h2=new HastaKopek("Erkek",2,25,40,"Sakat","Turgutlu");
		SokakKopek sk1= new SokakKopek();
		SokakKopek sk2 =new SokakKopek("Dişi",5,50,50,"bursa");
		menu1();
		Scanner klavye = new Scanner(System.in);
		int a = klavye.nextInt();
				switch (a){
					//BARINAK SAHİBİ KULLANICI GİRİŞİ
			case 1:
			System.out.println("KAYIT YAPMAK İÇİN 1 SEÇİNİZ , GİRİŞ YAPMAK İÇİN 2 SEÇİNİZ, SİFRE DEGİSTİRMEK İÇİN 3 SEÇİNİZ.");
			int b =klavye.nextInt();
			if(b ==1){
	   		bs1.uyekayit();
			System.out.println("Giris Sistemine aktarılıyorsunuz...");
			bs1.uyegiris();
			bs1.islemler();
			int islem=klavye.nextInt();
			if (islem == 1){
				b1.barınakekle();}
			else if(islem == 2){
				b2.barınakbilgilerigoruntule();}
			else if(islem == 3){
				sk2.HastaKopekGoruntule();}
			else if(islem == 4){
				k2.kullanicibilgilerigoruntule();}
			else if(islem ==5){
				v2.veterinerbilgilerigoruntule();}
			}
			else if(b==2){
				bs2.uyegiris();
				bs2.islemler();
				int islem=klavye.nextInt();
				if (islem == 1){
					b1.barınakekle();}
				else if(islem == 2){
					b2.barınakbilgilerigoruntule();}
				else if(islem == 3){
					sk2.HastaKopekGoruntule();}
				else if(islem == 4){
					k2.kullanicibilgilerigoruntule();}
				else if(islem ==5){
					v2.veterinerbilgilerigoruntule();}
			}
			else if(b  == 3){
				bs2.setsifredegistirme();
                System.out.println("İsleminiz başarıyla gerçekleştirildi");
				System.out.println("Giris Sistemine aktarılıyorsunuz...");
				bs2.uyegiris();
				bs2.islemler();
				int islem=klavye.nextInt();
				if (islem == 1){
				b1.barınakekle();}
				else if(islem == 2){
				b2.barınakbilgilerigoruntule();}
				else if(islem == 3){
					sk2.HastaKopekGoruntule();}
				else if(islem == 4){
				k2.kullanicibilgilerigoruntule();}
				else if(islem ==5){
				v2.veterinerbilgilerigoruntule();}
			}
				else{
				System.out.println("Yanlis tuslama yaptiniz...");}
				//VETERİNER  GİRİŞ YERİ
			case 2:
			System.out.println("KAYIT YAPMAK İÇİN 1 SEÇİNİZ , GİRİŞ YAPMAK İÇİN 2 SEÇİNİZ, SİFRE DEGİSTİRMEK İÇİN 3 SEÇİNİZ.");
			int c =klavye.nextInt();
			if(c ==1){
	   		v1.uyekayit();
			   System.out.println("Giris Sistemine aktarılıyorsunuz...");
			v1.uyegiris();
			v1.islemler();
			int veterinerislem=klavye.nextInt();
			if (veterinerislem == 1){
				h2.HastaKopekGoruntule();}
				else if(veterinerislem == 2){
				b2.barınakbilgilerigoruntule();}
			}
			if(c==2){
				v2.uyegiris();
				v2.islemler();
			int veterinerislem=klavye.nextInt();
			if (veterinerislem == 1){
				h2.HastaKopekGoruntule();}
				else if(veterinerislem == 2){
				b2.barınakbilgilerigoruntule();}
			}
			if(c == 3){
				v2.setsifredegistirme();
                v2.uyegiris();
				v2.islemler();
			int veterinerislem=klavye.nextInt();
			if (veterinerislem == 1){
				h2.HastaKopekGoruntule();}
				else if(veterinerislem == 2){
				b2.barınakbilgilerigoruntule();}
			}
			// KULLANICI GİRİŞİ İŞLEMLERİ
			case 3:
			System.out.println("KAYIT YAPMAK İÇİN 1 SEÇİNİZ , GİRİŞ YAPMAK İÇİN 2 SEÇİNİZ, SİFRE DEGİSTİRMEK İÇİN 3 SEÇİNİZ.");
			int d =klavye.nextInt();
			if(d ==1){
	   		k1.uyekayit();
			System.out.println("Giris Sistemine aktarılıyorsunuz...");
			k1.uyegiris();
			k1.islemler();
			int islem=klavye.nextInt();
			if (islem == 1){
				h1.HastaKopekekle();
				System.out.println("Hasta köpek sisteme kaydedilmiştir...");
			}
			else if(islem == 2){
			  b2.barınakbilgilerigoruntule();}
			else if(islem == 3){
			  sk1.SokakKopekekle();}
			else if(islem == 4){
				System.out.println("köpekleri görüntüle");}
			else if(islem == 5){
			   v2.veterinerbilgilerigoruntule();}
			else if(islem ==6){
				b2.mamamiktari++;
				System.out.println("mama miktarı arttırıldı");
				System.out.println(b2.mamamiktari);}
			else if(islem ==7){
				System.out.println("köpek ekle");}
			}
			if(d==2){
				k2.uyegiris();
				k2.islemler();
			int islem=klavye.nextInt();
			if (islem == 1){
				h1.HastaKopekekle();
				System.out.println("Hasta köpek sisteme kaydedilmiştir...");}
			else if(islem == 2){
			  b2.barınakbilgilerigoruntule();}
			else if(islem == 3){
				sk1.SokakKopekekle();}
			else if(islem == 4){
				System.out.println("köpekleri görüntüle");}
			else if(islem == 5){
			   v2.veterinerbilgilerigoruntule();}
			else if(islem ==6){
				b2.mamamiktari++;
				System.out.println("mama miktarı arttırıldı");
				System.out.println(b2.mamamiktari);}
			else if(islem ==7){
				System.out.println("köpek ekle");}
			}
			if(d == 3){
				k2.setsifredegistirme();
                k2.uyegiris();
				k2.islemler();
			int islem=klavye.nextInt();
			if (islem == 1){
				h1.HastaKopekekle();
				System.out.println("Hasta köpek sisteme kaydedilmiştir...");}
			else if(islem == 2){
			  b2.barınakbilgilerigoruntule();}
			else if(islem == 3){
				sk1.SokakKopekekle();}
			else if(islem == 4){
				System.out.println("köpekleri görüntüle");}
			else if(islem == 5){
			   v2.veterinerbilgilerigoruntule();}
			else if(islem ==6){
				b2.mamamiktari++;
				System.out.println("mama miktarı arttırıldı");
				System.out.println(b2.mamamiktari);}
			else if(islem ==7){
				System.out.println("köpek ekle");}
			}
		}
	}
		 public static void menu1() {
	
	System.out.println("HOŞGELDİNİZ");
		System.out.println("GİRİŞ YAPMAK İSTEDİĞİNİZ SECENEGİ GİRİNİZ");
		System.out.println("1- Barınak Sahibi Girisi ");
		System.out.println("2- Veteriner Girisi");
		System.out.println("3- Kullanıcı Girisi");
}
	
}

