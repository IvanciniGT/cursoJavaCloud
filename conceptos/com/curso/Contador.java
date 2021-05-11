package com.curso;

class Contador {
    
    private String nombre;
    
    Contador(String nombre){
        this.nombre=nombre;
    }
    
    // Velocidad: Números contados por cada 10 segundos
    // Velocidad de 5 palabras cada 10 segundos
    void contar(int numero, double velocidad) throws Exception{
        for (  int current=1; current<= numero; current++ ){
            System.out.println("Soy " +this.nombre+ ", voy por el numero: " + current);
            Thread.sleep((long)(1000./velocidad));
        }
    }
    
}