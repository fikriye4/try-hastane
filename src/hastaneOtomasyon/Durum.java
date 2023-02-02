package hastaneOtomasyon;

    public class Durum {
        private String aktuelDurum;
        private boolean acilMi;
        public Durum(){};
        public Durum(String aktuelDurum) {
            this.aktuelDurum = aktuelDurum;
        }
        public Durum(boolean acilMi) {
            this.acilMi = acilMi;
        }
        public Durum(String aktuelDurum, boolean acilMi) {
            this.aktuelDurum = aktuelDurum;
            this.acilMi = acilMi;
        }
        public boolean isAcilMi() {
            return acilMi;
        }
        public void setAcilMi(boolean acilMi) {
            this.acilMi = acilMi;
        }
        public String getAktuelDurum() {
            return aktuelDurum;
        }
        public void setAktuelDurum(String aktuelDurum) {
            this.aktuelDurum = aktuelDurum;
        }
        @Override
        public String toString() {
            return "Durum{" +
                    "aktuelDurumu='" + aktuelDurum + '\'' +
                    ", acilMi=" + acilMi +
                    '}';
        }
    }