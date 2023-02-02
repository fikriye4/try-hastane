package hastaneOtomasyon;

import java.util.Scanner;

import java.util.*;

import static hastaneOtomasyon.HastaneRunner.showMenu;

public class Doktor extends VeriBankasi {
    static Scanner input = new Scanner(System.in);
    private String doktorIsim ;
    private String doktorSoyisim;
    private String doktorUnvan;
    public Doktor() { }
    public Doktor(String doktorIsim, String doktorSoyisim, String doktorUnvan) {
        this.doktorIsim = doktorIsim;
        this.doktorSoyisim = doktorSoyisim;
        this.doktorUnvan = doktorUnvan;
    }
    public String getDoktorIsim() {
        return doktorIsim;
    }
    public void setDoktorIsim(String doktorIsim) {
        this.doktorIsim = doktorIsim;
    }
    public String getDoktorSoyisim() {
        return doktorSoyisim;
    }
    public void setDoktorSoyisim(String doktorSoyisim) {
        this.doktorSoyisim = doktorSoyisim;
    }
    public String getDoktorUnvan() {
        return doktorUnvan;
    }
    public void setDoktorUnvan(String doktorUnvan) {
        this.doktorUnvan = doktorUnvan;
    }
    @Override
    public String toString() {
        return "Doktor{" +
                "doktorIsim='" + doktorIsim + '\'' +
                ", doktorSoyisim='" + doktorSoyisim + '\'' +
                ", doktorUnvan='" + doktorUnvan + '\'' +
                '}';
    }
    static Map<String,String> doktorListesiMap = new HashMap<>();
    public static void doktorListesi(){
        doktorListesiMap.put("Allergist","Nilson Avery");
        doktorListesiMap.put("Norolog","John Abel");
        doktorListesiMap.put("Genel cerrah","Robert Erik");
        doktorListesiMap.put("Cocuk doktoru","Marry Jacob");
        doktorListesiMap.put("Dahiliye","Alan Pedro");
        doktorListesiMap.put("Kardiolog","Mahesh Tristen");
        System.out.println(doktorListesiMap);
    }
    public static void doktorMenusu() {
        System.out.println("********* Doktor Menüsü *********");
        System.out.println("1-Doktor Ekle\n" +
                "2-Doktor Listesi Yazdır\n" +
                "3-Unvandan Doktor Bulma\n" +
                "4-Doktor Silme\n" +
                "5-Ana Menü\n" +
                "6-Çıkış");
        int karar1 = input.nextInt();
        switch (karar1){
            case 1:
                doktorEkle();
                doktorMenusu();
                break;
            case 2:
                doktorListesi();
                doktorMenusu();
                break;
            case 3:
                unvandanDoktorbulma();
                doktorMenusu();
                break;
            case 4:
                DoktorSilme();
                doktorMenusu();
                break;
            case 5:
                showMenu();
                doktorMenusu();
                break;
            case 6:
                System.out.println("Tekrar bekleriz...");
                break;
        }
    }
    public static void doktorEkle(){
        System.out.println("Eklemek istediğiniz doktorun unvanını giriniz:");
        String unvan = input.nextLine();
        unvan = input.nextLine();
        System.out.println("Eklemek istediğiniz doktorun isim ve soyismini giriniz:");
        String isimSoyisim = input.nextLine();
        doktorListesiMap.put(unvan,isimSoyisim);
        System.out.println("Doktor listesine başarılı ile eklendi...");
        System.out.println(doktorListesiMap);
    }
    public static void unvandanDoktorbulma(){
        Set< Map.Entry<String, String>> setList = doktorListesiMap.entrySet();
        System.out.println("Bulmak istediğiniz doktor unvanını giriniz:");
        String unvanSeçimi = input.next();
        for (Map.Entry<String, String> w : setList) {
            if(w.getKey().equals(unvanSeçimi)){
                System.out.println(w.getValue());
            }
        }
    }
    public static void DoktorSilme() {
        System.out.println("Silmek istediğiniz doktor unvanını giriniz:");
        String silinecekDoktor = input.nextLine();
        silinecekDoktor = input.nextLine();
        for (Map.Entry<String, String> w : doktorListesiMap.entrySet()) {
            if (w.getKey().contains(silinecekDoktor)) {
                doktorListesiMap.remove(silinecekDoktor);
                System.out.println("Doktor silindi...");
                System.out.println(doktorListesiMap);
                break;
            } else
                System.out.println("Bu unvana sahip bir doktor bulunamadı...");
        }
    }
}
