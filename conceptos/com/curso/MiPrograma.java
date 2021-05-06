package com.curso;

class MiPrograma{
    
    public static void main(String[] args){
        // Aqui iria el código de mi programa
        int numero1=7;
        double numero2=17.7;
        double resultado=numero1+numero2;
        
        System.out.println("El resultado es:" + resultado);

        Persona mi_personita1 = new Persona ("Ivan Osuna" , "ivan.OSUNA.ayuste@gmail.com")  ;
        Persona mi_personita2 = new Persona ("Iñaki" , "ivan.OSUNA.ayuste@gmail.com")  ;

        mi_personita1.setNombre("Ivancita");

        System.out.println(mi_personita1.getNombre());
        System.out.println(mi_personita1.getEmail());
        mi_personita1.setEdad(23);
        System.out.println(mi_personita1.getEdad());
        mi_personita1.cumplirAños();
        System.out.println(mi_personita1.getEdad());
        
    }
    // propio, grupo, otro >> tengo acceso o no tengo acceso. Si tengo acceso, hago lo que me da la gana... lo veo, y lo toco
    // private , , public
    // (lectura/escritura)    /ejecución
}