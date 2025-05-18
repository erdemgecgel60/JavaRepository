
import java.util.Locale;
import java.util.Scanner;

public class yeniBos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);

        System.out.println("Boyut : ");

        int boyut = scanner.nextInt();

        for (int i = 0; i < boyut; i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print("*");

            }
            System.out.println();
        }

    }

}
