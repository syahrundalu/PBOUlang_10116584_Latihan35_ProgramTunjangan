/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan35_programtunjangan;

import java.util.Scanner;

/**
 *
 * @author 
 * NIM  : 10116584
 * NAMA : Muhammad Syahrun Dalu
 */
public class PBOUlang_10116584_Latihan35_ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        tunjangan myTunjangan = new tunjangan();
        
        System.out.println("===PROGRAM TUNJANGAN===");
        System.out.print("Berapa Gaji Pokok Anda sebulan = Rp.");
        int gajiPokok = scan.nextInt();
        System.out.print("Status Anda? (Menikah/Belum)   = ");
        String status = scan.next();
        System.out.println("");
        
        myTunjangan.hitungTunjangan(gajiPokok, status);
        System.out.println("Developed by Muhammad Syahrun Dalu");
    }
    
}
