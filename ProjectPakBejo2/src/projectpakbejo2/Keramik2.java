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
public class Keramik2 {
  public static void main(String[] args) {
     ProjectPakBejo2 a = new ProjectPakBejo2(1000000, 30, 30, 10, 54000);
     System.out.println("Total uang yang dibutuhkan membeli keramik adalah " + a.totalHarga() );
     ProjectPakBejo2 b = new ProjectPakBejo2(1000000, 40, 40, 5, 65000);
     System.out.println("Total uang yang dibutuhkan membeli keramik adalah " + b.totalHarga() );
     ProjectPakBejo2 c = new ProjectPakBejo2(1000000, 30, 40, 8, 54000);
     System.out.println("Total uang yang dibutuhkan membeli keramik adalah " + c.totalHarga() );
 }
}
