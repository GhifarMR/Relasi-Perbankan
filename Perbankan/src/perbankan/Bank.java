/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan;

/**
 *
 * @author 62852
 */
public class Bank {
    private final Nasabah[] nasabah;
    private int jumlahNasabah;
    
    public Bank(){
        nasabah = new Nasabah[10];
        jumlahNasabah = 0;
    }
    
    public void tambahNasabah(String namaAwal, String namaAkhir) {
        Nasabah n = new Nasabah(namaAwal, namaAkhir);
        nasabah[jumlahNasabah] = n;
        jumlahNasabah ++;
    }
    
    public int getJumlahNasabah() {
        return jumlahNasabah;
    }
    
    public Nasabah getNasabah(int indeks){
        return nasabah[indeks];
    }
}
