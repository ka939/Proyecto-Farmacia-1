<% HttpSession session1= request.getSession();
    if (session1.getAttribute("usuario")!=null) {
        response.sendRedirect("Mantenimiento_Cliente.jsp");
    }
%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Index</title>
<!-- Meta tag Keywords -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Modern Login Form Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Meta tag Keywords -->
<!-- css files -->
<link rel="stylesheet" href="css/style.css" type="text/css" media="all" /> <!-- Style-CSS --> 
<link rel="stylesheet" href="css/font-awesome.css"> <!-- Font-Awesome-Icons-CSS -->
<!-- //css files -->
<!-- web-fonts -->
<link href="//fonts.googleapis.com/css?family=Snippet" rel="stylesheet"><!--online fonts-->
<!-- //web-fonts -->
</head>

<body>
    <style>
    
    .fondolog{
        background-image: url("img1.jpg");
    }
    
</style>

<div class="fondolog">
	<div class="main-container">
		<!--header-->
		<div class="header-w3l">
			<h1>Login </h1>
		</div>
		<!--//header-->
		<!--main-->
		<div class="main-content-agile">
			<div class="w3ls-pro">
				<h2>VidaFarma</h2>
			</div>
			<div class="sub-main-w3ls">	
                            <form action="login_usuario.jsp" method="post">
					<input placeholder="Usuario" name="txtusuario" type="text">
					<span class="icon1"><i class="fa fa-envelope" aria-hidden="true"></i></span>
                                        <input  placeholder="Password" name="txtpassw" type="password" required="">
					<span class="icon2"><i class="fa fa-unlock-alt" aria-hidden="true"></i></span>
					<div class="checkbox-w3">
                                            <%
                                            if (request.getParameter("status")!=null) {
                                                if (request.getParameter("status").equalsIgnoreCase("false")) {
                                            %>
                                            <label style="color: red;"> Usuario o contraseña incorrectos </label>
                                            <%        
                                                }
}
                                            %>
                                            
						&nbsp;&nbsp;&nbsp;
						<div class="clear"></div>
					</div>
					<div class="social-icons"> 
						
						</div>
                                        
					<input type="submit" value="">
				</form>
			</div>
		</div>
		<!--//main-->
		<!--footer-->
		<div class="footer">
			 <font color="Yellow" >   Salud y Confianza a tu Alcance &copy;<script>document.write(new Date().getFullYear());</script> VidaFarma </li></ul></font>
		</div>
		<!--//footer-->
	</div>
</div>
<!-- js -->
<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script><!--common-js-->
<script src="js/jquery.vide.min.js"></script><!--video-js-->
<!-- //js -->
</body>
</html>