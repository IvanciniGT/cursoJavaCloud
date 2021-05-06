# Docker 
Es un gestor de contenedores.

## Qué es un contenedor?
Entorno Aislado dentro de un sitema opertivo donde ejecutar procesos.
Contenedor ~ Máquina Virtual
Aprovechando las libs que existen en el KERNEL del sistema operativo LINUX
podemos crear un entorno aislado (memoria, CPU, disco, red), pero en el que los procesos que se ejecutan
lo hacen hablando con el propio sistema operativo base.

Un contenedor se crea desde una imagen DE CONTENEDOR:
Conjunto de librerias y una app ... todo empaquetado (ZIP)

## Cómo creo una MV?
La defino a través de un programa denominado? Hipervisor (VMWare, Citrix, VBox, HyperV)
Hardware de mentira que compongo a retales con el hardware de verdad que tengo.
Necesito un SO encima del hardware de mentira
Sobre ese SO monto mis apps.
La MV tiene su propia memoria, disco (filesystem), red (IP)..
Es eficiente? No es tan eficiente como ejecutar una app directamente sobre el SO host.

docker run --name miTomcat -d --rm -p 8080:8080 \
-e TOMCAT_USERNAME=admin \
-e TOMCAT_PASSWORD=password \
-e TOMCAT_ALLOW_REMOTE_MANAGEMENT=1 \
bitnami/tomcat