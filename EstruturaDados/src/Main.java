/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
import vetores.Vetores;
/**
 *
 * @author thiago
 */
public class Main {
    public static void main(String[] args){
        
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        
        Scanner entrada = new Scanner(System.in);
        
        for(int i = 0; i < vetor1.length; i++){
            System.out.println("Informe o "+ (i+1) +"°" +" numero inteiro");
            vetor1[i] = entrada.nextInt();
        }
   
        for(int i = 0; i < vetor1.length; i++){
            System.out.println("Numero: "+ vetor1[i] + " no index "+ i);
        }
        
        
        for(int i = vetor1.length; i > -1; i--){
            vetor2[(vetor1.length) - i)] = vetor1[i];
        }
        
        for(int i = 0; i < vetor2.length; i++){
            System.out.println("Numero: "+ vetor2[i] + " no index "+ i);
        }
       
        /*
        for(int i = 0; i < 10; i++){
            System.out.println("index "+ i);
        }
        */
    }
}
