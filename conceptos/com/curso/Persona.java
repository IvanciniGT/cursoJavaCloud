// paquete
package com.curso;

/* librerias */
import java.lang.Math;

// clase: Un tipo de dato custom
class Persona {
    // Características / Atributos
    private String nombre ;
    private int edad;
    private String email;
    private boolean casada;
    
    // Funcion muy especial: Constructor: Instrucciones a JAVA para definirle cómo crear datos de este tipo
    Persona (String el_nombre, String el_email){
        this.nombre=el_nombre.toUpperCase();
        this.email=el_email.toLowerCase();
    }
    // Funciones
    void cumplirAños(){
        //fiesta();
        this.edad=this.edad+1;  // this.edad++;
    }
    void estudia(String tema){
        // Haria mis cositas para aprenderlo
    }
    double suma(double numero1 , double numero2){
        double resultado = numero1 + numero2;
        return resultado;
    }
    double hacerUnCalculoRaro(double numero1 , double numero2){
        double resultado = Math.sin(numero1) + Math.log(numero2);
        return resultado;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public String getEmail(){
        return this.email;
    }
    int getEdad(){
        return this.edad;
    }
    private boolean isCasada(){
        return this.casada;
    }
    
    void setNombre(String nuevoNombre){
        // Validaciones, transformaciones...
        this.nombre=nuevoNombre.toUpperCase();
    }
    private void setEmail(String nuevoEmail){
        this.email=nuevoEmail;
    }
    void setEdad(int nuevaEdad){
        this.edad=nuevaEdad;
    }
    private void setCasada(boolean nuevoEstado){
        this.casada=nuevoEstado;
    }
    
    
}

// Kotlin Scala