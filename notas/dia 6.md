Servidor de apps está definido en el estándar JEE (J2EE)
---------------------------------------------------------
Una maquina virtual de JAVA que tiene definidos una serie de recursos, como por ejemplo:
    - jdbcs
    - jms
y sobre la que desplegamos aplicaciones desarrolladas en JAVA según el estandar JEE
    war / ear
    
Un serv app JAVA tiene un pool de ejecutores.
JDBC: Protocolo de comunicación con bases de datos RELACIONALES
    Permitir la creación de pools de conexiones 

------------
Weblogic            ---       100-300K€
Websphere           ---       100-300K€
JBoss               ---       15.000€/cpu
    Wildfly
------------
Permiten trabajar en entornos de producción con todas sus funcionalidades intregadas
- Alta disponibilidad   |   
- Escalabilidad         |     Cluster
-------------

Cluster de servidores de aplicaciones.
                            
                                        |    Maquina 1  PUFFF !!!!
                                        |        Weblogic
                                        |            App1           http://maquina1:puerto/app1
Clientes  >>>> Balanceador de carga >>> |           ^V^V^V^V^V^V^
             http://bc:puerto/app1      |    Maquina 2
                apache                  |        Weblogic
                                        |           Servidor 1
                nginx                   |            App1           http://maquina2:puerto/app1
                Oracle HTTP Server      |            App2
                                                    Servidor 2
                                                        App3
                    
Me falta algo más o con esto basta para conseguir mi HA?
    El balanceador de carga me da alta disponibilidad del servicio.  SI
    Tengo alta disponibilidad de los datos?                          NO
        Weblogic , Websphere : 
            Un serv de apps crea una sesión, puede notificar al resto que ha creado esa sesión... Y que en el cluster se hagan copias de todo.
            TOMCAT ESTO NO LO PERMITE

Que los Servidores de Apps hablen entre si... para que si uno falla, se vaya al otro
    Esto no es misión del balanceado de carga?
    

App1: aplicacion caixabank para que yo (Ivan) acceda a mi cuenta bancaria.

Iván    >>>>> http://caixabank.es (esto llega al balanceador)
                
                    >>>> maquina 1
                        Formulario de login
                            Relleno el formulario de login >>>>> maquina 1
                                En el serv de applic de la maquina1 se genera una sesion (que tendrá un ID):
                                   el servidor de apps manda al cliente el ID de session, a través de una cookie.
                        Transferencia
                            Relleno el formulario de transferencia >>>> balanceador de carga (sticky sessions)  >>>>> maquina 1
                                                                        La maquina 2 me va decir ... y tu de quien eres?
                                                                            Toma, ahi tienes el formulario de login... ya lo estás rellenando.
                                OK ya tengo los datos... Estas seguro de hacer la transferencia?
                                    SI, ESTOY SEGURO ====> balanceador (sticky) -.-- bufff la maquina 1 ha muerto... Te mando para la 2.
                                        Seguro de que? Y tu quien eres?
        Para resolver esto....
            Cambio la configuración del balanceador de carga. Apache, Nginx,....
                Eh, que yo he ido para allá antes... meteme en el mismo sitio.
                    1º algoritmo de balanceo
                        Round robin             1, 2, 3, 4, 1, 2, 3, 4   XXXXXX
                        Least connections       Tampoco ruina !!
                        IP_HASH                 Me resuelve el problema. parcialmente

HASH - HUELLA
    - Dado un contenido original  , una huella
        - Es otro contenido
        - "Normalmente" más reducido en tamaño que el original
        - Que siempre se el mimo para el mismo contenido original
        - Que se genera teniendo en cuenta toda la información del contenido original
    - Ejemplo: letra DNI 
        12345678 > HUELLA (letra)
            36 % 23 => Resto al dividir sin decimales: 13 - J
    - 10.20.30.40
        100 % numero de procesador (servidores): 0, 1, 2
    - Sticky sessions
    
----------------                                    
Que es una cookie
Una cookie es un fichero con datos que se descarga en el navegador del cliente.
----------------
Sesión? (JEE)
Espacio en Memoria del servidor de aplicaciones donde durante un periodo de tiempo FINITO, un usuario va a poder 
ir depositando sus variables.
Tiene asociado: Un identificador, Fecha de creación, una fecha de expiración...

Conexión activa servidor-cliente.
Dialogo abierto cliente/servidor.   
    Conexión, dialogo abirto. RED, puerto, http: NO
    
    
Cliente: http://lacaixa.es   >>> REQUEST  >>>  datos   >>>> Serv. apps. >>>> RESPONSE  >>>> otros datos
La conexión http es cerrada.
Cliente: http://lacaixa.es/mismovimientos   >>> REQUEST  >>>  datos   >>>> Serv. apps. >>>> RESPONSE  >>>> otros datos
La conexión http es cerrada.

------
En una tienda online, meto cosas en la cesta de la compra.
Si mañana vuelo y miro la cesta, está vacia. Por qué?
Los datos de las cosas que voy añadiendo se van depositando en RAM (en mi sesión)

----
Que tipo de archivo es un servidor de aplicaciones JAVA? .jar <<<< va a haber una clase definida que va a tener dentro una function MAIN

-----
Cuando me conecto con una BBDD desde un serv de aplicaciones, le tengo que suministrar:
- usuario
- password
- url (jdbc:// servidor:puerto/ruta)    <<<< Cadena de conexión a una BBDD
- driver <<<< DEPENDE DE LA BBDD
    - Fichero .jar (libreria JAVA)


-----
Word ---- documento muy grande muy interesante---> servicio de impresion so ---> driver >>>> printer 

driver XA: Transacciones distribuidas
BBDD Transaccionales: 
    Trabajan mediante transacciones: 
    Transacción : Agrupación de ordenes que se se aplican o no al unisono, en bloque.
    
    Transacción global
    APP ---> BBDD 1
        ---> BBDD 2
        ---> BBDD 3
