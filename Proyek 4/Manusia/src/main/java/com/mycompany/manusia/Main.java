/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.manusia;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Pekerja pekerja = new Pekerja("Brewster", 20, "Atlet", 30000000);
        System.out.println(pekerja.toString());

        // Mencoba akses langsung atribut nama, usia, dan gaji
        // Ini akan menyebabkan kesalahan kompilasi karena akses ke atribut di luar kelas atau subclass dibatasi oleh akses modifier-nya.
        // System.out.println(pekerja.nama); // Error: nama memiliki akses private
        // System.out.println(pekerja.usia); // Error: usia memiliki akses protected dan tidak dapat diakses di luar paket jika tidak menggunakan inheritance
        // System.out.println(pekerja.gaji); // Error: gaji memiliki akses private
    }
}
