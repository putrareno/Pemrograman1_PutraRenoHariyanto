package P7_Putra_Reno_Hariyanto.Source_Pages.Latihan;

import java.util.Scanner;

public class Latihan7 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String pilihan, hewan;
    
    System.out.println("Input Pilihan (a/b): ");
    
    pilihan = input.next();

    switch (pilihan) {
        case "a": System.out.println(hewan = "Komodo");
            break;
    
        case "b": System.out.println(hewan = "Elang");
            break;
    
    }
    }
}
