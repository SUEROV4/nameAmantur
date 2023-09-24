import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a > b) {
                System.out.println("бизди б кичине ");
            } else {
                System.out.println("бизде а кичине");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Amantur");
        }
    }
}
