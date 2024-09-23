/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumpbo_5;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) throws Exception {
        // Test for Hewan class
        Kucing kucing = new Kucing();
        kucing.nama = "John";
        kucing.jenis = "Kucing Anggora";
        kucing.tampilkanInfo();

        Anjing anjing = new Anjing();
        anjing.nama = "Arthur";
        anjing.jenis = "Himalayan";
        anjing.tampilkanInfo();

        // Test for Kendaraan class
        Mobil mobil = new Mobil();
        mobil.nama = "Mustang";
        mobil.kecepatan = 200;
        mobil.jumlahPintu = 2;
        mobil.tampilkanInfo();

        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Ducati";
        motor.kecepatan = 170;
        motor.jenisMesin = "4-tak";
        motor.tampilkanInfo();
    }

}
