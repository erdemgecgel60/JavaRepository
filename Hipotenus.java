
import java.util.Locale;
import java.util.Scanner;

public class yeniBos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);

        System.out.println("1.Kenar : ");

        int kenar1 = scanner.nextInt();

        System.out.println("2.Kenar : ");

        int kenar2 = scanner.nextInt();

        double total = (kenar1 * kenar1) + (kenar2 * kenar2);

        double total2 = Math.sqrt(total);

        System.out.println("Total : " + total2);

    }

}
