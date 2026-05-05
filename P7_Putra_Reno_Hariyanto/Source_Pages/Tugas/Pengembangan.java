package P7_Putra_Reno_Hariyanto.Source_Pages.Tugas;

import java.util.Scanner;

public class Pengembangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ulang = true;
        String pilihan;

        while (ulang) {
            System.out.println("\n=== MENU HEWAN ===");
            System.out.println("a. Komodo");
            System.out.println("b. Elang");
            System.out.print("Masukkan pilihan (a/b): ");
            pilihan = input.next();

            switch (pilihan) {
                case "a":
                    System.out.println("Hewan: Komodo");
                    System.out.println("Deskripsi: Reptil besar khas Indonesia.");
                    break;

                case "b":
                    System.out.println("Hewan: Elang");
                    System.out.println("Deskripsi: Burung pemangsa dengan penglihatan tajam.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

            // pilihan ulang
            System.out.print("\nIngin memilih lagi? (y/n): ");
            char jawab = input.next().charAt(0);

            if (jawab == 'n' || jawab == 'N') {
                ulang = false;
                System.out.println("Program selesai.");
            }
        }

        input.close();
    }
}
