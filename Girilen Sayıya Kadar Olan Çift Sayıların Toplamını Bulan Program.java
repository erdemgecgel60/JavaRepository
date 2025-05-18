
import java.util.Locale;
import java.util.Scanner;

public class yeniBos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);

        System.out.println("Sayi : ");

        int sayi = scanner.nextInt();

        int toplam = 0;

        for (int i = 0; i < sayi; i++) {

            if (i % 2 == 1) {

                continue;

            }

            toplam += i;

        }

        System.out.println("Total : " + toplam);

    }

}
