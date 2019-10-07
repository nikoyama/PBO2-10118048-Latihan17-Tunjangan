/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menghitung tunjangan dan total gaji  
 */
public class PBO210118048Latihan17Tunjangan {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double gapok;   // gaji pokok
        String status;
        
        System.out.println("========Program Tunjangan========");
        System.out.print("Berapa gaji pokok anda\t\t: Rp. ");
        gapok = scanner.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum)\t: ");
        status = scanner.next().toLowerCase();
        tampilHasil(gapok, status);
    }
    
    public static void tampilHasil(double gapok, String status) {
        System.out.println("\n=====Hasil Perhitungan Gaji Anda=====");
        System.out.println("Gaji Pokok\t\t: Rp. " +gapok);
        System.out.println("Tunjangan\t\t: Rp. " +hitungTunjangan(gapok, status));
        System.out.println("Total Gaji\t\t: Rp. " +(gapok + hitungTunjangan
        (gapok, status)));
        System.out.println("(Developed by : Niko Yama)");
    } 
    
    public static double hitungTunjangan(double gapok, String status) {
        double tunjangan=(status.equals("menikah"))?0.35 * gapok:0;
        return tunjangan;
    }
}
