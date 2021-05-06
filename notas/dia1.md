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