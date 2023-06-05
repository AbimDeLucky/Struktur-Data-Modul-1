package cobakeg1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Mau Menampilkan hasil luas dalam bentuk? :");
        System.out.println("1. Hasil to Integer");
        System.out.println("2. Hasil to Double");
        System.out.print("Masukkan pilihan 1 / 2 : ");
        int pilih = in.nextInt();

        if (pilih == 1) {
            // System.out.println("Masukkan nilai alas dan tinggi segitiga secara berurutan
            // : ");
            System.out.print("\nMasukan nilai Alas   : ");
            int alas = in.nextInt();
            System.out.print("Masukan nilai Tinggi : ");
            int tinggi = in.nextInt();
            Segitiga<Integer> luasTipeInt = new Segitiga<>(alas, tinggi);
            System.out.println("Luas Segitiga dalam Integer : " + luasTipeInt.getResultAsInt(alas, tinggi));

        } else if (pilih == 2) {
            // System.out.println("Masukkan nilai alas dan tinggi segitiga secara berurutan
            // : ");
            System.out.print("\nMasukan nilai Alas   : ");
            double alas = in.nextDouble();
            System.out.print("Masukan nilai tinggi : ");
            double tinggi = in.nextDouble();
            Segitiga<Double> luasTipeDouble = new Segitiga<>(alas, tinggi);
            System.out.println("Luas Segitiga dalam Double : " + luasTipeDouble.getResultAsDouble(alas, tinggi));
        }

    }
}
