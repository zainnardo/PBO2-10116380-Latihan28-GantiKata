/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan28.gantikata;

import java.util.Scanner;

/**
 * @author 
 * NAMA: Zain Achamd Rizqullah
 * KELAS: PBO2
 * NIM: 10116380
 * Deskripsi: Program Ganti Kata  
 */
public class PBO210116380Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String said1;
        String said2;
        String said3;

        Scanner kata = new Scanner(System.in);

        System.out.println("===== Program Mengganti Nama =====");
        System.out.println("");
        System.out.print("Masukkan Kalimat\t : ");
        said1 = kata.nextLine();
        System.out.print("Ganti Kata\t : ");
        said2 = kata.next();
        System.out.print("Menjadi Kata\t : ");
        said3 = kata.next();

        System.out.println("");
        System.out.println("===== Hasil Formatting =====");
        System.out.println("Kalimat Awal\t : " + said1);
        String kataAkhir = said1.replace(said2, said3);
        System.out.println("Kalimat Baru\t : " + kataAkhir);
        
    }
    
}
