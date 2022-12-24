import java.util.Scanner;

public class Klinik {
    String klinikadi,klinikadresi;
    public int  telefonno,tedaviyerisayisi;

    Klinik(){
    }
    Klinik(String klinikadi,String klinikadresi,int telefonno,int tedaviyerisayisi){
        this.klinikadi =klinikadi;
        this.klinikadresi =klinikadresi;
        this.telefonno =telefonno;
        this.tedaviyerisayisi = tedaviyerisayisi;
    }
    public void klinikekle(){
        Scanner klavye = new Scanner(System.in);
        System.out.println("barınak adi giriniz");
        this.klinikadi = klavye.next();
        System.out.println("barınak adresi giriniz");
        this.klinikadresi = klavye.next();
        System.out.println("Tedavi yeri sayisini  giriniz");
        this.tedaviyerisayisi= klavye.nextInt();
        System.out.println("Telefon numarasi giriniz");
        this.telefonno = klavye.nextInt();
    }
    public void klinikbilgilerigoruntule(){
        System.out.println("Klinik adi :"+ this.klinikadi);
        System.out.println("Klinik adresi :"+ this.klinikadresi);
        System.out.println("Klinikteki tedavi yeri sayisi:" + this.tedaviyerisayisi);
        System.out.println("Barinağın telefon numarasi:"+ this.telefonno);
    }
    
}
