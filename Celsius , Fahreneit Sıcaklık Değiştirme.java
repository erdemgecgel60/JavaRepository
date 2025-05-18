
import java.util.Locale;
import java.util.Scanner;

public class yeniBos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);

        System.out.println("1 : Celsius to Fahreneit");
        System.out.println("2 : Fahreneit to Celsius");
        System.out.println("Secim : ");

        int secim = scanner.nextInt();

        double celsius;

        double toplam;

        if (secim == 1) {

            System.out.println("Celsius Değerini Giriniz : ");

            celsius = scanner.nextDouble();

            toplam = (celsius * 1.8) + 32;

            System.out.println("Toplam : " + toplam);

        } else if (secim == 2) {

            System.out.println("Celsius Değerini Giriniz : ");

            celsius = scanner.nextDouble();

            toplam = (celsius - 32) / 1.8;

            System.out.println("Toplam : " + toplam);

        } else {

            System.out.println("Hatali Secim!");

        }

    }

}
