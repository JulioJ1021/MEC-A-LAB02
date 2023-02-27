package com.mycompany.arreglo_de_carros;

public class Clase_Carros {
    
    String modelo, kilometraje;
    String marca, color; 

    public Clase_Carros(String modelo, String kilometraje, String marca, String color) {
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.marca = marca;
        this.color = color;
    }
    
    public Integer int_modelo(){
        return Integer.valueOf(this.modelo);
    }
    public String mostrar_datos(){
        return ("Modelo: " + modelo + ". Kilometraje: " + kilometraje + ". Marca: " + marca + ". Color: " + color + "\n");
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
