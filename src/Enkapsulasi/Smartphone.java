/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enkapsulasi;

/**
 *
 * @author ASUS
 */
//class smartphone sebagai class anak mengextends pada class Toko sebagai Class induk
public class Smartphone extends Toko {

    //mendeklarasikan variabel
    int jmlkamera;
    
    
// method set dan get untuk mengembalikan suatu nilai
    public void setHarga(float harga) {
        super.harga = harga;
    }

    public float getHarga() {
        System.out.println("Harga\t\t: Rp."+harga );
        return harga;
    }

    public void setTotal(int Totalunit) {
        super.Totalunit = Totalunit;
    }

    public int getTotal() {
        System.out.println("Total Unit\t: " + Totalunit);
        return Totalunit;
    }

    public void setMerk(String merk) {
        super.merk = merk;
    }

    public String getMerk() {
        System.out.println("Merk\t\t: " +merk);
        return merk;
    }

    public void setjumlah(int jmlkamera) {
        this.jmlkamera = jmlkamera;
    }

    public int getjumlah() {
        System.out.println("Jumlah Barang\t: "+jmlkamera);
        return jmlkamera;
    }
    
    //pengaplikasian override
    public void display() {
        System.out.println("================================");
        System.out.println("<< Data barang yang di entry >> ");
        System.out.println("================================");
    }

}
