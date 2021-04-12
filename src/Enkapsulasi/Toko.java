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
public class Toko {

    //mendeklarasikan variabel
    private String admin;
    float harga;
    int Totalunit;
    String merk;

    //method display untuk menampilkan kata "Data barang yang di entry"
    public void display() {
        System.out.println("================================");
        System.out.println("<< Data barang yang di entry >> ");
        System.out.println("================================");
    }

    
    // method yang digunakan untuk mengembalikan nilai
    public void setAdmin(String admin) {
        this.admin = admin;
        System.out.println("Admin\t\t :"+admin);
    }

    public String getAdmin() {
        return admin;
    }

}
