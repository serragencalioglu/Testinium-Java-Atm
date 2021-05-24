import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static CashMachine cashMachine;
    static Musteri musteri;
    static String firstChoice;
    static String secondChoice;

    public static void main(String[] args) {

        Map<String,Musteri> musteriList = new HashMap<>();
        musteriList.put("1",new BireyselMusteri("123","Mojo Gençalioğlu", 8500,"Adana"));
        musteriList.put("2",new KurumsalMusteri("321","Olga Gençalioğlu", 7500,"Testinium"));
        musteriList.put("3",new BireyselMusteri("111","Serra Kılınçcı", 9500,"İstanbul"));
        musteriList.put("4",new KurumsalMusteri("213","Şüko Gençalioğlu", 11500,"N11"));
        musteriList.put("5",new BireyselMusteri("456","Merve Gençalioğlu", 11500,"Rize"));


        while (true){
            System.out.println("İşlem için müşteri numarası, çıkmak için 'q' tuşlayın: ");
            firstChoice = scanner.nextLine();
            if (firstChoice.equals("q")){
                break;
            }else if(musteriList.containsKey(firstChoice)){
                switch (firstChoice){
                    case "1":
                        musteri = musteriList.get("1");
                        musteri.getMusteriBilgileri();
                        cashMachine=new CashMachine(musteri);
                        System.out.println("Para yatırma için 1, çekmek için 2, çıkmak herhangi bir tuşu tuşlayın");
                        secondChoice = scanner.nextLine();
                        if (secondChoice.equals("1")){
                            System.out.println("Yatırmak istediğiniz tutar: ");
                            long tutar = scanner.nextInt();
                            scanner.nextLine();
                            cashMachine.paraYatir(tutar);
                            break;
                        }else if(secondChoice.equals("2")){
                            System.out.println("Çekmek istediğiniz tutar: ");
                            long tutar = scanner.nextInt();
                            scanner.nextLine();
                            cashMachine.paraCek(tutar);
                            break;
                        }else{
                            break;
                        }
                    case "2":
                        musteri = musteriList.get("2");
                        musteri.getMusteriBilgileri();
                        cashMachine=new CashMachine(musteri);
                        System.out.println("Para yatırma için 1, çekmek için 2, çıkmak herhangi bir tuşu tuşlayın");
                        secondChoice = scanner.nextLine();
                        if (secondChoice.equals("1")){
                            System.out.println("Yatırmak istediğiniz tutar: ");
                            long tutar = scanner.nextInt();
                            scanner.nextLine();
                            cashMachine.paraYatir(tutar);
                            break;
                        }else if(secondChoice.equals("2")){
                            System.out.println("Çekmek istediğiniz tutar: ");
                            long tutar = scanner.nextInt();
                            scanner.nextLine();
                            cashMachine.paraCek(tutar);
                            break;
                        }else{
                            break;
                        }
                    case "3":
                        musteri = musteriList.get("3");
                        musteri.getMusteriBilgileri();
                        cashMachine=new CashMachine(musteri);
                        System.out.println("Para yatırma için 1, çekmek için 2, çıkmak herhangi bir tuşu tuşlayın");
                        secondChoice = scanner.nextLine();
                        scanner.nextLine();
                        if (secondChoice.equals("1")){
                            System.out.println("Yatırmak istediğiniz tutar: ");
                            long tutar = scanner.nextInt();
                            cashMachine.paraYatir(tutar);
                            break;
                        }else if(secondChoice.equals("2")){
                            System.out.println("Çekmek istediğiniz tutar: ");
                            long tutar = scanner.nextInt();
                            cashMachine.paraCek(tutar);
                            break;
                        }else{
                            break;
                        }
                    case "4":
                        musteri = musteriList.get("4");
                        musteri.getMusteriBilgileri();
                        cashMachine=new CashMachine(musteri);
                        System.out.println("Para yatırma için 1, çekmek için 2, çıkmak herhangi bir tuşu tuşlayın");
                        secondChoice = scanner.nextLine();
                        scanner.nextLine();
                        if (secondChoice.equals("1")){
                            System.out.println("Yatırmak istediğiniz tutar: ");
                            long tutar = scanner.nextInt();
                            cashMachine.paraYatir(tutar);
                            break;
                        }else if(secondChoice.equals("2")){
                            System.out.println("Çekmek istediğiniz tutar: ");
                            long tutar = scanner.nextInt();
                            cashMachine.paraCek(tutar);
                            break;
                        }else{
                            break;
                        }
                    case "5":
                        musteri = musteriList.get("5");
                        musteri.getMusteriBilgileri();
                        cashMachine=new CashMachine(musteri);
                        System.out.println("Para yatırma için 1, çekmek için 2, çıkmak herhangi bir tuşu tuşlayın");
                        secondChoice = scanner.nextLine();
                        if (secondChoice.equals("1")){
                            System.out.println("Yatırmak istediğiniz tutar: ");
                            long tutar = scanner.nextInt();
                            scanner.nextLine();
                            cashMachine.paraYatir(tutar);
                            break;
                        }else if(secondChoice.equals("2")){
                            System.out.println("Çekmek istediğiniz tutar: ");
                            long tutar = scanner.nextInt();
                            scanner.nextLine();
                            cashMachine.paraCek(tutar);
                            break;
                        }else{
                            break;
                        }
                }
            }else {
                System.out.println("Yanlış tuşlama yaptınız...");
            }
        }

    }
}
