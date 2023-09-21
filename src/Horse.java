public class Horse {
    private String weight;
    private String age;
    private String color;
    private String pincName;
    private String gender;

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPincName() {
        return pincName;
    }

    public void setPincName(String pincName) {
        this.pincName = pincName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Horse(String weight, String age, String color, String pincName, String gender) {
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.pincName = pincName;
        this.gender = gender;
    }

    public Horse() {
    }

    @Override
    public String toString() {
        return "Horse{" +
                "weight='" + weight + '\'' +
                ", age='" + age + '\'' +
                ", color='" + color + '\'' +
                ", pincName='" + pincName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
