
import java.util.Locale;
import java.util.Scanner;

public class yeniBos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);

        System.out.println("Satir : ");

        int satir = scanner.nextInt();

        System.out.println("Sutun : ");

        int sutun = scanner.nextInt();

        for (int i = 0; i < satir; i++) {

            for (int j = 0; j < sutun; j++) {

                System.out.print("*");

            }
            System.out.println();

        }

    }

}
