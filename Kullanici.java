import java.util.*;
public class Kullanici extends Kullanıcılar {
    public int yas;
    public String adres;
    Kullanici(){

    }
    Kullanici(String ad, String soyad ,String mail ,int telefonno ,int sifre,int yas,String adres){
        super(ad, soyad, mail, sifre, telefonno);
        this.yas =yas;
        this.adres= adres;
    }

    @Override
    public void uyekayit(){
        Scanner klavye = new Scanner(System.in);
        System.out.println("Adinizi giriniz;");
        this.ad=klavye.next();
        System.out.println("Soyadinizi giriniz;");
        this.soyad=klavye.next();
        System.out.println("Telefon no giriniz;");
        telefonno=klavye.nextInt();
        System.out.println("mailinizi giriniz;");
        this.mail=klavye.next();
        System.out.println("sifrenizi giriniz;");
        this.sifre=klavye.nextInt();
        try{
        System.out.println("yasinizi giriniz;");
        this.yas=klavye.nextInt();
        if(yas<18)
        throw new Exception("Yasiniz 18 yasından küçük olduğu için kayit olamıyorsunuz.2");
        } catch (Exception ozeldurum){
            System.out.println(ozeldurum.getMessage());
            System.exit(0);
        System.out.println("adresinizi giriniz;");
        this.adres=klavye.next();
        }
        
    }
    @Override
    public void uyegiris(){
        try{
        Scanner klavye = new Scanner(System.in);
        System.out.println("mailinizi giriniz;");
        String girismail=klavye.next();
        System.out.println("sifrenizi giriniz;");
        int girissifre=klavye.nextInt();
        if(girissifre != this.sifre )
        throw new Exception("şifre yanlış");
        } catch (Exception ozeldurum){
           System.out.println(ozeldurum.getMessage());
           System.exit(0);
        }
        System.out.println("Giriş Başarılı");
     }
     @Override
     public void setsifredegistirme(){
        Scanner klavye = new Scanner(System.in);
        System.out.println("Yeni sifrenizi giriniz;");
        int yenisifre=klavye.nextInt();
        this.sifre = yenisifre;
    }
    @Override
        public void islemler(){
            System.out.println("Hasta köpekleri bildirmek için 1'e basınız.");
            System.out.println("Barınakları görüntülemek için 2'ye tıklayınız.");
            System.out.println("Sokak köpeklerini bildirmek için 3'e tıklayınız.");
            System.out.println("Köpekleri görüntülemek için 4'e tıklayınız.");
            System.out.println("Veterinerleri görüntülemek için 5'e tıklayınız.");
            System.out.println("Mama bağışında bulunmak  için 6'ya tıklayınız.");
            System.out.println("Köpek eklemek için 7' ye tıklayınız.");
        }
    public void kullanicibilgilerigoruntule(){
        System.out.println("Adı:" +this.ad);
        System.out.println("Soyadı:" +this.soyad);
        System.out.println("Mail:" +this.mail);
        System.out.println("Telefon no:" +this.telefonno);
        System.out.println("Yas:" +this.yas);
        System.out.println("Adres:" +this.adres);

    }
    
}
