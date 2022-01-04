/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] juego = new int[5];
        int numero;
        int errores = 0, correctos = 0;
        Random rm = new Random();
        for(int i = 0; i < 5; i++){
            juego[i] = rm.nextInt(100);
        }
        
        
        do{
            System.out.println("Tecleea un numero:");
            numero = sc.nextInt();
            for(int x=0; x<5 ; x++){
                if(numero == juego[x]){
                    System.out.println("Correcto");
                    correctos++;
                } else {
                    errores++;
                }
            }
        }while(errores==5 || correctos==5);
        
    }

    
    
}
