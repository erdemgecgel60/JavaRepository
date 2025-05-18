
import java.util.Locale;
import java.util.Scanner;

public class yeniBos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);

        System.out.println("Sayi : ");

        int sayi = scanner.nextInt();

        int toplam = 1;

        do {

            toplam = toplam * sayi;

            sayi--;

        } while (sayi > 0);

        System.out.println("Total : " + toplam);

    }

}
