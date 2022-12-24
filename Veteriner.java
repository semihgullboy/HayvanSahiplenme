import java.util.*;
public class Veteriner extends Kullanıcılar {
    int tecrübe;
    Veteriner(){

    }
    Veteriner(String ad, String soyad ,String mail ,int telefonno ,int sifre,int tecrübe){
        super(ad, soyad, mail, sifre, telefonno);
        this.tecrübe=tecrübe;
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
            System.out.println("Kac yıldır bu isle ugrasiyorsunuz;");
            this.tecrübe=klavye.nextInt();
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
            System.out.println("Hasta köpekleri görüntülemek için 1'e basınız.");
            System.out.println("Barınakları görüntülemek için 2'e tıklayınız.");
        }
        public void veterinerbilgilerigoruntule(){
            System.out.println("Adı:" +this.ad);
            System.out.println("Soyadı:" +this.soyad);
            System.out.println("Mail:" +this.mail);
            System.out.println("Telefon no:" +this.telefonno);
            System.out.println("Tecrübesi:" +this.tecrübe);
         
    
        }
      
    
}
