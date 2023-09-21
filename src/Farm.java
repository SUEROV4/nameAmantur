public class Farm {
    private String adsres;
    private String cows;
    private String horses;
    private String sheep;
    private String OwnerName;

    public String getAdsres() {
        return adsres;
    }

    public void setAdsres(String adsres) {
        this.adsres = adsres;
    }

    public String getCows() {
        return cows;
    }

    public void setCows(String cows) {
        this.cows = cows;
    }

    public String getHorses() {
        return horses;
    }

    public void setHorses(String horses) {
        this.horses = horses;
    }

    public String getSheep() {
        return sheep;
    }

    public void setSheep(String sheep) {
        this.sheep = sheep;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    public Farm(String adsres, String cows, String horses, String sheep, String ownerName) {
        this.adsres = adsres;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheep;
        OwnerName = ownerName;
    }

    public Farm() {
    }

    @Override
    public String toString() {
        return "Farm{" +
                "adsres='" + adsres + '\'' +
                ", cows='" + cows + '\'' +
                ", horses='" + horses + '\'' +
                ", sheep='" + sheep + '\'' +
                ", OwnerName='" + OwnerName + '\'' +
                '}';
    }
}
