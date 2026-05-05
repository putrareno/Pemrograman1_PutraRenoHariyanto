package P8_Putra_Reno_Hariyanto.Source_Pages.Latihan;

import java.util.Scanner;

public class inputMahasiswaSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang ;
        do {
            System.out.print("Masukkan nama mahasiswa: ");
            String nama = input.nextLine();

            System.out.print("Masukkan NIM mahasiswa: ");
            String nim = input.nextLine();

            System.out.println("Data Mahasiswa:");
            System.out.println("Nama: " + nama);
            System.out.println("NIM: " + nim);

            System.out.print("Ingin memasukkan data lagi? (y/n): ");
            ulang = input.nextLine().charAt(0);
        } while (ulang == 'y' || ulang == 'Y');
    }
    
}
