/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpakbejo;

/**
 *
 * @author 26daniraditya
 */
public class Keramik {
    int kebutuhan = 10000, ukuran, isi, harga;
    
    void hitungKebutuhan(){
        int total;
        total = this.kebutuhan / this.ukuran / this.isi * this.harga;
        System.out.println("Total uang yang dibutuhkan membeli keramik adalah " + total );
    }
}
