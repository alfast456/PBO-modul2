/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbo.bankberaksi1;

/**
 *
 * @author HP
 */
public class BankBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bank myBank = new Bank(100000);
        
        System.out.println("Saldo awal: "+myBank.saldo+'\n');
        
        myBank.simpanUang(500000);
        System.out.println("Simpan Uang RP 500000");
        System.out.println("Saldo Saat Ini : "+myBank.saldo+'\n');
        
        myBank.ambilUang(150000);
        System.out.println("Simpan Uang RP 150000");
        System.out.println("Saldo Saat ini: "+myBank.saldo);
    }
    
}
