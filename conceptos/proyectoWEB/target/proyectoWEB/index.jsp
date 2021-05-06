<html>
    <body>
        <h1>Hola amigos... Se sumar !</h1>
        
        <%
        int numero1=Integer.parseInt(request.getParameter("numero1"));
        int numero2=Integer.parseInt(request.getParameter("numero2"));
        int resultado=numero1+numero2;
        %>
        <p> El resultado de sumar 7 y 19 vale: <b><%=resultado%></b></p>
    
    </body>
</html>
