
import java.util.Locale;
import java.util.Scanner;

public class yeniBos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);

        System.out.println("Aritmetik Ortalamasini Alacağiniz Toplam Sayi : ");

        int sayilar = scanner.nextInt();

        int i = 0;

        int sayi;

        int toplam = 0;

        while (i < sayilar) {

            i++;

            System.out.println("Sayi : ");

            sayi = scanner.nextInt();

            toplam += sayi;

        }

        System.out.println("Aritmetik Ortalama : " + (toplam / sayilar));

    }

}
