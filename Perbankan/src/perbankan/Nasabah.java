/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan;

/**
 *
 * @author 62852
 */
public class Nasabah {
    private final String namaAwal;
    private final String namaAkhir;
    private Tabungan tabungan;
    
    public Nasabah(String namaAwal, String namaAkhir){
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
    }
    
    public String getNamaAwal(){
        return namaAwal;
    }
    
    public String getNamaAkhir(){
        return namaAkhir;
    }
    
    public Tabungan getTabungan(){
        return tabungan;
    }
    
    public void setTabungan(Tabungan tabungan){
        this.tabungan = tabungan;
    }
}
