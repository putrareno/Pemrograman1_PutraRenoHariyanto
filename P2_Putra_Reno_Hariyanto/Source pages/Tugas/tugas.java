import java.util.Scanner;

public class tugas{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String nama, hobi;
        int usia;

        // Input
        System.out.print("Input nama: ");
        nama = input.nextLine();

        System.out.print("Input usia: ");
        usia = input.nextInt();
        input.nextLine(); // penting! untuk menghindari bug input

        System.out.print("Input hobi: ");
        hobi = input.nextLine();

        // Output
        System.out.println("\n=== DATA DIRI ===");
        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia + " tahun");
        System.out.println("Hobi : " + hobi);

        input.close();
    }
}