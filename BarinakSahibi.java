import java.util.*;

public class BarinakSahibi extends Kullanıcılar  {
        String barinakadi , barinakadresi;
        BarinakSahibi(){
            
        }

        BarinakSahibi(String ad, String soyad ,String mail ,int telefonno ,int sifre,String barinakadi , String barinakadresi){
            super(barinakadresi, soyad, mail, sifre, telefonno);
            this.barinakadi=barinakadi;
            this.barinakadresi = barinakadresi;
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
            System.out.println("Barinak adini giriniz;");
            this.barinakadi=klavye.next();
            System.out.println("Barinak adresi giriniz;");
            this.barinakadresi=klavye.next();
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
         public int getyenisifre(){
            return this.sifre;
    }
    
       
    }
    
    