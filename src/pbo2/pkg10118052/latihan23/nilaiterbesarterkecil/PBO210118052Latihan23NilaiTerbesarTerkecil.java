/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan23.nilaiterbesarterkecil;

import java.util.Scanner;
/**
 * @author 
 * NAMA      : Bagus Syibro Malisi
 * KELAS     : PBO2
 * NIM       : 10118052
 * Deskripsi Program : Program ini bertujuan untuk melihat nilai terbesar dan 
 * terkecil dari mahasiswa 
 * 
 */
public class PBO210118052Latihan23NilaiTerbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("====== Program Nilai Terbesar dan Terkecil"
                + " Nilai Mahasiswa ======");
        System.out.print("Masukan Nama Petugas : ");
        String petugas = scanner.nextLine();
        System.out.print("Masukan Jumlah Mahasiswa : ");
        
        int jumlahMhs = scanner.nextInt();
        int[] nilaiMhs = new int[jumlahMhs];
        int terbesar = -99999;
        int terkecil = 99999;
        
        
        for(int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukan Nilai Mahasiswa Ke-" + (i+1) + " = ");
            nilaiMhs[i] = scanner.nextInt();
            
            if(nilaiMhs[i] > terbesar) terbesar = nilaiMhs[i];
            if(nilaiMhs[i] < terkecil) terkecil = nilaiMhs[i];
        }
        
        System.out.println();
        System.out.println("====== Hasil Nilai Mahasiswa ======");
        for(int i = 0; i < jumlahMhs; i++) {
            System.out.println("Masukan Nilai Mahasiswa Ke-" + (i+1)
                    + " = " + nilaiMhs[i]);
        }
        
        System.out.println();
        System.out.println("Nilai Terbesar Adalah " + terbesar);
        System.out.println("Nilai Terkecil Adalah " + terkecil);
        
        System.out.println();
        System.out.println("Petugas : " + petugas);
    }
    
}
