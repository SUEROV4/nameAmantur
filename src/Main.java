import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Cow cow =new Cow();
cow.setAge("12");
cow.setGender("man");
cow.setPincName("SuerovAmantur");
cow.setWeight("14");
        System.out.println(cow);



        Sheep sheep =new Sheep();
        sheep.setAge("15");
        sheep.setGender("myskoi");
        sheep.setPincName("SuerovAmantur");
        sheep.setWeight("58");
        System.out.println(sheep);



        Horse horse =new Horse();
        horse.setAge("13");
        horse.setColor("krasnuy");
        horse.setPincName("SuerovAmantur");
        horse.setWeight("57");
        horse.setGender("myskoy");
            System.out.println(horse);



            Farm farm =new Farm();
            farm.setCows("korova");
            farm.setAdsres("46.1");
            farm.setHorses("loshad");
            farm.setOwnerName("Daniel");
            farm.setSheep("baran");
        System.out.println(farm);
    }
}