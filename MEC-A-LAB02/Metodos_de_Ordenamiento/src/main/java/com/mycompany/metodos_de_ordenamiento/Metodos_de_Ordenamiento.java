/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodos_de_ordenamiento;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author julio
 */
public class Metodos_de_Ordenamiento {
static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        int lista[] = new int[5000];
        int metodo , a = 1;
        lista = random(lista);
        while(a != 0){
            System.out.println("\nSeleccione el método de ordenamiento \n1. Burbuja\n2. Insert\n3. Selección\n4. Finalizar el programa");
            metodo = leer.nextInt();
            if(metodo == 4)
                break;
            System.out.print("Antes: ");  
            imprimir_lista(lista);
            metodo_sw(lista, metodo);
        }
        
    }
    public static void imprimir_lista(int lista[]){
        System.out.print("{");
        for(int c = 0; c < lista.length; c++){
            if(c!=0)
                System.out.print(", ");
            System.out.print(lista[c]);
        }
        System.out.println("}");
    }
    public static int[] random(int lista[]){
        for(int c = 0; c < lista.length; c++){
            int aleatorio = (int) (Math.random()*100);
            lista[c] = aleatorio;
        }
        return lista;
    }
    public static int[] burbuja(int lista[]){
        int aux = 0;
        for(int c = 0; c < lista.length; c++){
            for(int x = 0; x < (lista.length - 1); x++){
                if(lista[x] > lista[x+1]){                
                aux = lista[x];
                lista[x] = lista[x+1];
                lista[x+1] = aux; 
                }
            }
        }
        System.out.print("Después del método burbuja: ");
        imprimir_lista(lista);
        return lista;
    }

    private static int[] insert(int[] lista) {
        for(int j = 1; j < lista.length; j++){
            int key = lista[j];
            int i = j-1;
            while(i >= 0 && lista[i] > key){
                lista[i+1] = lista[i];
                i--;
            }
            lista[i+1] = key;
        }
        System.out.print("Después del método insertion: ");
        imprimir_lista(lista);
        return lista;
    }

    private static int[] selection(int[] lista) {
        int min,aux;
        for (int i = 0; i < lista.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < lista.length ; j++) {
                if (lista[j] < lista[min]) 
                    min = j;
            }
            aux = lista[i];
            lista[i] = lista[min];
            lista[min] = aux;
                   
        }
        System.out.print("Después del método selección: ");
        imprimir_lista(lista);
        return lista;
    }

    private static void metodo_sw(int[] lista, int metodo) {
        switch(metodo){
            case 1:
                lista = burbuja(lista);
                break;
            case 2:
                lista = insert(lista);
                break;
            case 3:
                lista = selection(lista);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }    
    }
}

