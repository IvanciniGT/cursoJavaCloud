package com.curso;

class ProgramaContadores{
    public static void main (String[] args) throws Exception{
        int contador1 = 2000;
        double velo1 = 2;
        int contador2 = 5000;
        double velo2 = 4;
        int contador3 = 5000;
        double velo3 = 3;
        int contador4 = 2000;
        double velo4 = 1;
        
        Contador micontador = new Contador("Miguel");
        Contador micontador2 = new Contador("Eva");
        Contador micontador3 = new Contador("Oscar");
        Contador micontador4 = new Contador("Iñaki");

        micontador.contar(contador1, velo1);
        micontador2.contar(contador2, velo2);
        micontador3.contar(contador3, velo3);
        micontador4.contar(contador4, velo4);
        
    }
}