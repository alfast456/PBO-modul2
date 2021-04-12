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
public class SkorUjian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int nilai;
        
        System.out.print("Masukkan Nilai : ");
        nilai = input.nextInt();
        
        switch(nilai){
            case 10:
                System.out.println(nilai +" Nilai A");
                break;
            case 9:
                System.out.println(nilai +" Nilai B");
                break;
            case 8:
                System.out.println(nilai +" Nilai C");
                break;
            default:
                System.out.println(nilai +" Nilai D");
                break;
        }
    }
    
}
