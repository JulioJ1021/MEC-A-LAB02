/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.arrays;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author julio
 */
public class Arrays {
static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        int len;       
        float acumulador;
        double varianza, desviac_estandar;
        System.out.print("Escriba la longitud de la lista: ");
        len = leer.nextInt();
        
        float [] lista = generar_lista(len);
        
        float media = media(lista);

        acumulador = 0 ;
        for(int c = 0; c< len; c++){
            acumulador += Math.pow((lista[c]- media), 2);
        }
        varianza = acumulador/(len-1);
        desviac_estandar = Math.pow(varianza, 0.5);
        
        System.out.println("Mediana: " + mediana(lista));
        System.out.println("Media: " + media);
        System.out.println("Varianza: " + varianza);
        System.out.println("Desviación estandar: " + desviac_estandar);
        System.out.println("Moda(s): " + moda(lista));
    }

    private static float[] ordenador(float[] lista) {
        for(int j = 1; j < lista.length; j++){
            float key = lista[j];
            int i = j-1;
            while(i >= 0 && lista[i] > key){
                lista[i+1] = lista[i];
                i--;
            }
            lista[i+1] = key;
        }
        return lista;
    }

    private static String moda(float[] lista) {
        float acumulador = 0;
        String moda = "";
        float max_moda = 0;
        for(int c = 0; c < lista.length; c++){
	        acumulador ++;
	        if(c != 0){
	            if(lista[c] != lista[c-1])
	                acumulador = 1;
	                
	            if(acumulador == max_moda)
	                moda += ", " + lista[c];
	            if(acumulador > max_moda){
	                max_moda = acumulador;
	                moda = Float.toString(lista[c]);
	            }
                }
        }
        return moda;
    }

    private static Float media(float[] lista) {
        float acumulador = 0;
        float media = 0;
        
        for(int c = 0; c < lista.length; c++){
            acumulador += lista[c];
        }
        media = acumulador/ lista.length;

        return media;
    }

    private static Float mediana(float[] lista) {
        float mediana;
        if(lista.length%2 == 1){
            mediana = lista[lista.length/2];
        }
        else{
            int a = (int) ((lista.length/2) + 0.5);
            int b = (int) ((lista.length/2) - 0.5);
            mediana = (lista[a] + lista[b])/2;
        }
        return mediana;
    }

    private static float[] generar_lista(int len) {
        float [] lista = new float[len];
        for(int c = 0; c < len; c++){
            System.out.print((c+1)+":");
            lista [c] = leer.nextInt();
            System.out.print("");
        }
        lista = ordenador(lista);
        return lista;
    }
}

