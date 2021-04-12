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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // objek yang digunakan untuk pemanggilan di class main
        Toko input = new Toko();
        Smartphone input1 = new Smartphone();
        TV input2 = new TV();
        KipasAngin input3 = new KipasAngin();
        
        // pemanggilan class Toko di dalam class main
        input.setAdmin("Bagas");
        input.getAdmin();
        
        // pemanggilan class Smartphone di dalam class main
        input1.display();
        input1.setHarga(3000000);
        input1.setTotal(2);
        input1.setMerk("Samsung");
        input1.setjumlah(2);
        input1.getHarga();
        input1.getTotal();
        input1.getMerk();
        input1.getjumlah();
        
        // pemanggilan class TV di dalam class main
        input2.display();
        input2.setHarga(4000000);
        input2.setTotal(2);
        input2.setMerk("Polytron");
        input2.setjenis("LED");
        input2.getHarga();
        input2.getTotal();
        input2.getMerk();
        input2.getjenis();
        
        // pemanggilan class KipasAngin di dalam class main
        input3.display();
        input3.setHarga(600000);
        input3.setTotal(2);
        input3.setMerk("Maspion");
        input3.setUkuran(14);
        input3.getHarga();
        input3.getTotal();
        input3.getMerk();
        input3.getUkaran();
        
    } 
    
}
