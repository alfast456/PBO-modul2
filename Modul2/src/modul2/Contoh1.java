/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Contoh1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int diskon =0, totbelanja=0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Total Belanja: ");
        totbelanja = input.nextInt();
        
// IF
        if(totbelanja >= 100000){
            diskon = totbelanja/10;
        }
        System.out.println("diskon "+diskon);
        
        // if else positif negatif
        int bil;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Bilangan : ");
        bil = in.nextInt();
        
        if(bil >= 0)
            System.out.println(bil + " Bilangan positif");
        else
            System.out.println(bil + " Bilangan Negatif");
    }
    
}
