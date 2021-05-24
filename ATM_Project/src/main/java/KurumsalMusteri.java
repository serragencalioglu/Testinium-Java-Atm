public class KurumsalMusteri extends Musteri{

    private String sirketAdi;

    public KurumsalMusteri(String tcNo, String adSoyad, int hesapBakiyesi, String sirketAdi) {
        super(tcNo, adSoyad, hesapBakiyesi);
        this.sirketAdi = sirketAdi;
    }

    @Override
    public String getInfo() {
        return sirketAdi;
    }

}
