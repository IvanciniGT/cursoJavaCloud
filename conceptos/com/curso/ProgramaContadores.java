package com.curso;

class ProgramaContadores{
    public static void main (String[] args) throws Exception{
        int contador1 = 20;
        double velo1 = 4;
        int contador2 = 50;
        double velo2 = 8;
        
        Contador micontador = new Contador("Miguel");
        Contador micontador2 = new Contador("Eva");

        micontador.contar(contador1, velo1);
        micontador2.contar(contador2, velo2);
    }
}