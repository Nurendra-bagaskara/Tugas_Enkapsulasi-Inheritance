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
//class KipasAngin sebagai class anak mengextends pada class Toko sebagai Class induk
public class KipasAngin extends Toko{
    //mendeklarasikan variabel
    int ukuran;
 
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

    public void setUkuran(int Ukuran) {
        this.ukuran= Ukuran;
    }

    public int getUkaran() {
        System.out.println("Ukuran Barang\t: "+ukuran);
        return ukuran;
    }
    
    //pengaplikasian override
    public void display() {
        System.out.println("================================");
        System.out.println("<< Data barang yang di entry >> ");
        System.out.println("================================");
    }
    
}
