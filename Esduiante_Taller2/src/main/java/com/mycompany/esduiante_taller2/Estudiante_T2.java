/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esduiante_taller2;

/**
 *
 * @author Gercray
 */
public class Estudiante_T2 {
    private String nombre;
    private int edad;
    
    public Estudiante_T2(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public Estudiante_T2(){
        this("Desconocido", 0);
    }
    
    public void Datos_Estudiante(){
        System.out.println("MOSTRAR DATOS. \n");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: " + edad);
    }
    
}
