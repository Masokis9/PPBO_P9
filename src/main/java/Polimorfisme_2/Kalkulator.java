/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfisme_2;

/**
 *
 * @author khres
 */
class Kalkulator {

    public int tambah(int a, int b) {
        return a + b;
    }

    public double tambah(double a, double b) {
        return a + b;
    }

    public int tambah(int a, int b, int c) {
        return a + b + c;
    }
    
    public int kurang(int a, int b) {
        return a - b;
    }

    public double kurang(double a, double b) {
        return a - b;
    }

    public int kurang(int a, int b, int c) {
        return a - b - c;
    }
    
    public int kali(int a, int b) {
        return a * b;
    }

    public double kali(double a, double b) {
        return a * b;
    }

    public int kali(int a, int b, int c) {
        return a * b * c;
    }
    
    public double bagi(int a, int b) {
        if (b == 0) {
            System.out.println("Error: tidak bisa membagi dengan nol!");
            return 0;
        }
        return (double) a / b;
    }

    public double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Error: tidak bisa membagi dengan nol!");
            return 0;
        }
        return a / b;
    }

    public double bagi(int a, int b, int c) {
        if (b == 0 || c == 0) {
            System.out.println("Error: tidak bisa membagi dengan nol!");
            return 0;
        }
        return (double) a / b / c;
    }
}