public class CashMachine {

    Musteri musteri;

    public CashMachine(Musteri musteri){
        this.musteri = musteri;
    }

    public void paraYatir(long miktar){
        musteri.setHesapBakiyesi(musteri.getHesapBakiyesi()+miktar);
        System.out.println("Yeni bakiyeniz: " + musteri.getHesapBakiyesi());
    }

    public void paraCek(long miktar){
        if(musteri.getHesapBakiyesi() < miktar){
            System.out.println("Yeterli bakiyeniz yok, işlem yapılamadı...");
        }else {
            musteri.setHesapBakiyesi(musteri.getHesapBakiyesi()-miktar);
            System.out.println("Yeni bakiyeniz: " + musteri.getHesapBakiyesi());
        }
    }

}
