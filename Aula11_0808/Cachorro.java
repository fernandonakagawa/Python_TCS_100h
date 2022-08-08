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
public class Cachorro {
    String nome;
    float peso;
    public static int populacao = 0;
    public Cachorro(String nome, float peso){
        this.nome = nome;
        this.peso = peso;
        populacao ++;
    }
    public void latir(int quantidade){
        System.out.println(this.nome);
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Au");
        }
    }
    public static void uivar(){
        //System.out.println(this.nome + ": auuu");
        System.out.println("aaaauuuuuuuuuuuuuu " + populacao);
    }
}
