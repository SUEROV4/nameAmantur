import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        switch (a) {
            case "NAARYN":
                System.out.println(Region.NAARYN);
                break;
            case "CNUY":
                System.out.println(Region.CHUY);
                break;
            case "batken":
                System.out.println(Region.batken);
                break;
            case "OSH":
                System.out.println(Region.OSH);
                break;
            case "TALAS":
                System.out.println(Region.TALAS);
                break;
            case "djalal_Abad":
                System.out.println(Region.djalal_Abad);
        }
    }
}