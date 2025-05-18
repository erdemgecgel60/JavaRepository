
import java.util.Locale;
import java.util.Scanner;

public class yeniBos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);

        int yil;

        System.out.println("Yil : ");

        yil = scanner.nextInt();

        if (yil % 4 == 0) {

            if (yil % 100 == 0) {

                if (yil % 400 == 0) {

                    System.out.println("Artik Yildir!");

                } else {

                    System.out.println("Artik Yil Degildir!");

                }

            } else {

                System.out.println("Artik Yildir!");

            }

        } else {

            System.out.println("Artik Yil Degildir!");

        }

    }

}
