/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segitiga;

/**
 *
 * @author HP
 */
public class SegitigaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Segitiga kecil = new Segitiga(5);
        System.out.println(kecil.gambarSegitiga());
        
        Segitiga besar = new Segitiga(10);
        System.out.println(besar.gambarSegitiga());
    }
    
}
