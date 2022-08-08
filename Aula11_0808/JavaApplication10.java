/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author SESI
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cachorro c = new Cachorro("Belinha", 6f);
        c.latir(10);
        System.out.println("");
        Cachorro c2 = new Cachorro("Totó", 2f);
        c2.latir(2);
        System.out.println("");
        Cachorro.uivar();
    }
    public static float func(){
        if(true){
            return -1f;
        }
        else{
            return -2f;
        }
    }
    
}
