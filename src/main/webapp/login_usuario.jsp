<% HttpSession session1= request.getSession();
    if (session1.getAttribute("usuario")!=null) {
        response.sendRedirect("Mantenimiento_Cliente.jsp");
    }
%>
<%@page import="Negocio.Neg_Usu"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
     
            String nom_em=request.getParameter("txtusuario");
            String pass_em=request.getParameter("txtpassw");

            Neg_Usu usu=new Neg_Usu();

            if (usu.Validar_logo(nom_em, pass_em)) {
                session.setAttribute("usuario", nom_em);
        %> 
            <script type="text/javascript">                       
            window.location = 'Mantenimiento_Cliente.jsp';
            </script>
        <%
            } else {
        %>     
            <script type="text/javascript">                                   
            window.location = 'index.jsp?status=false';
            </script>
         <% } %>   
    </body>
</html>
