 
import java.util.Locale;
import java.util.Scanner;

public class yeniBos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);

        System.out.println("Sayi : ");

        int sayi = scanner.nextInt();

         if(sayi > 0)
         {

            System.out.println("Sayi Pozitiftir!");

         }
         else if (sayi == 0)
         {

            System.out.println("Sayı Notrdir!");

         }
         else 
         {

            System.out.println("Sayi Negatiftir!");

         }

    }

}
