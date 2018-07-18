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
        <title>Razón de Ser</title>
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
    <div class="content"> 
        <h1>¿Quiénes Somos?</h1>
     <div id="accordion">
  <h3>Misión</h3>
  <div>
    <p>
    Somos una comunidad humana donde el anciano desamparado recibe asistencia física, moral y espiritual en un ambiente de serenidad y alegría con la finalidad de mejorar su calidad de vida.
    </p>
  </div>
  <h3>Visión</h3>
  <div>
    <p>
    Ser una Casa Hogar de tal manera que arraigue  a cada anciano y anciana para que viva su vejez en un ambiente respetuoso donde pueda desarrollar sus facultades sintiéndose aceptado, valorado y amado.
    </p>
  </div>
     </div>
    </div>
      <br>
   <h1>¿Cómo trabajamos?</h1>
     <div id="accordion2">
  <h3>Bienestar Personal</h3>
  <div>
    <p>
    Salvaguardar la integridad física de los ancianos proporcionando alimentos, vestido, techo, atención médica y de rehabilitación.
    </p>
  </div>
  <h3>Desarrollo Humano</h3>
  <div>
    <p>
    Fomentar el desarrollo  pleno de cada anciano a través de acciones de empoderamiento, autonomía e independencia personal.
    </p>
  </div>
  <h3>Objetivo</h3>
  <div>
    <p>
    Fomentar el respeto a la dignidad y a los derechos fundamentales de la persona anciana, con la convicción de que los ancianos tienen aún mucho que dar a la vida social. 
    </p>
  </div>
</div>
   <br>
   <h1>Programas</h1>
   <div id="accordion3">
  <h3>Salud</h3>
  <div>
    <p>
Comprende la valoración y atención médica, control de medicamentos, higiene personal, terapia física y de rehabilitación.
    </p>
  </div>
  <h3>Alimentación</h3>
  <div>
    <p>
Compuesto por la elaboración de dietas alimenticias acordes a las necesidades específicas de los ancianos con la orientación nutricional que corresponda.    </p>
  </div>
  <h3>Apoyo Emocional</h3>
  <div>
    <p>
En el que se asiste con acompañamiento moral, espiritualidad, terapia psicológica y grupos de apoyo    </p>
  </div>
  <h3>Educación y Capacitación</h3>
  <div>
    <p>
Se realizan de manera cotidiana, talleres de pintura, música, manualidades, alfabetización.    </p>
  </div>
   <h3>Sociabilidad e integración social</h3>
  <div>
    <p>
Se llevan a cabo actividades recreativas, de convivencia con diversos grupos, esparcimiento y cohesión social.    </p>
  </div>
</div>
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
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#accordion" ).accordion({
      heightStyle: "content"
    });
     $( "#accordion2" ).accordion({
      heightStyle: "content"
    });
    $( "#accordion3" ).accordion({
      heightStyle: "content"
    });
  } );
  </script>
<!-- IE9 Placeholder Support -->
<script src="../layout/scripts/jquery.placeholder.min.js"></script>
<!-- / IE9 Placeholder Support -->
</body>
</html>

