package P3_Putra_Reno_Hariyanto.Source_Pages.Tugas;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class mengembangkan_latihan3 {

    public static void tampilkanFormat(Locale locale, double angka, double persen) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        NumberFormat percentFormat = NumberFormat.getPercentInstance(locale);

        numberFormat.setMaximumFractionDigits(2);
        currencyFormat.setMaximumFractionDigits(2);

        System.out.println("\nHasil Format:");
        System.out.println("Number   : " + numberFormat.format(angka));
        System.out.println("Currency : " + currencyFormat.format(angka));
        System.out.println("Percent  : " + percentFormat.format(persen));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        char ulang;

        do {
            System.out.println("=== PROGRAM FORMAT ANGKA INTERNASIONAL ===");

            System.out.print("Masukkan angka: ");
            double angka = Double.parseDouble(input.nextLine());

            System.out.print("Masukkan angka pecahan (contoh 0.85): ");
            double persen = Double.parseDouble(input.nextLine());

            System.out.println("\nPilih Locale / Negara:");
            System.out.println("1. Indonesia");
            System.out.println("2. US (Amerika)");
            System.out.println("3. Germany (Jerman)");
            System.out.print("Pilihan Anda: ");
            int pilihan = Integer.parseInt(input.nextLine());

            Locale locale;

            switch (pilihan) {
                case 1:
                    locale = Locale.of("id", "ID"); // ✅ FIX
                    System.out.println("\nLocale: Indonesia");
                    break;
                case 2:
                    locale = Locale.US;
                    System.out.println("\nLocale: US");
                    break;
                case 3:
                    locale = Locale.GERMANY;
                    System.out.println("\nLocale: Germany");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Default ke US.");
                    locale = Locale.US;
            }

            tampilkanFormat(locale, angka, persen);

            System.out.print("\nIngin coba lagi? (y/n): ");
            ulang = input.nextLine().charAt(0);

            System.out.println();

        } while (ulang == 'y' || ulang == 'Y');

        input.close();
        System.out.println("Program selesai. Terima kasih!");
    }
}