public enum Region {
    batken("Мен баткенге бардым"),
    djalal_Abad("Мен Жалал_Абадка "),
    ISSYK_KOL("Мен Ысык_Колго бардым"),
    NAARYN("Мен Нарынга Бардым"),
    OSH("Мен Ош ко бардым"),
    TALAS("Мен Таласка Бардым"),
    CHUY("Мен Чуйго бардым");
    private String mean;

    Region(String mean) {
        this.mean = mean;
    }

    @Override
    public String toString() {
        return "Region{" +
                "mean='" + mean + '\'' +
                '}';
    }
}
