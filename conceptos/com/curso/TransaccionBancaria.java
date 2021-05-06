package com.curso;

import java.util.Date;

class TransaccionBancaria{
    private double cantidad;
    private String codigoCuentaOrigen;
    private String codigoCuentaDestino;
    private String nombreBeneficiario;
    private String concepto;
    private final Date fechaOperacion;
    
    TransaccionBancaria(double cantidad, String codigoCuentaOrigen, String codigoCuentaDestino, String nombreBeneficiario, String concepto){
        this.cantidad=cantidad;
        this.codigoCuentaOrigen=codigoCuentaOrigen;
        this.codigoCuentaDestino=codigoCuentaDestino;
        this.nombreBeneficiario=nombreBeneficiario;
        this.concepto=concepto;
        this.fechaOperacion=new Date(); // Crear una fache con el valor de ahora mismo.
    }
        
    public Date getFechaOperacion(){
        return this.fechaOperacion;
    }

}
/*
Programas:
- Aplicación: 100 pantalla diferentes
- Script
- Servicio
- Demonio
*/