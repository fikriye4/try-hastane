package hastaneOtomasyon;

import java.util.Scanner;

public class HastaneRunner {

    static Durum durum = new Durum();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        showMenu();
    }
    public static void showMenu() {

        System.out.println("====== DILEK TIP MERKEZİMİZE HOŞGELDİNİZ ======");
//        System.out.println("Hastalığınız nedir:  ");
//        System.out.println("Hastalık acil mi: " + hastaDurumuBul(input.nextLine()));
        System.out.println("işleminizi seçiniz:");
        int secim;
        System.out.println("Doktor menüsü için 1'e\n" +
                "Hasta menüsü için 2'ye\n" +
                "Çıkış için 0'a basınız");
        try {
            do {
                secim = input.nextInt();
                switch (secim) {
                    case 1:
                        Doktor.doktorMenusu();
                        break;
                    case 2:
                        Hasta.hastaMenusu();
                        break;
                    case 0:
                        System.out.println("Tekrar bekleriz...");
                    default:
                        System.out.println("Lütfen 0,1,2 değerlerinden birini giriniz...");
                }
            } while (secim != 0);
        } catch (Exception e) {
            System.out.println("Lütfen rakam giriniz...");
            showMenu();
        }
    }

    public static boolean hastaDurumuBul(String aktuelDurum) {
        switch (aktuelDurum) {
            case "Allerji":
                durum.setAcilMi(false);
                break;
            case "Bas agrisi":
                durum.setAcilMi(false);
                break;
            case "Kalp":
                durum.setAcilMi(true);
                break;
            default:
                System.out.println("HastaDurumuBul");
        }
        return durum.isAcilMi();
    }


}