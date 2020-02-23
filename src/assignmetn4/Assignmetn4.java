/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignmetn4;
import java.util.*;
/**
 *
 * @author Caroline
 */
class Assignmetn4 {
    int a,b;
    public void swap(Assignmetn4 swapn){
        int temp = swapn.a;
        swapn.a = swapn.b;
        swapn.b = temp;
    }
    public static void main(String[] args) {
      Assignmetn4 fswap = new Assignmetn4();
      fswap.a = 10;
      fswap.b = 20;
      System.out.println("Before swap " + fswap.a + " " + fswap.b);
      fswap.swap(fswap);
      System.out.println("After swap " + fswap.a + " " + fswap.b);
    }
 
}
