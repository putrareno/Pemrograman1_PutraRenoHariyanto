package P7_Putra_Reno_Hariyanto.Source_Pages.Latihan;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("1. Masukkan Nama");
    System.out.println("2. Cek Jurusan dan Reguler(Kelas)");
    System.out.print("Masukkan Pilihan: ");
    int pilihan = input.nextInt();

    if (pilihan == 1){
        System.out.print("Masukkan Nama Anda: ");
        String nama;
        input.nextLine();
        nama = input.nextLine();
        System.out.println("Nama anda: " + nama);

    }else{
        System.out.println("Jurusan Teknik Informatika");
        System.out.println("1. Reguler A");
        System.out.println("2. Reguler B");
        System.out.println("3. Reguler CK");
        System.out.println("4. Reguler CS");
        System.out.print("Masukkan Pilihan Reg Anda: ");
        String pilihanReg = input.next();

        switch (pilihanReg) {
            case "1": System.out.println("Reguler A Teknik Informatika");
                break;
        
            case "2": System.out.println("Reguler B Teknik Informatika");
                break;
            
            case "3": System.out.println("Reguler CK Teknik Informatika");
                break;

            case "4": System.out.println("Reguler CS Teknik Informatika");
        }

       }

}
}