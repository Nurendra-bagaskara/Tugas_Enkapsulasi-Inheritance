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
//class TV sebagai class anak mengextends pada class Toko sebagai Class induk
public class TV extends Toko{
    //mendeklarasikan variabel
    String jenis;
    
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

    public void setjenis(String jenis) {
        this.jenis = jenis;
    }

    public String getjenis() {
        System.out.println("Jenis Barang\t: "+jenis);
        return jenis;
    }
    
    //pengaplikasian override
    public void display() {
        System.out.println("================================");
        System.out.println("<< Data barang yang di entry >> ");
        System.out.println("================================");
    }

}
