public class BireyselMusteri extends Musteri{

    private String adres;

    public BireyselMusteri(String tcNo, String adSoyad, int hesapBakiyesi, String adres) {
        super(tcNo, adSoyad, hesapBakiyesi);
        this.adres = adres;
    }

    @Override
    public String getInfo() {
        return adres;
    }
}
