package com.curso;

class Contador extends Thread{
    
    private String nombre;
    private int numero;
    private double velocidad;
    
    Contador(String nombre){
        this.nombre=nombre;
    }
    
    // Velocidad: Números contados por cada 10 segundos
    // Velocidad de 5 palabras cada 10 segundos
    void contar(int numero, double velocidad) {
        this.numero=numero;
        this.velocidad=velocidad;
        start();
    }
    
    public void run() {
        for (  int current=1; current<= this.numero; current++ ){
            System.out.println("Soy " +this.nombre+ ", voy por el numero: " + current);
            try{
                Thread.sleep((long)(1000./this.velocidad));
            }catch(Exception e){
                System.out.print(e);
            }
        }
        finalizar();
    }
    void finalizar(){
        System.out.println("Ya acabé. Soy: "+ this.nombre);
        Thread.dumpStack();
    }
    
}