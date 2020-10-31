/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo;
import java.util.Scanner;
/**
 *
 * @author Muhammad RIfqu Abdillah
 *  Nama : Muhammad Rifqu Abdillah
 * Kelas: Pbo-IF1
 * Nim : 10119042 
 */
public class PBO10119042Latihan21 {
    public static void main (String[] args){
        int jumlah;
        double nilai,ratarata;
        double total_nilai = 0;
        Scanner Scanner = new Scanner (System.in) ;
        System.out.print("Masukan Banyaknya Mahasiswa: ");
        
        jumlah= Scanner.nextInt();
        for( int i = 1; i <= jumlah; i++){
        System.out.printf("Nilai Mahasiswa ke- %1$d :" , i);
        nilai = Scanner.nextDouble();
        total_nilai += nilai; 
    }
        
        ratarata = total_nilai / jumlah;
        System.out.printf("%nMaka rata-rata nilainya adalah : %1$.0f%n", ratarata);
    
}
}
