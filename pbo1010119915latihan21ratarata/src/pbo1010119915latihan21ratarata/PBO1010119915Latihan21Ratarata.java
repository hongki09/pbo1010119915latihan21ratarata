/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1010119915latihan21ratarata;

import java.util.Scanner;

/**
 *
 * @author M Hongki Alfikram
 * Kelas : IF10-K
 * NIM :10119915
 */
public class PBO1010119915Latihan21Ratarata {

    static int mahasiswa;
    static double[] nilai_mahasiswa;

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner input_nilai = new Scanner(System.in);
        int i, mahasiswa;
        float jumlah_nilai, nilai_per_mahasiswa, rata;
        System.out.print ("Masukan Banyaknya Mahasiswa: ");
        mahasiswa = input_nilai.nextInt();
        jumlah_nilai=0;
        i=1;
        while (i<=mahasiswa){
                System.out.print ("Nilai Mahasiswa ke-"+i+": ");
                nilai_per_mahasiswa=input_nilai.nextFloat ();
                jumlah_nilai += nilai_per_mahasiswa;
                i++;
        }
        rata = jumlah_nilai / mahasiswa;
        System.out.println ("Rata-rata: "+rata);

    }

}
