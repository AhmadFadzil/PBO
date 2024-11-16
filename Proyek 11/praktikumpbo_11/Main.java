/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumpbo_11;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Buku
        Buku buku1 = new Buku("Tutorial Hacking ");
        Buku buku2 = new Buku("Pemrograman Python");
        Buku buku3 = new Buku("Pemrograman Rust");

        // Membuat objek Perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);

        // Menampilkan informasi perpustakaan
        System.out.println("Informasi Perpustakaan:");
        perpustakaan.infoPerpustakaan();

        // Membuat objek Anggota
        Anggota anggota1 = new Anggota("Rino");
        Anggota anggota2 = new Anggota("Ridho");
        Anggota anggota3 = new Anggota("Arhan");

        // Membuat objek Klub
        Klub klubPemrograman = new Klub("Klub Pemrograman");
        klubPemrograman.tambahAnggota(anggota1);
        klubPemrograman.tambahAnggota(anggota2);
        klubPemrograman.tambahAnggota(anggota3);

        // Menampilkan informasi klub
        System.out.println("\nInformasi Klub:");
        klubPemrograman.infoKlub();
    }
}
