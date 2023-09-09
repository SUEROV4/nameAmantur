public class Mushk {
    private String kuyruk;
    private String murdu;
    private String svet;

    public String getKanat() {
        return kuyruk;
    }

    public void setKanat(String kanat) {
        this.murdu = kanat;
    }

    public String getTumshuk() {
        return svet;
    }

    public void setTumshuk(String tumshuk) {
        this.svet = tumshuk;
    }

    public String getSvet() {
        return svet;
    }

    public void setSvet(String svet) {
        this.svet = svet;
    }

    public Mushk(String kanat, String tumshuk, String svet) {
        this.kuyruk = kanat;
        this.murdu = tumshuk;
        this.svet = svet;
    }

    public Mushk() {
    }

    @Override
    public String toString() {
        return "Mushk{" +
                "kuyruk='" + kuyruk + '\'' +
                ", murdu='" + murdu + '\'' +
                ", svet='" + svet + '\'' +
                '}';
    }
}

