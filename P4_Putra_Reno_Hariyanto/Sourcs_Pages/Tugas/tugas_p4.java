package P4_Putra_Reno_Hariyanto.Sourcs_Pages.Tugas;
import java.util.Scanner;


public class tugas_p4 {
    public static void main(String args[]){
        Scanner doublScanner = new Scanner(System.in);

        double makan = 20.000;
        double transport = 10.000;
        double belanja = 50.000;

        double total = makan + transport + belanja;

        double presentase_makan = makan/total * 100;
        double presentase_transport = transport/total * 100;
        double presentase_belanja = belanja/total * 100;

        System.out.println("makan: " + makan);
        System.out.println("Transport: " + transport);
        System.out.println("Belanja: " + belanja);
        System.out.println("Total: " + total);
        System.out.println("Presentase Makanan: " + presentase_makan + "%");
        System.out.println("Presentase Transport: " + presentase_transport + "%");
        System.out.println("Presentase Belanja: " + presentase_belanja + "%");
}    
}