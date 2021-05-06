# Qué es JAVA?

## Lenguaje de Programación?
### Lenguaje?
Forma de expresarse... de comunicar... 
Un lenguaje tiene:
    - Una síntaxis
    - Una semántica
    - Una gramática

### Programas?
Un conjunto de instrucciones que puede ejecutar un computador.

### Qué computador va a ejecutar nuestras instrucciones? Sistema Operativo... 
### Qué sistema Operativo? El que lleva instalado la máquina virtual de JAVA
### Qué es la JVM (Máquina Virtual de JAVA)?
El computador donde vamos a ejecutar nuestro código.

## Clasificación de lenguaje de programación
### Interpretado / Compilado
- Compilación: Traducción estática del código: C, Cobol, C++,, Fortran
    - Más eficiente
    - Se compila contra el lenguaje que habla un determinado SO.
    - Permiten una detección de errores precoz (anticipada)
- Interpretados: Traduciendo dinámica (sobre la marcha): Python, Perl, Bash, Javascript
    - Menos eficiente
    - No permiten una detección de errores precoz (anticipada). PROBLEMA
    - Distribución del software a distintos SO
JAVA es compilado e interpretado simultaneamente
    Compilación: JAVA ---> ByteCode
                 .java     .class
    Los archivos .class (ByteCode) son interpretados por la máquina virtual de JAVA
            warm up time: lazy.

### De tipado estático / dinámico
El programa opera sobre "datos" <<<<<
    Números -7
    Textos
    Valores lógicos (si/no)
    Fechas
    
    Python: Tipado dinamico
    Java, C: Tipado estático

### Variable?                                          SI                  NO
Un contenedor que contiene información/datos           IIII                II
un contenedor donde pongo información <<< RAM, Fichero

Variable es una referencia un un contenedor de información

### De bajo/alto nivel
Java es de alto nivel

### Según el paradigma qué utilizan
- Imperativos
- Procedurales
- Funcionales          <<< 1.8
- Orientados a Objetos <<< 
    Servidor <<<< Clase <<<< .class
        Funciones:
            - arranca
            - para
            - chequeo
        Caracteristicas:
            - Recursos : CPU, Memoria
            - SO
            - Estado
            - IP
            - Nombre


# Qué necesito para crear y ejecutar un programa Java
- Compilador              >>> javac  <<< Java Development Kit JDK
- Máquina Virtual >>> JVM >>> java   <<< Java Runtime Enviroment JRE

# Quién está al cargo de JAVA?
Oracle <<< De quien era? Sun microsystems
    Por qué Oracle compra Sun Microsystems?
        HARDWARE <<<<< Ordenadores con arquitectura Sparc
            SO >>>> UNIX® Solaris
        En esa compra:
            Se llevo JAVA
            Se llevo OpenOffice >>> StarOffice   ......   LibreOffice
            Se llevo MySQL                       ......   MariaDB
        Hudson  .......................................   Jenkins
Oracle Database


GNU
Redhat


1º Modas
JAVA <<<< Todo en JAVA.
    Apps web               <<<< Le ha ido bien.... pero no para todo lo que hacemos en una webapp
                                        √ Backend (lógica app, acceso a sistemas externos- BBDD, LDAP, Sistemas de mensajeria...)
                                        Frontend: JS
    Apps desktop           <<<< Objetive C, VB, C#, C++
    Apps embebidas         <<<< C, C++
    Apps telefonos moviles <<<< JAVA (android < Google)

2º Irrupción de python
    Automatización:
        Adm. Sistemas  <<<  Python
        Pruebas        <<<  Python
    Analitica de datos <<<  Python

3º Comprado por Oracle    
    
Kotlin   ---->   bytecode
Scala    ---->   bytecode
    Sintaxis alternativas a JAVA

NodeJS <<< JVM pero para JS

OpenJDK ... Versión OpenSource de JAVA

JEE? Jakarta Enterprise Edition   <  Java® Enterise Edition < J2EE
                                  ^
                                  Por que a Oracle le importaba un cagao esto... y lo dono a una fundación
                                  
                                  
                                  
Segun el estandar JEE, en los servidores de app JAVA,
DEBE HABER UN TIPO DE DATOS LLAMADO HTTPSERVLET
    void doGet(HttpServletRequest peticion, HttpServletResponse respuesta){
        no hace nada
    }
    void doPost(){
        no hace nada
    }

Lenguajes informáticos:
    JAVA: Lenguaje de programación
    HTML: Lenguaje de marcado de información (tags)
    SQL:  Lenguaje de consulta a BBDD
    UML:  Lenguaje de modelado de arquitecturas de software
    
    

Lenguaje de marcado de información:
    HTML
    XML
    JSON
    YAML
    CSV
    
    
    
Aplicación REST
------------------------
Una aplicación, montada en un servidor de aplicaciones JAVA,
que recibe datos por JSON y devuelve datos por JSON.
Es una aplicación que tiene dentro muchos servicios web REST.

Cliente que monte en un telefono
--------------------------------
No exista un interfaz gráfico


Programa que llama a otro programa para pedirle datos y esos datos los introduce en un BBDD.

Arquitecturas SOA
-----------------
Una aplicación hoy en dia no la concebimos con un TODO, sino como la suma de sus partes.

Aplicación de un cajero automático de un banco
Aplicación web para usuarios que acceden al banco y sus cuentas a través de internet y su navegador
Aplicación nativa en un teléfono ANDROID para que los usuarios acceden al banco y sus cuentas
Aplicación nativa en un teléfono IPHONE para que los usuarios acceden al banco y sus cuentas
Aplicación que permita a un cajero en ventanilla de sucursal acceder a las cuentas de un cliente


Funcionalidades:
    Servicio Web   Realizar una transferencia
    Servicio Web   Realizar un ingreso
    Servicio Web   Consultar el saldo
    Servicio web   que permite validar credenciales
    Servicio Web   consultar movimiento
    Servicio Web   mandar un sms al cliente informando
    Servicio Web   mandar un email al cliente informando
    Servicio Web   mandar una notificacion push al telefono del cliente informando
    
    Microservicios. Se distribuyen 1 a 1, son autoejecutables
        Que pasa cuando quiero actualizarlo
        Que pasa cuando quiero escalarlo

Spring 
SpringBoot


Libreria / biblioteca
Framework
    Springboot me va a generar un achivo .jar que lleva embebido su propio Servidor de Aplicaciones

-----------------------------------
Memoria RAM JAVA <<<<< La mayor parte de los problemas al gestionar apps JAVA vienen por este lado


App Java ----> .class

SO Linux
    Kernel gestiona la memoria RAM de los procesos que se ejecutan en el sistema
    
Linux ejecuta un proceso que es la MAQUINA VIRTUAL DE JAVA
    Dentro de la maquina virtual y mirar la memoria alli
Que es un proceso?
    Programa en estado compatible con su ejecución
    
RAM que va a usar el programa:
    - Parte es lo que ocupa el código del programa      <<<<< Ocupará lo que ocupe...  Aqui no puedo hacer nada
    - Datos que va consultando o generando el programa <<<<< OutOfMemoryException HEAP
        ====> 99% bug código Problema......uhuhuh CACHES
            1   Que el desarrollador posiblemente no tenga npi de donde está el problema
                    Y le va a costar averiguarlo
            2   Que el jefe del desarrollador le va a decir al desarrollador que pase del problema
                que hay una entrega que hacer pronto y que lo primero lo primero
            3   Que aunque se ponga a arreglarlo... el cliclo de arreglo, pruebas, pasar por entrono de pruebas, intregracion... y hasta que me llegue 
                son semanas
            4   Mientras yo tengo que hacer algo para que los usuarios puedan funcionar.
            5   Tengo que intentar recopilar evidencias, para poder "ayudar" (hacer presión por un tubo)
                al desarrollador que lo que está pasando es SU PROBLEMA Y QUE LO TIENE QUE ARREGLAR.
    - Stack de hilos    <<<<<<<< Si no hay errores en el codigo es algo contante (de crecimiento lineal con el numero de hilos)


Proceso SO
    Dentro del proceso se ejecutan HILOS. Threads
    1 proceso puede tener muchos hilos <<<< Paralelización de trabajo <<< Multitarea
    
    
    
función que calcule el factorial de un número:
    5! = 5 x 4 x 3 x 2 x 1
    5! = 5 x 4!
    ------
1    defino la funcion FACTORIAL (recibe un numero) -> Devolver otro numero
2         Miro si el numero que me pide es el 0... 
3                                                  Si es el cero cuanto devuelvo? 0! = 1
4                                                  En caso contrario:
5                                                       Calculo el numero anterior: Resto 1 al numero que me piden
6                                                       Calculo el factorial de ese numero
7                                                       Multiplico ese factorial por el numero que me han dado
8                                                       Lo devuelvo


Ejecutar el programa para el número 4:
Stack de Threads
Stack de funciones de un hilo
-> 1, 2, 4, 5 (anterior=3), Funcion Factorial linea 6 ( )
-> 1, 2, 4, 5 (anterior=2), Funcion Factorial linea 6 ( )
-> 1, 2, 4, 5 (anterior=1), Funcion Factorial linea 6 ( )
-> 1, 2, 4, 5 (anterior=0), Funcion Factorial linea 6 ( )
-> 1, 2, 3 ===> 1

Stack < Pila
Pila? Una estructura de datos   LIFO
Cola                            FIFO


Stackoverflow

    
    
    
    
    
    