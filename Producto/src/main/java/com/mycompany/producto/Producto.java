/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producto;

/**
 *
 * @author Gercray
 */
public class Producto {
    private String nombre;
    private double precio;
    
    public void Producto(){
        
    }
    
    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public void Datos_Producto(){
        System.out.println("MOSTRAR DATOS. \n");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Precio: " + precio);
    }
}
