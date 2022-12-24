import java.util.Scanner;

public class Barınak {
    String barınakadi,barınakadresi;
    int mamamiktari,hayvankapasitesi, telefonno;
    Barınak(){
    }
    Barınak(String barınakadi,String barınakadresi,int mamamiktari,int hayvankapasitesi,int telefonno){
        this.barınakadi=barınakadi;
        this.barınakadresi=barınakadresi;
        this.mamamiktari = mamamiktari;
        this.hayvankapasitesi= hayvankapasitesi;
        this.telefonno = telefonno;
    }
    public void barınakekle(){
        Scanner klavye = new Scanner(System.in);
        System.out.println("barınak adi giriniz");
        this.barınakadi = klavye.next();
        System.out.println("barınak adresi giriniz");
        this.barınakadresi = klavye.next();
        System.out.println("mama miktarini giriniz");
        this.mamamiktari= klavye.nextInt();
        System.out.println("Hayvan kapasitesi giriniz");
        this.hayvankapasitesi = klavye.nextInt();
        System.out.println("Telefon numarasi giriniz");
        this.telefonno = klavye.nextInt();
    }
    public void barınakbilgilerigoruntule(){
        System.out.println("Barinak adi :"+ this.barınakadi);
        System.out.println("Barinak adresi :"+ this.barınakadresi);
        System.out.println ("Barınak mama miktari:" + this.mamamiktari );
        System.out.println("Barinak hayvan kapasitesi:" + this.hayvankapasitesi);
        System.out.println("Barinağın telefon numarasi:"+ this.telefonno);
    }
}
