package P4_Putra_Reno_Hariyanto.Sourcs_Pages.Latihan;

import java.util.Scanner;

public class Latihan4 {
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int  tugas, uts, uas;
    float bobotTugas, bobotUTS,bobotUAS;


    System.out.print("Input Kehadiran: ");
    double kehadiran = input.nextInt();
    input.nextLine();
    System.out.print("Input Realisasi: ");
    double realisasi = input.nextInt();
    input.nextLine();
    System.out.print("Input Tugas: ");
    tugas = input.nextInt();
    input.nextLine();
    System.out.print("Input UTS: ");
    uts = input.nextInt();
    input.nextLine();
    System.out.print("Input UAS: ");
    uas = input.nextInt();
    input.nextLine();

    double bobotKehadiran = kehadiran/realisasi * 10;
    bobotTugas = tugas*20/100;
    bobotUAS = uas*40/100;
    bobotUTS = uts*30/100;

    double total = bobotKehadiran + bobotTugas + bobotUAS + bobotUTS;


    System.out.println("Bobot Kehadiran : " + bobotKehadiran);
    System.out.println("Bobot Tugas : " + bobotTugas);
    System.out.println("Bobot UTS : " + bobotUTS);
    System.out.println("Bobot UAS : " + bobotUAS);
    System.out.println("Total : " + total);




}
}