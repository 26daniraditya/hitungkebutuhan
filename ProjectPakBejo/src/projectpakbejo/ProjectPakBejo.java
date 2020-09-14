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
public class ProjectPakBejo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Keramik A = new Keramik();
            A.ukuran = 3 * 3 ;
            A.isi = 10;
            A.harga = 54000;
            A.hitungKebutuhan();
            
            Keramik B = new Keramik();
            B.ukuran = 4 * 4;
            B.isi = 5;
            B.harga = 65000;
            B.hitungKebutuhan();
            
            Keramik C = new Keramik();
            C.ukuran = 3 * 4;
            C.isi = 8;
            C.harga = 60000;
            C.hitungKebutuhan();
        
    }
    
}
