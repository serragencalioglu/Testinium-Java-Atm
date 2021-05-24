public abstract class Musteri {

    private String tcNo;
    private String adSoyad;
    private long hesapBakiyesi;

    public Musteri(String tcNo, String adSoyad, int hesapBakiyesi) {
        this.tcNo = tcNo;
        this.adSoyad = adSoyad;
        this.hesapBakiyesi = hesapBakiyesi;
    }

    public abstract String getInfo();
    public void getMusteriBilgileri(){
        System.out.println
                        ("Tc No: "+tcNo+"\n"+
                        "Ad Soyad: "+adSoyad+"\n"+
                        "Hesap Bakiyesi: "+hesapBakiyesi+"\n"+
                        "Adres/Şirket: "+getInfo());
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public long getHesapBakiyesi() {
        return hesapBakiyesi;
    }

    public void setHesapBakiyesi(long hesapBakiyesi) {
        this.hesapBakiyesi = hesapBakiyesi;
    }
}
