public class Popugay {
  private String kanat;
  private String tumshuk;
  private String svet;

  public String getKanat() {
    return kanat;
  }

  public void setKanat(String kanat) {
    this.kanat = kanat;
  }

  public String getTumshuk() {
    return tumshuk;
  }

  public void setTumshuk(String tumshuk) {
    this.tumshuk = tumshuk;
  }

  public String getSvet() {
    return svet;
  }

  public void setSvet(String svet) {
    this.svet = svet;
  }

  public Popugay(String kanat, String tumshuk, String svet) {
    this.kanat = kanat;
    this.tumshuk = tumshuk;
    this.svet = svet;
  }

  @Override
  public String toString() {
    return "Popugay{" +
            "kanat='" + kanat + '\'' +
            ", tumshuk='" + tumshuk + '\'' +
            ", svet='" + svet + '\'' +
            '}';
  }

  public Popugay() {

  }
}