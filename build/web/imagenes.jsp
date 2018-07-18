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
        <title>Imágenes</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <link href="layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">
        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
    </head>
    <body id="top">
        <jsp:include page="header.jsp" flush="true" />
        <div class="wrapper row3">
  <main class="container clear"> 
    <div class="content" align="center"> 
        
   <div class="slider">
  <div><img src="images/slider/1.jpg" title=""></div>
  <div><img src="images/slider/2.jpg" title=""></div>
        <div><img src="images/slider/5.jpg" title=""></div>
          <div><img src="images/slider/6.jpg" title=""></div>
   
</div>
          <video width="854" height="480" controls>
  <source src="images/cda.mp4" type="video/mp4">
</video> 
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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>
<script>
    $(document).ready(function(){
      $('.slider').bxSlider({
            mode: 'fade',
    captions: true,
    slideWidth: 500
      });
    });
  </script>

  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<!-- IE9 Placeholder Support -->
<script src="../layout/scripts/jquery.placeholder.min.js"></script>
<!-- / IE9 Placeholder Support -->
</body>
</html>

