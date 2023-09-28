import sun.java2d.loops.ScaledBlit;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList <Student> arr = new ArrayList<>();

        arr.add(new Student("Amantur", 15));
        arr.add(new Student("alym",16));
        arr.add(new Student("baijigit",null));
        for (Student s: arr) {
            if (s.getAge() < 0 ) {
                throw  new RuntimeException();
            }
            System.out.println(s);
        }
        System.out.println(arr.get(3));

    }
}
