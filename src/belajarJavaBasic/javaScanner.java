package belajarJavaBasic;

import java.util.Scanner;

public class javaScanner {
    public static void hitungScanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumlahan sederhana");
        System.out.println("Masukkan Angka Pertama: ");
        int value1 = scanner.nextInt();
        System.out.println("Masukkan Angka Kedua: ");
        int value2 = scanner.nextInt();
        int hasil = value1 + value2;
        System.out.println("Hasil Penjumlahan: " + hasil);
    }
}
