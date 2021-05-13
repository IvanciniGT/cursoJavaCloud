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


Si el OLD NO SE LLENA... eso es sintoma de? Exceso de memoria

                                    30% <<<< 10 Gbs RAM : 3Gbs
El OLD se debe llenar 60-100% <<<< 60-90
                      90-100%
        Si se llena (que es algo normal) y BAJA por debajo de 50-60%  RUINA
            Me sobra ram y Le tengo que quitar RAM a la MV
        Si se llena y baja por encima del 85-90%            RUINA
            Me falta RAM
        Si se baja entre 50%-80%
    
        SI EL EDEN NO SE VACIA EN UN GC PROBLEMON....
            1º se ha intentado un gc en eden
            2º Se ha llenado el old
                se ha intentado un gc old
            3º No hay hueco y necesito seguir dejando cosas en eden
                ME FALTA MUCHA RAM
NORMAL:
    El EDEN debe caer de ven en cuando a CERO
    OLD Del 50-60% al 90% <<<< CALCULO UNA LINEA BASE = CONSTANTE
    
Que datos llegan al OLD?
    Los referenciados <<<
        CACHE <<< Datos que quiero en RAM por ser de uso recurrente.
        Esos datos a priori estarían en otros sitios: DISCO, BBDD
            CACHE ESTATICA: Tipos de camisas, de pantalones, tallas, colores
            CACHE DINAMICA: Mientras un dato está vivo en una app, el dato se cachea
    
    
    
Dia a dia 8Gbs
---------------
16Gbs de RAM


Kibana <<< Analizar logs de apps

Fluentd | Filebeat   ->>> ElasticSearch <<< Kibana

Weblogic ---> log 


Threads   ---->    100 hilos POOL EJECUTORES    ---->  30  POOL Conexiones a BBDD
                        ^
                       COLA (tamaño)