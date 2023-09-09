public class Baluk {
        private String ikra;
        private String teri;
        private int kg;

    public String getIkra() {
        return ikra;
    }

    public void setIkra(String ikra) {
        this.ikra = ikra;
    }

    public String getTeri() {
        return teri;
    }

    public void setTeri(String teri) {
        this.teri = teri;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    public Baluk(String ikra, String teri, int kg) {
        this.ikra = ikra;
        this.teri = teri;
        this.kg = kg;
    }

    public Baluk() {
    }

    @Override
    public String toString() {
        return "Baluk{" +
                "ikra='" + ikra + '\'' +
                ", teri='" + teri + '\'' +
                ", kg=" + kg +
                '}';
    }
}
