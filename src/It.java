public class It {
    private String turmak;
    private String ruyruk;
    private String slux;

    public String getTurmak() {
        return turmak;
    }

    public void setTurmak(String turmak) {
        this.turmak = turmak;
    }

    public String getRuyruk() {
        return ruyruk;
    }

    public void setRuyruk(String ruyruk) {
        this.ruyruk = ruyruk;
    }

    public String getSlux() {
        return slux;
    }

    public void setSlux(String slux) {
        this.slux = slux;
    }

    public It(String turmak, String ruyruk, String slux) {
        this.turmak = turmak;
        this.ruyruk = ruyruk;
        this.slux = slux;
    }

    @Override
    public String toString() {
        return "It{" +
                "turmak='" + turmak + '\'' +
                ", ruyruk='" + ruyruk + '\'' +
                ", slux='" + slux + '\'' +
                '}';
    }

    public It() {
    }
}
