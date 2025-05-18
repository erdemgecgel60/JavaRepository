
import java.util.Locale;
import java.util.Scanner;

public class yeniBos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);

        System.out.println("Sira : ");

        int sira = scanner.nextInt();

        int ilksayi = 1;
        int ikincisayi = 1;
        int piyonDegisken;

        for (int i = 0; i < sira - 2; i++) {

            piyonDegisken = ikincisayi;

            ikincisayi += ilksayi;

            ilksayi = piyonDegisken;

        }

        System.out.println("Total : " + ikincisayi);

    }

}
