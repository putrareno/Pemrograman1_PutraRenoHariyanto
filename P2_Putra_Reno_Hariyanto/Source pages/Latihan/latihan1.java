import java.util.Scanner;

public class latihan1{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String nama;

        System.out.print("input nama: ");
        nama = input.nextLine();

        System.out.println("Nama: " + nama);

        input.close();
    }
}