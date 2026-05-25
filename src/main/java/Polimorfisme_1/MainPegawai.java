/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfisme_1;

/**
 *
 * @author khres
 */
import java.text.NumberFormat;  // format Rp
import java.util.Locale;        // format angka Indonesia

public class MainPegawai {

    public static void main(String[] args) {

        // Membuat objek PegawaiTetap: Dina dengan gaji tetap Rp50.000.000
        // Variabel bertipe Pegawai (superclass) (polimorfisme)
        Pegawai p1 = new PegawaiTetap("Dina", 50000000);

        // Membuat objek PegawaiHarian: Andi dengan 200 jam kerja × Rp200.000/jam
        // Hasil: 200 × 200.000 = Rp40.000.000
        Pegawai p2 = new PegawaiHarian("Andi", 200, 200000);

        // [Tambahan di luar materi dosen]
        // Format angka agar tampil sebagai "Rp50.000.000" bukan "50000000.0"
        NumberFormat formatRupiah = NumberFormat.getIntegerInstance(new Locale("id", "ID"));

        // Memanggil hitungGaji() — Java otomatis pilih versi yang tepat (polimorfisme dinamis)
        System.out.println("Gaji " + p1.getNama() + ": Rp" + formatRupiah.format(p1.hitungGaji()));
        System.out.println("Gaji " + p2.getNama() + ": Rp" + formatRupiah.format(p2.hitungGaji()));
    }
}