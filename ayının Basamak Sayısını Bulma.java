
import java.util.Locale;
import java.util.Scanner;

public class yeniBos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);

        System.out.println("Sayi : ");

        int sayi = scanner.nextInt();

        int hane = 0;

        do {

            sayi = sayi / 10;
            hane++;

        } while (sayi > 0);

        System.out.println("Hane Sayisi : " + hane);

    }

}
