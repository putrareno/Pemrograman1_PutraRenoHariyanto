package P8_Putra_Reno_Hariyanto.Source_Pages.Tugas;

import java.util.Scanner;

public class RataRataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai, total = 0, jumlah = 0;
        char pilihan;

        do {
            System.out.print("Masukkan nilai mahasiswa: ");
            nilai = input.nextInt();
            total += nilai;
            jumlah++;

            System.out.print("Ingin input lagi? (y/t): ");
            pilihan = input.next().charAt(0);

        } while (pilihan == 'y' || pilihan == 'Y');

        double rataRata = (double) total / jumlah;

        System.out.println("Total nilai: " + total);
        System.out.println("Jumlah mahasiswa: " + jumlah);
        System.out.println("Rata-rata nilai: " + rataRata);

        input.close();
    }
}