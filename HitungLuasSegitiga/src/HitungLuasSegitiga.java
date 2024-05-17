import java.util.Scanner;

public class HitungLuasSegitiga {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nilai alas
        System.out.print("Masukkan nilai alas segitiga: ");
        double alas = input.nextDouble();

        // Meminta pengguna untuk memasukkan nilai tinggi
        System.out.print("Masukkan nilai tinggi segitiga: ");
        double tinggi = input.nextDouble();

        // Menghitung luas segitiga
        double luas = 0.5 * alas * tinggi;

        // Menampilkan hasil
        System.out.println("Luas segitiga adalah: " + luas);

        // Menutup objek Scanner
        input.close();
    }
}