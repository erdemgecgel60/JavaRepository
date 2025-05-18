
import java.util.Locale;
import java.util.Scanner;

public class yeniBos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);

        System.out.println("Sayi : ");

        int sayi = scanner.nextInt();

        int toplam = 0;

        do {

            toplam += sayi % 10;

            sayi = sayi / 10;

        } while (sayi > 0);

        System.out.println("Rakamlari Toplami : " + toplam);

    }

}
