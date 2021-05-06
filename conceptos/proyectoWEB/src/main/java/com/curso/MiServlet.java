package com.curso;

public class MiServlet extends HttpServlet{
    public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta){
        
        int numero1=Integer.parseInt(peticion.getParameter("numero1"));
        int numero2=Integer.parseInt(peticion.getParameter("numero2"));
        int resultado=numero1+numero2;
        
        // Devolviendo JSON o XML, o YAML
                        // Json: Servicio REST
                        // XML:  Servicio SOAP
        String cuerpo_respuesta= "<html>";
        cuerpo_respuesta+="    <body>";
        cuerpo_respuesta+="        <h1>Hola amigos... Se sumar !</h1>";
        cuerpo_respuesta+="        <p> El resultado de sumar 7 y 19 vale: <b>"+respuesta+"</b></p>";
        cuerpo_respuesta+="    </body>";
        cuerpo_respuesta+="</html>";

        respuesta.getWriter().print(cuerpo_respuesta);
        respuesta.getWriter().close();
    }
}
// Página WEB .... programas que generan HTML
// HTML <<<< HTTP
// Servicio WEB .... programas que generan contenido consumible por otros programas
// JSON <<<< REST (HTTP (TPC (IP) ))
// XML  <<<< SOAP (HTTP (TPC (IP) ))
