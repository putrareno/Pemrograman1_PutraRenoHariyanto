package P8_Putra_Reno_Hariyanto.Source_Pages.Latihan;

import java.util.Scanner;

public class latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ulang = true;
        int totalPertemuan = 21;

        while (ulang) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Input Kehadiran");
            System.out.println("2. Input Nilai Tugas");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah kehadiran: ");
                    int kehadiran = input.nextInt();

                    double persen = (double) kehadiran / totalPertemuan * 100;
                    System.out.println("Persentase Kehadiran: " + persen + "%");

                    if (persen >= 75) {
                        System.out.println("Kehadiran memenuhi syarat.");
                    } else {
                        System.out.println("Kehadiran di bawah 75%!");

                        System.out.println("1. Input ulang");
                        System.out.println("2. Tampilkan data");
                        System.out.print("Pilih: ");
                        int opsi = input.nextInt();

                        if (opsi == 1) {
                            System.out.print("Masukkan ulang kehadiran: ");
                            kehadiran = input.nextInt();
                            persen = (double) kehadiran / totalPertemuan * 100;
                            System.out.println("Persentase baru: " + persen + "%");
                        } else {
                            System.out.println("Data tetap ditampilkan.");
                        }
                    }
                    break;

                case 2:
                    System.out.print("Masukkan nilai tugas: ");
                    int tugas = input.nextInt();

                    if (tugas >= 70) {
                        System.out.println("Nilai tugas memenuhi syarat.");
                    } else {
                        System.out.println("Nilai tugas di bawah 70!");

                        System.out.println("1. Input ulang");
                        System.out.println("2. Tampilkan nilai");
                        System.out.print("Pilih: ");
                        int opsi = input.nextInt();

                        if (opsi == 1) {
                            System.out.print("Masukkan ulang nilai tugas: ");
                            tugas = input.nextInt();
                            System.out.println("Nilai baru: " + tugas);
                        } else {
                            System.out.println("Nilai tetap: " + tugas);
                        }
                    }
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

            // pilihan ulang program
            System.out.print("\nIngin memilih menu lagi? (y/n): ");
            char jawab = input.next().charAt(0);

            if (jawab == 'n' || jawab == 'N') {
                ulang = false;
                System.out.println("Program selesai.");
            }
        }

        input.close();
    }
}