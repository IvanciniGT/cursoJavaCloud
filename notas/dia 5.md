# Proceso a nivel del SO:

Es un programa que tengo en estado "compatible" con su ejecución
    - que esté en ejecución
    - que esté para comenzar a ejecutarse
    - que esté recien ejecutado
    - que esté deadlock
    
# Qué es un hilo (Thread):

Un proceso tiene al menos un hilo... anuque dependiendo de la naturaleza del proceso... 
puede tener muchos hilos asociados.

Dentro de un proceso, un hilo es el encargado de ejecutar las lineas código (instrucciones).
Un hilo es algo así como un minisubproceso.

Los hilos se ejecutan en paralelo entre si.
    Un hilo ejecuta un trabajo sencualmente.
    
Al cargar un programa a RAM, todo su código va a la RAM.
Ese código puede ser ejecutado por distintos hilos simultaneamente... 
Cada hilo ejecutando un trozo del programa.

-----------------------------------------------------
APPS que siguen el estandar JEE - WEBAPPS
-----------------------------------------------------
Por qué son importantes los hilos en este tipod e apps?
Las apps web son concurrentes? Claro que si.
Una app web está siendo utilizada por muchos usuarios a la vez.
Y quiero que sea así.
Para esto necesito MUCHOS HILOS..... MUCHISIMOS.

¿Cuantos usuarios quiero concurrentemente?
Tengo una app que tiene registrados 1000 (usuarios nominales) , que usan intensivisimamente la app.
El servidor concurentemente está haciendo 50-70 ejecuciones (usuarios concurrentes).
    
Pinchar en un enlace ( que hay buscar primero en la web... y mover el raton por la pantalla)
Rellenar un formulario
REQUEST---------red---------->>SERVIDOR
                                  VV
                             procesamiento (Son atendidas por Hilos)
                                  VV
<<  ------------red------------RESPONSE


Cada petición de un cliente(persona o no) al servidor (REQUEST) genera un hilo? NO

>>> P5,P4,P3,P2,P1 >>>> Servidor
                                Pool de ejecutores ( puede tener un tañano variable)
                                ------------------ Entre 5 y 100 hilos
        P5? P4? Se genera una cola. FIFO                ServApps
                            P1    Hilo 1        C2,C1  >   Conex 1      
                            P2    Hilo 2                   Conex 2
                            P3    Hilo 3 (procesar el request, hacer unos calculos, leer algo del disco, pedir algo a la BBDD)
                                    VV
                                    Running
                                    Sleep
                                    Stuck (paraos)
                                        Error en la APP - BUG Deadlock Hilo A esperando al B... y el B esperando al A 
                                        Un usuario haya lanzado la query "definitiva". 15 min. 
                                    
# ¿Es bueno que se genere una cola? SI
Como de grande hago el pool de conexiones?
- En función de las peticiones que se esperan.
- Según las capacidades del servidor * <<<<<  Contenedor
- En base al tiempo que tarde en ejecutarse el código  <<<<<<
- Espera maxima de los usuarios   <<<<<<

Relacion entre HARDWARE y lo que de de si el sistema (app) <<<< MONITORIZAR
Estimación inicial... mediante simulacros. JMeter.

Si subo el pool?
    - Necesito: 
        - Más CPU               <<< 
        - Más RAM               <<< 
        - Más flujo con disco   <<<
    DEPENDE de la app

# ¿Como voy a instalar esto en un entorno de PRODUCCION?
Hemos desarrollado una app web ...o unos servicios web... o unos microservicios.
Esto al final lo empaqueto como: war o ear

Que hago con eso? Subirlo/desplegarlo al servidor de apps. Tomcat.
Y ya?

Donde tengo el servidor de apps? trabaja aislado? el solito?
NO, NUNCA.

Qué caracteristicas tiene un entorno de producción?
- Alta disponibilidad   |
- Escalabilidad         |   Necesito trabajar en un Cluster

No voy a tener un único servidor de aplciaciones. Voy a tener varios.
Quien los gestiona? Vosotros.... a qué nivel los gestionais?
Si hay que crear un servidor de apps nuevo, dentro del cluster, lo haceis vosotros?
- Si   . Ahora mismo lo estamos haciendo
- O no . Previsiblemente dejaremos de hacerlo en breve. Y va ser en muy breve.
    - Kubernetes / Openshift

Quien hace el despliegue de una app? o quien crea el recurso de BBDD en el serv. apps?
- Vosotros. Ahora mismo lo hacemos
- O no. Previsiblemente dejaremos de hacerlo en breve. Y va a ser enb muy breve?
    - Jenkins

Cual va a ser vuestro trabajo?
    Configurar scripts para jenkins y kubernetes
    
Administradores de sistemas             |
Operadores de sistemas (middleware)      >   Programadores
Testers                                 |

Pool de ejecutores
    ---> Quienes atienden los REQUEST DEL USUARIO

Qué pasa cuando quiero hacer una consulta a BBDD?
    ---> Pool de conexiones precreadas a la BBDD (JEE < J2EE)
            Exactamente igual que el pool de ejecutores (MIN, MAX)

Cuando necesite una conexión con la BBDD, la creo. Funciona así?

Que pasa cuando creo un ejecutor nuevo en serv. app JAVA:   Creo un hilo.
Que pasa cuando creo un conexión nuevo en BBDD:             Creo un proceso de SO.

Un proceso de SO.... come recursos a cascoporro comparado con un hilo.


Quiero actualizar estos 1000 datos en una tabla.
UPDATE FACTURAS set importe = importe + 1000 WHERE CLIENTE=10;
Esto irá al fichero... Cuando? Commit;

Sistemas transaccionales.

Los datos de la BBDD están en un fichero en disco.


------------------------------

JNDI? Nombre de recurso dentro de un serv. aplicaciones JAVA

JNDI <<<<< JEE

Voy a a dejar a un desarrollador conectarse directamente a una BBDD?
NO. Porque? SEGURIDAD
            VARIABILIDAD. Es la misma info en todos los entornos?


