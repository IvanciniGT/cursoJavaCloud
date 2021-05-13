MariaDB
Weblogic
    - JDBC          MariaDB
    - Deployment    webapp-test
                        configurar 
                            retraso por peticion 200ms
                            retrado en BBDD      1 s
                            500 objetos en RAM por peticion
                            50000 objetos en cache
JMETER
DASHBOARD de weblogic

- >>> Cuantas peticiones puedo atender actualmente <<<, con configuracion por defecto
        - Monitorización de Cola. Hay un momento en que la cola crece infinitamente.... AHI ESTOY .
            - OutOfMemory

- Donde está el problema para no poder atender más peticiones
    - Falta de Memoria
        -   Explosion !!! OutOfMemory
        -   Lentitud extrema debido al GC
    - Saturacion del pool de ejecutores. ---> 
        -   Debido a ? Más peticiones de las que puedo procesar
                - Consecuencia: Cola infinita
    - CPU
        - Me coma la CPU... y entonces? Cola.
    - BBDD
        - Tengo un pool pequeño. Saturación del pool de conexiones a BBDD

1º Configurar app con los datos
2º Herramientas de monitorizacion: 
    - Weblogic Dashboard : Cola peticiones del ejecutores
3º Configurar JMETER para monitorizar? no...
    - Calentar al sistema
    - Que tire un huevo de peticiones: 1 hilo, infinitas peticiones
4º Cuando paro? Cuando reviente

Para obtener unas estadísticas de mi app (JMETER)
Tiempo de procesamiento por petición:    Media Std
    1 usuario haciendo peticiones         1240  10  Linea base
    100 usuario haciendo peticiones       XX  XX  
    200 usuario haciendo peticiones       XX  XX  
    400 usuario haciendo peticiones       XX  XX  En un momento habrá una degradación del performance
                                                                  Cola    CPU
                                                            -      x       √    >>> Pool (hay que subirlo)
                                                            -      √       x    >>> 1º Bajar pool
                                                            -      x       x    >>> GUAY !!!! Ya no doy más de si y estoy equilibrado
Como mejoro la linea base?
  - Más recursos? CPU , disco (velocidad)
  - DESARROLLADOR >>>>>>

----


Tiempo de procesamiento por petición:    Media Std
    1 usuario haciendo peticiones         1240  10  Linea base
    20 usuario haciendo peticiones        1326  50  Linea base
    23 usuario haciendo peticiones        1526  50  Linea base NO HAY COLA
    -----------------------------------------------------------------------
    30 usuario haciendo peticiones        2000  50  Linea base
    50 usuario haciendo peticiones        3350  50  Linea base
    
¿Cuantas peticiones estoy sacando por ud de tiempo?
¿Cuantas peticiones estoy sacando por segundo?        50 peticiones / 3350 msegundos = 15 peticiones x segundo con 50 usuarios simultaneos

23 petisiones simultaneas / segundo
¿Cuantas peticiones estoy sacando por segundo?        23 peticiones / 1526 msegundos = 15 peticiones x segundo con 23 usuarios simultaneos

Usuarios seres humanos: 15 peticiones x segundo: Usuarios nominales: x10: 150 personas podrian estar usando el sistema.

-Xmx500m
-Xms250m