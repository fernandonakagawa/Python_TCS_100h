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
        Cachorro c = new Cachorro();
        c.nome = "Totó";
        c.peso = 6f;
        
        Cachorro c2 = new Cachorro();
        c2.nome = "Totó";
        c2.peso = 6f;
        
        if (c == c2) System.out.println("Igual");
        else System.out.println("Diferente");
        
        if (c.nome.equals(c2.nome)) System.out.println("Nome Igual");
        else System.out.println("Nome Diferente");
        
        c2 = c;
        if (c == c2) System.out.println("Igual");
        else System.out.println("Diferente");
        
        c = null;
        c2 = null;
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
