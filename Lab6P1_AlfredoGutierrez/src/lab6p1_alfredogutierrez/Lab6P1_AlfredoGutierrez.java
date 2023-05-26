/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6p1_alfredogutierrez;

import java.util.Scanner;


/**
 *
 * @author Alfredo Gutierrez
 */
public class Lab6P1_AlfredoGutierrez {
    static Scanner sc = new Scanner(System.in);
     

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char rep = 's';
        while(rep == 's'){
           
            System.out.println("=====Menú=====");
            System.out.println("1. Calculacion de Primos");
            System.out.println("2. Frecuencia de letras");
            System.out.println("3. Salir");

            System.out.println("Ingrese su opcion: ");
            int opcion = sc.nextInt();

            if(opcion == 3){
                break;
            }
            
            String[] a = new String[26];//crea el arreglo a usado en el ejercicio 2
            
            switch (opcion){
                case 1:
                    System.out.println("");
                    break;
                    
                case 2:
                    System.out.println("Ingrese una palabra: ");
                    String palabra = sc.next();
                    
                    for(int contador = 0;contador < a.length;contador++){
                        //System.out.printf( contador, a[contador]);
                    }
                    
                    
                    
                    break;
            }
            
                
            
        
        
        } 
        
    }   
}
    

