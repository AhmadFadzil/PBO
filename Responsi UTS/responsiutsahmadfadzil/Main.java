/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiutsahmadfadzil;

/**
 *
 * @author ASUS
 */
public class Main {
    
     public static void main(String[] args) {
     // Polimorfisme dengan Produk
     Produk produk1 = new Elektronik("Laptop", 8000000, 2);
     Produk produk2 = new Makanan("Sarden", 15000, "2023-10-30");
     // Polimorfisme dengan Pegawai
     Pegawai pegawai1 = new PegawaiTetap("Reno", 7000000, 1000000);
     PegawaiKontrak pegawai2 = new PegawaiKontrak("Johan", 3000000, 12);
     // Menampilkan informasi produk
     System.out.println("Output Produk:");
     produk1.tampilkanInfo();
     System.out.println();
     produk2.tampilkanInfo();
     System.out.println();
     // Menampilkan informasi pegawai
     System.out.println("Output Pegawai:");
     pegawai1.tampilkanInfo();
     System.out.println();
     pegawai2.tampilkanInfo();
 }
}
