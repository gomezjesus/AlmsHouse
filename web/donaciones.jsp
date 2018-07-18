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
        <title>Donaciones</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <link href="layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">
        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
    </head>
    <body id="top">
        <jsp:include page="header.jsp" flush="true" />
        <div class="wrapper row3">
  <main class="container clear"> 
    <div class="content" align="center"> 
          <img src="images/gracias.jpg" alt="Gracias">
          <p>
        <h1>Cuenta Banorte</h1>
        <h2>3013 0200 58 2553279721</h2>
        
        <form action="https://www.paypal.com/cgi-bin/webscr" method="post" target="_top">
<input type="hidden" name="cmd" value="_donations">
<input type="hidden" name="business" value="samuel-silva@live.com.mx">
<input type="hidden" name="lc" value="MX">
<input type="hidden" name="item_name" value="Casa del Anciano">
<input type="hidden" name="item_number" value="CASA ANCIANO WEB">
<input type="hidden" name="no_note" value="0">
<input type="hidden" name="currency_code" value="MXN">
<input type="hidden" name="bn" value="PP-DonationsBF:btn_donateCC_LG.gif:NonHostedGuest">
<input type="image" src="https://www.paypalobjects.com/es_XC/MX/i/btn/btn_donateCC_LG.gif" border="0" name="submit" alt="PayPal, la forma más segura y rápida de pagar en línea.">
<img alt="" border="0" src="https://www.paypalobjects.com/es_XC/i/scr/pixel.gif" width="1" height="1">
</form>

        
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
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<!-- IE9 Placeholder Support -->
<script src="../layout/scripts/jquery.placeholder.min.js"></script>
<!-- / IE9 Placeholder Support -->
</body>
</html>

