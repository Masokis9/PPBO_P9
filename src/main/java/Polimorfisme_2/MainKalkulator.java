/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfisme_2;

/**
 *
 * @author khres
 */
public class MainKalkulator {
    public static void main(String[] args) {

        Kalkulator k = new Kalkulator();

        // TAMBAH
        System.out.println("===== TAMBAH =====");
        System.out.println("tambah(5, 3)        = " + k.tambah(5, 3));
        System.out.println("tambah(2.5, 1.5)    = " + k.tambah(2.5, 1.5));
        System.out.println("tambah(2, 3, 4)     = " + k.tambah(2, 3, 4));

        // KURANG
        System.out.println("\n===== KURANG =====");
        System.out.println("kurang(10, 4)       = " + k.kurang(10, 4));
        System.out.println("kurang(5.5, 2.5)    = " + k.kurang(5.5, 2.5));
        System.out.println("kurang(10, 3, 2)    = " + k.kurang(10, 3, 2));

        // KALI
        System.out.println("\n===== KALI =====");
        System.out.println("kali(4, 3)          = " + k.kali(4, 3));
        System.out.println("kali(2.5, 4.0)      = " + k.kali(2.5, 4.0));
        System.out.println("kali(2, 3, 4)       = " + k.kali(2, 3, 4));

        // BAGI
        System.out.println("\n===== BAGI =====");
        System.out.println("bagi(10, 2)         = " + k.bagi(10, 2));
        System.out.println("bagi(7.5, 2.5)      = " + k.bagi(7.5, 2.5));
        System.out.println("bagi(100, 5, 2)     = " + k.bagi(100, 5, 2));
        System.out.println("bagi(10, 0)         = " + k.bagi(10, 0));
    }
}