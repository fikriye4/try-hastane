package hastaneOtomasyon;

import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;

import static hastaneOtomasyon.HastaneRunner.*;

public class Hasta extends VeriBankasi {
    static List<Hasta> hastaListesi = new ArrayList();
    static Scanner input = new Scanner(System.in);
    private String isim;
    private String soyIsim;
    private String hastaID;
    private String guncelDurumu;
    public Hasta() {}
    public Hasta(String isim, String soyIsim, String hastaID, String guncelDurumu) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.hastaID = hastaID;
        this.guncelDurumu = guncelDurumu;
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String getSoyIsim() {
        return soyIsim;
    }
    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }
    public String getHastaID() {
        return hastaID;
    }
    public void setHastaID(String hastaID) {
        this.hastaID = hastaID;
    }
    public String getGuncelDurumu() {
        return guncelDurumu;
    }
    public void setGuncelDurumu(String guncelDurumu) {
        this.guncelDurumu = guncelDurumu;
    }
    @Override
    public String toString() {
        String r = "| " + isim + " " + soyIsim + " " + hastaID + " " + guncelDurumu;
        return r;
    }
    public static void hastaMenusu() {
        System.out.println("******** HASTA MENÜSÜ *********\n" +
                "1-Hasta Ekle\n" +
                "2-Hasta Listesi Yazdır\n" +
                "3-Hasta Durumu Öğren\n" +
                "4-Hasta Silme\n" +
                "5-Hasta Bulma\n" +
                "6-Ana Menü\n" +
                "7-Çıkış");
        int secim = input.nextInt();
        switch (secim) {
            case 1:
                System.out.println(hastaEkle(hastaListesi));
                hastaMenusu();
            case 2:
                System.out.println("********HASTA LİSTESİ********");
                hastaListesi();
                hastaMenusu();
                break;
            case 3:
                hastaGuncelDurumu();
                hastaMenusu();
                break;
            case 4:
                hastaSilme();
                hastaMenusu();
                break;
            case 5:
                hastaMenusu();
                break;
            case 6:
                showMenu();
                break;
            case 7:
                hastaMenusu();
                System.out.println("Tekrar bekleriz...");
                break;
        }
    }
    public static void hastaListesi() {
        hastaListesi.add(Hasta.hasta1);
        hastaListesi.add(Hasta.hasta2);
        hastaListesi.add(Hasta.hasta3);
        System.out.println(hastaListesi);
    }
    public static List<Hasta> hastaEkle(List list) {
        Hasta yeniHasta = new Hasta();
        System.out.println("Lütfen hastanın adını giriniz:");
        input.nextLine();
        yeniHasta.isim = input.nextLine();
        System.out.println("Lütfen hastanın soyadını giriniz:");
        yeniHasta.soyIsim = input.nextLine();
        do {
            System.out.println("Lütfen hastanın ID'sini giriniz:");
            yeniHasta.hastaID = input.nextLine();
            if (yeniHasta.hastaID.length() != 11) {
                System.out.println("ID 11 Haneli Olmalıdır!");
            }
            if (yeniHasta.hastaID.replaceAll("\\d", "").length() > 0) {
                System.out.println("Sadece sayı giriniz...");
            }
        } while (yeniHasta.hastaID.length() != 11);
        System.out.println("Lütfen hastanın durumunu giriniz:");
        yeniHasta.guncelDurumu = input.nextLine();
        durum.setAktuelDurum(yeniHasta.guncelDurumu);
        hastaDurumuBul(yeniHasta.getGuncelDurumu());
        list.add(yeniHasta);
        return hastaListesi;
    }
    public static void hastaGuncelDurumu() {
        System.out.println("Durumunu öğrenmek istediğiniz hastanın ismini giriniz:");
        input.nextLine();
        String hastaDurumuIsim = input.nextLine();
//        boolean isExist=false;
        for (Hasta w : hastaListesi) {
            if (w.isim.equals(hastaDurumuIsim)) {
                System.out.println("==> " + w.isim + " " + w.soyIsim + " | Durumu ==> " + w.guncelDurumu);
//                isExist = true;
            }
        }
//        if(isExist==false){
//            System.out.println("Hasta bulunamadı, tekrar deneyiniz...");
//            hastaGuncelDurumu();
//        }
    }
    public static void hastaSilme() {
        System.out.println("Silmek istediğiniz hastanın adını giriniz:");
        input.nextLine();
        String silinecekHasta = input.nextLine();
        for (Hasta w : hastaListesi) {
            if (w.isim.equals(silinecekHasta)) {
                hastaListesi.remove(w);
                System.out.println("Hasta silindi...");
                System.out.println(hastaListesi);
                break;
            }
        }
    }
}