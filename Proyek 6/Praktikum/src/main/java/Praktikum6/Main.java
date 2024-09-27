/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum6;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        kucing Kucing = new kucing();
        Kucing.bersuara();
        Kucing.makan("ikan laut");
        Kucing.makan("ikan laut", 2);
        
        System.out.println(" ");
        
        anjing Anjing = new anjing();
        Anjing.bersuara();
        Anjing.makan("daging ayam", 3);
        
    }
}
