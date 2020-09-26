/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpakbejo2;

/**
 *
 * @author 26daniraditya
 */
public class ProjectPakBejo2 {
    
 int kebutuhan,panjang,lebar,isi,harga,totalHarga;
    
    ProjectPakBejo2(int k,int p, int l, int i,int h){
        kebutuhan = k;
        panjang = p;
        lebar = l;
        isi = i;
        harga = h;
    }
  
     int totalHarga() {
        int total;
        total = ((kebutuhan / (panjang * lebar)) / isi) * harga;
        return total;
       
        
    }   
}
