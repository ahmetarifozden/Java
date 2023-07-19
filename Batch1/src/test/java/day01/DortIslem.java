package day01;

import java.util.Scanner;

public class DortIslem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // İki sayıyı kullanıcıdan alın
        System.out.print("Birinci sayıyı girin: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();

        // Toplama işlemi
        double toplam = sayi1 + sayi2;
        System.out.println("Toplam: " + toplam);

        // Çıkarma işlemi
        double fark = sayi1 - sayi2;
        System.out.println("Fark: " + fark);

        // Çarpma işlemi
        double carpim = sayi1 * sayi2;
        System.out.println("Çarpım: " + carpim);

        // Bölme işlemi
        if (sayi2 != 0) {
            double bolum = sayi1 / sayi2;
            System.out.println("Bölüm: " + bolum);
        } else {
            System.out.println("Bir sayıyı 0'a bölemezsiniz!");
        }

        scanner.close();
    }
}
