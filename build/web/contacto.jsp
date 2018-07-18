<%-- 
    Document   : razon
    Created on : 25/11/2017, 11:05:51 AM
    Author     : alber
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<!--
Template Name: Meanessa
Author: <a href="http://www.os-templates.com/">OS Templates</a>
Author URI: http://www.os-templates.com/
Licence: Free to use under our free template licence terms
Licence URI: http://www.os-templates.com/template-terms
-->
<html>
    <head>
        <title>Contacto</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <link href="layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">
    </head>
    <body id="top">
        <jsp:include page="header.jsp" flush="true" />
        <div class="wrapper row3">
  <main class="container clear"> 
  
      <div id="comments">
        <h2>Mándanos tu mensaje</h2>
        <form action="contacto.php" method="post">
          <div class="one_third first">
            <label for="name">Nombre<span>*</span></label>
            <input id="nombre" type="text" name="nombre" placeholder="Nombre y Apellido" required="">
          </div>
          <div class="one_third">
            <label for="email">Mail <span>*</span></label>
            <input id="email"  type="email" name="email" placeholder="ejemplo@correo.com" required="" />
          </div>
          <div class="one_third">
            <label for="url">Teléfono</label>
             <input id="telefono"  type="telefono" name="telefono" placeholder="636328922" required="" />
          </div>
          <div class="block clear">
           <label for="comment">Comentarios <span>*</span></label>
            <textarea id="mensaje" name="mensaje" rows="20" cols="65" placeholder="Escriba aqui sus comentarios y/o dudas" required></textarea> 
          </div>
          <div>
            <input id="submit" type="submit" name="submit" value="Enviar">
            &nbsp;
            <input name="reset" type="reset" value="Borrar">
          </div>
        </form>
      </div>
      
    </div>
    
    <div class="clear"></div>
  </main>
</div>

<jsp:include page="footer.jsp" flush="true" />

<div class="wrapper overlay bgded" style="background-image:url('images/demo/backgrounds/03.png')">
</div>

<a id="backtotop" href="#top"><i class="fa fa-chevron-up"></i></a>
<!-- JAVASCRIPTS -->
<script src="../layout/scripts/jquery.min.js"></script>
<script src="../layout/scripts/jquery.backtotop.js"></script>
<script src="../layout/scripts/jquery.mobilemenu.js"></script>
<!-- IE9 Placeholder Support -->
<script src="../layout/scripts/jquery.placeholder.min.js"></script>
<!-- / IE9 Placeholder Support -->
</body>
</html>
