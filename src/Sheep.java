public class Sheep {
    private String weight;
    private String age;
    private String gender;
    private String pincName;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPincName() {
        return pincName;
    }

    public void setPincName(String pincName) {
        this.pincName = pincName;
    }

    public Sheep(String weight, String age, String gender, String pincName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.pincName = pincName;
    }

    public Sheep() {
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "weight='" + weight + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", pincName='" + pincName + '\'' +
                '}';
    }
}
