
import java.util.Locale;
import java.util.Scanner;

public class yeniBos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);

        int ay;
        int gun;

        System.out.println("Dogdunuz Ay : ");

        ay = scanner.nextInt();

        switch (ay) {
            case 1:

                System.out.println("Dogdunuz Gunu Giriniz : ");

                gun = scanner.nextInt();

                if (gun < 0 || gun > 31) {

                    System.out.println("Hatali Secim");

                } else if (gun <= 21) {

                    System.out.println("Oğlak Burcu");

                } else {

                    System.out.println("Kova Burcu");

                }

                break;

            case 2:

                System.out.println("Dogdunuz Gunu Giriniz : ");

                gun = scanner.nextInt();

                if (gun < 0 || gun > 29) {

                    System.out.println("Hatali Secim");

                } else if (gun <= 19) {

                    System.out.println("Kova Burcu");

                } else {

                    System.out.println("Balik Burcu");

                }

                break;

            case 3:

                System.out.println("Dogdunuz Gunu Giriniz : ");

                gun = scanner.nextInt();

                if (gun < 0 || gun > 31) {

                    System.out.println("Hatali Secim");

                } else if (gun <= 20) {

                    System.out.println("Balik Burcu");

                } else {

                    System.out.println("Koç Burcu");

                }

                break;

            case 4:

                System.out.println("Dogdunuz Gunu Giriniz : ");

                gun = scanner.nextInt();

                if (gun < 0 || gun > 30) {

                    System.out.println("Hatali Secim");

                } else if (gun <= 20) {

                    System.out.println("Koç Burcu");

                } else {

                    System.out.println("Boğa Burcu");

                }

                break;

            case 5:

                System.out.println("Dogdunuz Gunu Giriniz : ");

                gun = scanner.nextInt();

                if (gun < 0 || gun > 31) {

                    System.out.println("Hatali Secim");

                } else if (gun <= 21) {

                    System.out.println("Boğa Burcu");

                } else {

                    System.out.println("İkizler Burcu");

                }

                break;

            case 6:

                System.out.println("Dogdunuz Gunu Giriniz : ");

                gun = scanner.nextInt();
                if (gun < 0 || gun > 30) {

                    System.out.println("Hatali Secim");

                } else if (gun <= 22) {

                    System.out.println("İkizler Burcu");

                } else {

                    System.out.println("Yengeç Burcu");

                }

                break;

            case 7:

                System.out.println("Dogdunuz Gunu Giriniz : ");

                gun = scanner.nextInt();

                if (gun < 0 || gun > 31) {

                    System.out.println("Hatali Secim");

                } else if (gun <= 22) {

                    System.out.println("Yengeç Burcu");

                } else {

                    System.out.println("Aslan Burcu");

                }

                break;

            case 8:

                System.out.println("Dogdunuz Gunu Giriniz : ");

                gun = scanner.nextInt();

                if (gun < 0 || gun > 31) {

                    System.out.println("Hatali Secim");

                } else if (gun <= 23) {

                    System.out.println("Aslan Burcu");

                } else {

                    System.out.println("Başak Burcu");

                }

                break;

            case 9:

                System.out.println("Dogdunuz Gunu Giriniz : ");

                gun = scanner.nextInt();

                if (gun < 0 || gun > 30) {

                    System.out.println("Hatali Secim");

                } else if (gun <= 22) {

                    System.out.println("Başak Burcu");

                } else {

                    System.out.println("Terazi Burcu");

                }

                break;

            case 10:

                System.out.println("Dogdunuz Gunu Giriniz : ");

                gun = scanner.nextInt();

                if (gun < 0 || gun > 31) {

                    System.out.println("Hatali Secim");

                } else if (gun <= 22) {

                    System.out.println("Terazi Burcu");

                } else {

                    System.out.println("Akrep Burcu");

                }

                break;

            case 11:

                System.out.println("Dogdunuz Gunu Giriniz : ");

                gun = scanner.nextInt();

                if (gun < 0 || gun > 30) {

                    System.out.println("Hatali Secim");

                } else if (gun <= 21) {

                    System.out.println("Akrep Burcu");

                } else {

                    System.out.println("Yay Burcu");

                }

                break;

            case 12:

                System.out.println("Dogdunuz Gunu Giriniz : ");

                gun = scanner.nextInt();

                if (gun < 0 || gun > 31) {

                    System.out.println("Hatali Secim");

                } else if (gun <= 21) {

                    System.out.println("Yay Burcu");

                } else {

                    System.out.println("Oğlak Burcu");

                }

                break;

            default:

                System.out.println("Hatali Secim!");
                break;
        }

    }

}
