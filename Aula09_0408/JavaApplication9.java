/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author SESI
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 7;
        System.out.println(x);
        dobrar(x);
        System.out.println(x);
        
        Pessoa p = new Pessoa();
        p.nome = "Karen";
        System.out.println(p.nome);
        mudarNome(p);
        System.out.println(p.nome);
        System.out.println("-======-");
        p = new Pessoa();
        p.nome = "Karen";
        System.out.println(p.nome);
        mudarNome2(p);
        System.out.println(p.nome);
    }
    public static void dobrar(int n){
        System.out.println(n *= 2);
    }
    
    public static void mudarNome(Pessoa p){
        p.nome = "Jessica";
    }
    public static void mudarNome2(Pessoa p){
        p = new Pessoa();
        p.nome = "Camila";
        System.out.println(p.nome);
    }
}
