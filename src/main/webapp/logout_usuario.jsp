<%
HttpSession session1 = request.getSession();
if (session1.getAttribute("usuario")!= null) {
        session1.removeAttribute("usuario");
    }
response.sendRedirect("index.jsp");
%>