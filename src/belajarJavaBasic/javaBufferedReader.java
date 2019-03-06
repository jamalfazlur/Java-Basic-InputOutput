package belajarJavaBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class javaBufferedReader {
    public static void hitungBuffered(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);
        int value1 = 0;
        int value2 = 0;
        String nama = "jamal";
        System.out.println("Program sederhana menghitung");
        try {
            System.out.println("Masukkan Angka Pertama: ");
            value1 = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Masukkan Angka Kedua: ");
            value2 = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e){
            e.printStackTrace();
        }
        int hasil = value1 + value2;
        System.out.println("Hasilnya: " + hasil + nama);
    }
}
