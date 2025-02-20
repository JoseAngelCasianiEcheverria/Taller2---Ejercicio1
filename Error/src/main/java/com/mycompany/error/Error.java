/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.error;

/**
 *
 * @author Gercray
 */
public class Error {
    
    public static void metodoEstatico() {
        /*System.out.println(this); Error: no se puede utilizar "this" en un metodo estatico.*/
        System.out.println(saludo);
    }
    
    public static String saludo = ("Hola soy jose angel casiani y te estoy saludando");
    
    public static void main(String[] args) {
        metodoEstatico();
    }
}
