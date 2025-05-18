
import java.util.Locale;
import java.util.Scanner;

public class yeniBos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);

        System.out.println("Yaricap : ");

        double yaricap = scanner.nextDouble();

        double pi = 3.14;

        System.out.println("Daire Alani : " + (pi * (yaricap * yaricap)));
        System.out.println("Daire Cevresi : " + (2 * pi * yaricap));

    }

}
