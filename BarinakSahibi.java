import java.util.*;

public class BarinakSahibi extends Kullanıcılar  {
        BarinakSahibi(){
            
        }

        BarinakSahibi(String ad, String soyad ,String mail ,int telefonno ,int sifre){
            super(ad, soyad, mail, sifre, telefonno);
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
            System.out.println("Barınak eklemek için 1'i tuslayiniz.");
            System.out.println("Barınak bilgileri goruntulemek için 2'i tuslayiniz.");
            System.out.println("Sokak köpeklerini goruntulemek için 3'ü tuslayiniz. ");
            System.out.println("Hayvan sahiplenmek isteyen kullanicileri görüntülemek için 4'ü tuslayiniz.");
            System.out.println("Veterinerleri görüntülemek için 5'e basınız.");
        }
    
       
    }
    
    