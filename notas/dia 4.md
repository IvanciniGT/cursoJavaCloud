Por qué JAVA es especial en cuanto a la gestión de la RAM?
    - Porque JAVA se ejecuta dentro de una máquina virtual 
        La memoria de dentro de la MV es que la que quiero monitorizar
            Funciona de una forma... un tanto especial
                Se basa en el funcionamiento del Garbage Collector
        La memoria a nivel del SO host también la neceito controlar.
        

Cuando arrancamos la maquina Virtual de JAVA le configuro una cantidad de memoria RAM: 4 Gbs
A nivel de SO cuanta memoria veo en uso? 4 Gbs Esto está siendo reservado por MV Java
De esos 4 Gbs, cuanto estoy utilizando? npi

Si programa requiere solo 2 Gbs de RAM... que ocurre? Estoy tirando RAM
Si programa requiere 6 Gbs de RAM... que ocurre?      EXPLOSION: OutOfMemoryException

Como configuro la Memoria RAM de la Maquina Virtual?
    java -Xms100m -Xmx200m PROGRAMA_QUE_QUIERO_EJECUTAR
    
    Xms: Mínima RAM para HEAP que voy a reservar
    Xmx: Máxima RAM para HEAP que voy a reservar
    
    Cual es la recomendación con respecto a esos parámetros?
        Asignarle el mismo valor a ambos. Voy a reservar lo que voy a necesitar 
            Por qué? Para evitar problemas
            
            8 Gbs
            MV1 2-6
            MV2 2-6
    


<-------------------------------------> HEAP     -Xmx -Xms
<--------------------> Young Gen                 -Xmn         <<<<< RARO RARO RARO TENERLO QUE TOCAR
Eden            >  S0        >>>>       OLD
                   S1

Cuando guardo un dato en RAM, ese dato va al EDEN
El EDEN es pequeño... y se llena rápido 
al llenarse, entra el GC, sobre el EDEN
    Los elementos del EDEN que nadie les apunta, son eliminados    
    Los elementos del EDEN que alquien (una variable) les apunta, son pasados a un survivor... el que toque en cada momento
Cuando el OLD se llena, se genera un evento FULL GC... tarda mucho

jstatd