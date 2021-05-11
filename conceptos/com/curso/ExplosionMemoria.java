package com.curso;

//import java.lang.Math;
import java.util.ArrayList;
// Map HashMap
class ExplosionMemoria{
    // 0 -> RAM GC
    // ......
    // 1 -> RAM <<<< Cantidad
    
    public static void main(String[] args) throws Exception {
        long tin=System.currentTimeMillis();
        ArrayList<Double> numeros=new ArrayList<Double>();
        for (  int cantidad=0; cantidad< 10*1000*1000; cantidad++ ){
            double numeroAleatorio = ( Math.random() * cantidad );
            numeros.add(numeroAleatorio);
            //Thread.sleep(0,1);
///            Syste.gc(); FEO FEO 
        }
        long tout=System.currentTimeMillis();
//        System.out.println("El resultado es: " + numeros);
        System.out.println("Calculo realizado en : " + (tout-tin) + " milisegundos");
    }
    
}
/*
2.500063356979342E15 x 2 bytes = 40 bytes 1M 40Mb
double 8 bytes x 400 Millones = 3200 Millones de bytes = 3.2 Gbs

boolean - 1 bit             -> 4 bytes
byte    - 1 byte 256        -> 4 bytes
short   - 2 byte 326XX      -> 4 bytes
int     - 4 bytes
long    - 8 bytes
float   - 4 bytes
double  - 8 bytes
*/

// TEXTO

//jstatd -J-Djava.rmi.server.hostname=$(curl -s ifconfig.me) -p 9999 -J-Djava.security.policy=<(echo 'grant codebase "file:${java.home}/../lib/tools.jar" {permission java.security.AllPermission;};')