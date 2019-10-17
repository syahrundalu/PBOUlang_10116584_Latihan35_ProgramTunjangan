/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan35_programtunjangan;

/**
 *
 * @author
 * NIM  : 10116584
 * NAMA : Muhammad Syahrun Dalu
 */
public class tunjangan {
    double tunjangan;
    double totalGaji;
    
    public void hitungTunjangan(double gajiPokok, String Status){
        System.out.println("===Hasil Perhitungan===");
        System.out.println("Berapa Gaji Pokok Anda Perbulan = "+gajiPokok);
        
        //proses
        tunjangan = (Status.equalsIgnoreCase("Menikah")) ? gajiPokok*0.35 : 0;
        
        System.out.println("Tunjangan : Rp. "+ tunjangan);
        
        totalGaji = tunjangan + gajiPokok;
        System.out.println("Total Gaji : Rp."+totalGaji);
        
    }    
}
