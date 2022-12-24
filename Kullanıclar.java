abstract class Kullanıcılar {
    public String ad ,soyad , mail;
    public int sifre, telefonno;

    
    public Kullanıcılar() {
    }
   
    public Kullanıcılar(String ad, String soyad, String mail, int sifre, int telefonno) {
        this.ad = ad;
        this.soyad = soyad;
        this.mail = mail;
        this.sifre = sifre;
        this.telefonno = telefonno;
    }
    public abstract void uyekayit();
    public abstract void uyegiris();
    public abstract void setsifredegistirme();
    public abstract void islemler();
}
