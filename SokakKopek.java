import java.util.Scanner;

public class SokakKopek extends Kopekler {
    public SokakKopek(){
    }
    public SokakKopek(String cinsiyet,int yas ,int boy ,int kilo,String adres){
        super(cinsiyet,yas,boy,kilo,adres);
    }
    public void SokakKopekekle(){
        Scanner klavye = new Scanner(System.in);
        System.out.println("Cinsiyetini giriniz:");
        this.cinsiyet=klavye.nextLine();
        System.out.println("Tahmini yaşını giriniz:");
        this.yas=klavye.nextInt();
        System.out.println("Tahmini boyunu giriniz:");
        this.boy=klavye.nextInt();
        System.out.println("Tahmini kilosunu giriniz:");
        this.kilo=klavye.nextInt();
        System.out.println("Güncel konumunu giriniz:");
        this.adres=klavye.next();    
    }
    public void HastaKopekGoruntule(){
        System.out.println("Cinsiyet:"+this.cinsiyet);
        System.out.println("Tahmini yaşi:"+this.yas);
        System.out.println("Tahmini boyu:"+this.boy);
        System.out.println("Tahmini kilosu:"+this.kilo);
        System.out.println("Güncel konumu"+this.adres);
    }
    }

