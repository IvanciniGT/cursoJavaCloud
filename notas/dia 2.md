mvn archetype:generate \
    -DarchetypeArtifactId=maven-archetype-webapp \
    -DarchetypeVersion=1.4 \
    -DgroupId=com.curso \
    -DartifactId=proyectoWEB \
    -DinteractiveMode=false
    
    
Empaquetados JAVA:
    - jar : Libreria, Aplicacion nativa, script
    - war : Aplicacion Web
        - ear : Enterprise application

Qué es esto:: J2EE > JEE ?
    Java EnterpriseEdition .... Jakarta Enterprise Edition
JEE es un estandar, una especificación que describe como usar JAVA para montar apps en un empresa.
    JNDI <<<<<<<
    JDBC <<<<<<<
    JMS  <<<<<<<
    Como escribir el codigo JAVA:
        - servlets
        - jsps
        - jfcs
    Montar servicios web:
        - soap
        - rest
    Que las apps se deben distribuir mediante ficheros war o ear....
    Que las apps distribuidas de esa forma las debo ejecutar dentro de un servidor de aplicaciones JAVA:
        - Servidores de Apps JAVA de clase web *
        - Servidores de Apps JAVA de clase empresarial -

Servidores de Apps JAVA:
    - Weblogic
    - WAS: Websphere
    - Wildfly - JBoss           REDHAT
    - Glassfish  ---> pruebas... desarrollo
    ------------------------------------------------
    * Tomcat     gratuito ? PRO?Si... se puede usar.
        - servlets
        - jsps
        - jfcs
        - WAR
        - JBDC
    
    
REDHAT:
    el proyecto upstream 
    Fedora  >>>>  RedHatEntrepriseLinux
    Wildfly >>>> JBOSS
    Ansible project >>>> Ansible engine
    Ansible AWX >>>>> Ansible Tower
    
    Openshift Origin >>>> Openshift Container Platform


? Aplicaciones web:
Una app web es aquella que está diseñada para operar dentro de una arquitectura web.
Creando ficheros HTML bajo demanda



? Arquitectura web:
WEB? Creado por Tim Berners-Lee
    Un tipo de servicio ofrecido a través de internet. Arquitectura Cliente-servidor
    Que particularidad tiene?
        - Interfaz grafica (solo en versión 1)
        - Protocolo: http(s)
        - Tipo de datos que se mandan:
            - Versión 1: html
        - Cliente: 
            - Navegador web
        - Servidor:
            - Servidor web
            

INTERNET? Arpanet : 3 redes Conectaban las univ de California
    Conjunto de redes descentralizadas que conectan otras redes a nivel mundial.
    Se ofrecen muchos tipos de servicio:
        Web
        Email
        Chat
        IPVoice


HTTP:
    Request   Cliente ----> Servidor
        Datos?
            URL       http://servidor:puerto/CONTEXTO(programa) ? param1=valor & param2=valor & param3=3
            Método      GET    Llamamos a este método para recibir información : SELECT *
                        POST                                                     INSERT *
                        PUT                                                      UPDATE
                        DELETE                                                   DELETE
                        HEAD                                                     SI ALGO EXISTE
            BODY
                MAS PARAMETROS a KILOS <<<< Si trabajo en HTTPS está cifrado
    Response  Servidor ----> Cliente
            BODY
                CONTENIDO: BYTES
                TIPO DATOS QUE ME MANDA? Como representar esos bytes: HTML Encofing UTF8
                      mime-type                                       video/mpeg
                                                                      image/tif
            Código de respuesta del servidor:
                2xx- Exito
                3xx- Redireccion
                4xx- Error de cliente
                5xx- Error de servidor


Programa JAVA WEB: FUNCION !!!
    Que atiende una peticion HTTP (recibiendo unos parametros)  SERVLET
        doRequest
        doGet
        doPost
        
    Genera algo que devuelve en el body del la response


# Escribir un JSP: Java server page
HTML, que dentro lleva embebido codigo JAVA



--------------------------
http://miservidorDeAplicacion.com:8080/index.jsp?numero1=5&numero2=6

<html>
    <body>
        <h1>Hola amigos... Se sumar !</h1>
        
        <p> El resultado de sumar 7 y 19 vale: <b>11</b></p>
    
    </body>
</html>



<html>
    <body>
        <h1>Hola amigos... Se sumar !</h1>
        
        
        <p> El resultado de sumar 7 y 19 vale: <b>19</b></p>
    
    </body>
</html>









