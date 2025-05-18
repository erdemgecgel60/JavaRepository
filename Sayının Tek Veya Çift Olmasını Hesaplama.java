
import java.util.Locale;
import java.util.Scanner;

public class yeniBos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);

        System.out.println("Sayi : ");

        int sayi = scanner.nextInt();

        if (sayi % 2 == 0) {

            System.out.println("Sayi Çifttir!");

        } else {

            System.out.println("Sayi Tektir!");

        }

    }

}
