/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfisme_1;

/**
 *
 * @author khres
 */
public class Pegawai {
    
    // Atribut yang dimiliki semua pegawai
    protected String nama;

    // Constructor untuk mengisi nama pegawai
    public Pegawai(String nama) {
        this.nama = nama;
    }

    // Method hitungGaji() yang akan di-override oleh subclass
    // Ini adalah method induk — sama seperti munculSuara() pada class Hewan di materi
    public double hitungGaji() {
        return 0; // nilai default, akan diganti oleh masing-masing subclass
    }

    // Method untuk mendapatkan nama pegawai
    public String getNama() {
        return nama;
    }
}