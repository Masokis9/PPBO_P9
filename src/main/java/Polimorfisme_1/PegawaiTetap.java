/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfisme_1;

/**
 *
 * @author khres
 */
public class PegawaiTetap extends Pegawai {

    // Atribut khusus PegawaiTetap: gaji bulanan yang tetap
    private double gajiBulanan;

    // Constructor: menerima nama dan besar gaji bulanan
    public PegawaiTetap(String nama, double gajiBulanan) {
        super(nama); // memanggil constructor class induk Pegawai
        this.gajiBulanan = gajiBulanan;
    }

    // Override method hitungGaji() dari class Pegawai
    // Pegawai Tetap: langsung kembalikan gaji bulanan tetap
    @Override
    public double hitungGaji() {
        return gajiBulanan;
    }
}