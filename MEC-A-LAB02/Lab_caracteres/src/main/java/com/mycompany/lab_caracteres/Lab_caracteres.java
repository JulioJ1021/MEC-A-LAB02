/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab_caracteres;
import java.util.Scanner;
/**
 *
 * @author julio
 */
public class Lab_caracteres {
static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        String palabra;  
        System.out.print("Escriba su palabra: ");
        palabra = leer.nextLine();
        char palabra_list[] = palabra.toCharArray();
        conversor_caracteres(palabra_list);
        
    }

    private static void conversor_caracteres(char[] palabra_list) {
        String reverso = "";
	int acumulador = 0, max = 1;
        char repetido = 'a'; 
        for(int c = 0; c < palabra_list.length; c++){
	        acumulador = 0;
	        reverso = palabra_list[c] + reverso;
	        for(int x = 0; x < palabra_list.length; x++){
	            if(palabra_list[c] == palabra_list[x])
	                acumulador++;
	                
	            if(acumulador > max){    
	                max = acumulador;
	                repetido = palabra_list[c];    
	            }     
	        } 
	}
        System.out.println("Línea al revés: " + reverso);
        imprimir_convers(palabra_list, repetido);
    }

    private static void imprimir_convers(char[] palabra_list, char repetido) {
        System.out.print("Palabra con vocales reemplazadas: ");
	        for(int c = 0; c < palabra_list.length; c++){  
                    if(palabra_list[c] == 'a' || palabra_list[c] == 'e' || palabra_list[c] == 'i' 
	            || palabra_list[c] == 'o' || palabra_list[c] == 'u')
	                System.out.print(repetido);
	            else
	                System.out.print(palabra_list[c]);
	        }    
    }
}
