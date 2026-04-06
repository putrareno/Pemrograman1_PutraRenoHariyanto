package P4_Putra_Reno_Hariyanto.Sourcs_Pages.Tugas;

import java.util.Scanner;

public class mengembangkan_latihan4 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            System.out.println("=== PROGRAM PERHITUNGAN NILAI ===");

            System.out.print("Input Kehadiran: ");
            double kehadiran = Double.parseDouble(input.nextLine());

            System.out.print("Input Realisasi: ");
            double realisasi = Double.parseDouble(input.nextLine());

            System.out.print("Input Tugas: ");
            int tugas = Integer.parseInt(input.nextLine());

            System.out.print("Input UTS: ");
            int uts = Integer.parseInt(input.nextLine());

            System.out.print("Input UAS: ");
            int uas = Integer.parseInt(input.nextLine());

            // Perhitungan bobot
            double bobotKehadiran = kehadiran / realisasi * 10;
            double bobotTugas = tugas * 20 / 100.0;
            double bobotUTS = uts * 30 / 100.0;
            double bobotUAS = uas * 40 / 100.0;

            double total = bobotKehadiran + bobotTugas + bobotUTS + bobotUAS;

            // Output
            System.out.println("\n=== HASIL ===");
            System.out.println("Bobot Kehadiran : " + bobotKehadiran);
            System.out.println("Bobot Tugas     : " + bobotTugas);
            System.out.println("Bobot UTS       : " + bobotUTS);
            System.out.println("Bobot UAS       : " + bobotUAS);
            System.out.println("Total           : " + total);

            // Pertanyaan ulang
            System.out.print("\nApakah ingin memasukkan nilai lagi? (y/n): ");
            ulang = input.nextLine().charAt(0);

            System.out.println();

        } while (ulang == 'y' || ulang == 'Y');

        input.close();
        System.out.println("Program selesai. Terima kasih!");
    }
}