<% HttpSession session1= request.getSession();
    if (session1.getAttribute("usuario")==null) {
        response.sendRedirect("index.jsp");
    }
%>
?<!DOCTYPE html>
<%@page import="Modelo.Mod_Cli"%>
<html xmlns="http://www.w3.org/1999/xhtml">

    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Eliminar cliente</title>
        <!-- BOOTSTRAP STYLES-->
        <link href="assets/css/bootstrap.css" rel="stylesheet" />
        <!-- FONTAWESOME STYLES-->
        <link href="assets/css/font-awesome.css" rel="stylesheet" />
        <!-- CUSTOM STYLES-->
        <link href="assets/css/custom.css" rel="stylesheet" />
        <!-- GOOGLE FONTS-->
        <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
    </head>
    <body>



        <div id="wrapper">
            <div class="navbar navbar-inverse navbar-fixed-top">
                <div class="adjust-nav">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="Mantenimiento_Cliente.jsp"><i class="fa fa-square-o "></i>&nbsp;VidaFarma</a>
                    </div>
                    <div class="navbar-collapse collapse">
                        <ul class="nav navbar-nav navbar-right">
                            <li><a href="#">Pagina creada por: Buzz y sus amigos_grupo5  &copy;<script>document.write(new Date().getFullYear());</script> Accesorios de computo </a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <!-- /. NAV TOP  -->
            <nav class="navbar-default navbar-side" role="navigation">
                <div class="sidebar-collapse">

                    <ul class="nav" id="main-menu">
                        <li class="text-center user-image-back">
                            <img src="assets/font-awesome/1/2/buzz.jpg" class="img-responsive"   width="100%" height="100p%"/>

                        </li>
                        <li>
                            <a href="#"><i class="fa fa-edit "></i>Registros<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="Mantenimiento_Cliente.jsp">Cliente</a>
                                </li>
                                <li>
                                    <a href="#">Usuario</a>
                                </li>

                                <li>
                                    <a href="#">Proveedor</a>
                                </li>
                                <li>
                                    <a href="#">Producto</a>
                                </li>

                            </ul>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-edit "></i>Negocio<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="#">Venta</a>
                                </li>

                            </ul>
                        </li> 
                        <li>
                            <a href="#"><i class="fa fa-edit "></i>Consultas<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="#">Cliente</a>
                                </li>
                                <li>
                                    <a href="#">Proveedor</a>
                                </li>
                                <li>
                                    <a href="#">Producto</a>
                                </li>
                                <li>
                                    <a href="#">Venta</a>
                                </li>
                            </ul>
                        </li> 
                         <li>
                            <a href="index.jsp"><i class="fa fa-edit "></i>Cerrar sesi&oacute;n<span class="fa arrow"></span></a>
                            
                        </li> 
                    </ul>

                </div>


            </nav>
            <!-- /. NAV SIDE  -->
            <div id="page-wrapper" >
                <div id="page-inner">
                    <div class="row">
                        <div class="col-md-12">
                            <h2>Eliminar Cliente</h2>   
                        </div>

                    </div>              
                    <!-- /. ROW  -->
                    <hr />


                    <h1><div  id="titulo"><center>Desea eliminar al cliente:</center></div><p></h1>

                        <%int dni = Integer.parseInt(request.getParameter("txtdni"));
                            String nombre = request.getParameter("txtnombre");
                            String apellido = request.getParameter("txtapellido");
                        %>
                        <form action="Eli_Cli">
                            <center>
                                <table>
                                    <div class="form-group"> 
                                        <tr>
                                            <td> <label for="Dni">Dni:</label></td><td><input type="text" name="txtdni" value="<%=dni%>"><p/></td>
                                        </tr>
                                    </div>
                                    <div class="form-group"> 
                                        <tr>
                                            <td> <label for="Nombre">Nombre:</label></td><td><%=nombre%><p/></td>
                                        </tr>
                                    </div>
                                    <div class="form-group"> 
                                        <tr>
                                            <td> <label for="Apellido">Apellido:</label></td><td><%=apellido%><p/></td>
                                        </tr>
                                    </div>

                                    <tr>
                                        <td ><button type="submit" class="btn btn-primary" >Eliminar</button></td><td><a href="Mantenimiento_Cliente.jsp"><button type="button" class="btn btn-primary" >Cancelar</button></a></td>
                                    </tr>
                                </table>
                            </center>
                        </form>




                        <!-- /. ROW  -->           
                </div>
                <!-- /. PAGE INNER  -->
            </div>
            <!-- /. PAGE WRAPPER  -->
        </div>
        <!-- /. WRAPPER  -->
        <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
        <!-- JQUERY SCRIPTS -->
        <script src="assets/js/jquery-1.10.2.js"></script>
        <!-- BOOTSTRAP SCRIPTS -->
        <script src="assets/js/bootstrap.min.js"></script>
        <!-- METISMENU SCRIPTS -->
        <script src="assets/js/jquery.metisMenu.js"></script>
        <!-- CUSTOM SCRIPTS -->
        <script src="assets/js/custom.js"></script>


    </body>
</html>
