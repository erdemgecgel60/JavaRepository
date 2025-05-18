
import java.util.Locale;
import java.util.Scanner;

public class yeniBos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);

        System.out.println("Sayi : ");

        int sayi = scanner.nextInt();

        boolean asal = true;

        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0) {

                asal = false;

                break;

            }

        }

        if (asal) {

            System.out.println("Sayi Asaldir!");

        } else {

            System.out.println("Sayi Asal Degildir!");

        }

    }

}
