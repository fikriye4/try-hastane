package hastaneOtomasyon;

import java.util.Arrays;

public class VeriBankasi {


    String[] doctorIsimleri = {"Nilson", "John", "Robert", "Marry", "Alan", "Mahesh"
    };
    String[] doctorSoyIsimleri = {"Avery", "Abel", "Erik", "Jacob", "Pedro", "Tristen"
    };
    String[] unvanlar = {"Allergist", "Norolog", "Genel cerrah", "Cocuk doktoru",
            "Dahiliye", "Kardiolog"};
    String[] hastaIsimleri = {"Warren", "Petanow", "Sophia", "Emma", "Darian",
            "Peter"};
    String[] hastaSoyIsimleri = {"Traven", "William", "George", "Tristan", "Luis",
            "Cole"};
    String[] durumlar = {"Allerji", "Bas agrisi", "Diabet", "Soguk alginligi", "Migren",
            "Kalp hastaliklari"};
    int[] hastaIDleri = {111, 222, 333, 444, 555, 666};

    public String[] getDoctorIsimleri() {
        return doctorIsimleri;
    }

    public void setDoctorIsimleri(String[] doctorIsimleri) {
        this.doctorIsimleri = doctorIsimleri;
    }

    public String[] getDoctorSoyIsimleri() {
        return doctorSoyIsimleri;
    }

    public void setDoctorSoyIsimleri(String[] doctorSoyIsimleri) {
        this.doctorSoyIsimleri = doctorSoyIsimleri;
    }

    public String[] getUnvanlar() {
        return unvanlar;
    }

    public void setUnvanlar(String[] unvanlar) {
        this.unvanlar = unvanlar;
    }

    public String[] getHastaIsimleri() {
        return hastaIsimleri;
    }

    public void setHastaIsimleri(String[] hastaIsimleri) {
        this.hastaIsimleri = hastaIsimleri;
    }

    public String[] getHastaSoyIsimleri() {
        return hastaSoyIsimleri;
    }

    public void setHastaSoyIsimleri(String[] hastaSoyIsimleri) {
        this.hastaSoyIsimleri = hastaSoyIsimleri;
    }

    public String[] getDurumlar() {
        return durumlar;
    }

    public void setDurumlar(String[] durumlar) {
        this.durumlar = durumlar;
    }

    public int[] getHastaIDleri() {
        return hastaIDleri;
    }

    public void setHastaIDleri(int[] hastaIDleri) {
        this.hastaIDleri = hastaIDleri;
    }

    @Override
    public String toString() {
        return "VeriBankasi{" +
                "doctorIsimleri=" + Arrays.toString(doctorIsimleri) +
                ", doctorSoyIsimleri=" + Arrays.toString(doctorSoyIsimleri) +
                ", unvanlar=" + Arrays.toString(unvanlar) +
                ", hastaIsimleri=" + Arrays.toString(hastaIsimleri) +
                ", hastaSoyIsimleri=" + Arrays.toString(hastaSoyIsimleri) +
                ", durumlar=" + Arrays.toString(durumlar) +
                ", hastaIDleri=" + Arrays.toString(hastaIDleri) +
                '}';
    }
}



