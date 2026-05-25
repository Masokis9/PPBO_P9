/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfisme_1;

/**
 *
 * @author khres
 */
public class PegawaiHarian extends Pegawai {

    // Atribut khusus PegawaiHarian
    private int    jamKerja;   // total jam kerja dalam sebulan
    private double upahPerJam; // upah yang diterima per jam kerja

    // Constructor: menerima nama, jam kerja, dan upah per jam
    public PegawaiHarian(String nama, int jamKerja, double upahPerJam) {
        super(nama); // memanggil constructor class induk Pegawai
        this.jamKerja   = jamKerja;
        this.upahPerJam = upahPerJam;
    }

    // Override method hitungGaji() dari class Pegawai
    // Pegawai Harian: gaji = jam kerja × upah per jam
    @Override
    public double hitungGaji() {
        return jamKerja * upahPerJam;
    }
}