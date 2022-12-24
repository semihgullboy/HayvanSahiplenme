import java.util.Scanner;


public class HastaKopek extends Kopekler {
    String hastalikbelirtisi;
    public HastaKopek(){
    }
    public HastaKopek(String cinsiyet,int yas ,int boy ,int kilo,String hastalikbelirtisi,String adres){
        super(cinsiyet,yas,boy,kilo,adres);
        this.hastalikbelirtisi=hastalikbelirtisi;
    }
    public void HastaKopekekle(){
        Scanner klavye = new Scanner(System.in);
        System.out.println("Cinsiyetini giriniz:");
        this.cinsiyet=klavye.nextLine();
        System.out.println("Tahmini yaşını giriniz:");
        this.yas=klavye.nextInt();
        System.out.println("Tahmini boyunu giriniz:");
        this.boy=klavye.nextInt();
        System.out.println("Tahmini kilosunu giriniz:");
        this.kilo=klavye.nextInt();
        System.out.println("Gözle görülen hastaliğini giriniz:");
        this.hastalikbelirtisi=klavye.next();
        System.out.println("Güncel konumunu giriniz:");
        this.adres=klavye.next();    
    }
    public void HastaKopekGoruntule(){
        System.out.println("Cinsiyet:"+this.cinsiyet);
        System.out.println("Tahmini yaşi:"+this.yas);
        System.out.println("Tahmini boyu:"+this.boy);
        System.out.println("Tahmini kilosu:"+this.kilo);
        System.out.println("Hastalik belirtisi"+this.hastalikbelirtisi);
        System.out.println("Güncel konumu"+this.adres);
    }
}
