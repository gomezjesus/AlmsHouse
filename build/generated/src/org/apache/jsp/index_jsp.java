package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("Template Name: Meanessa\n");
      out.write("Author: <a href=\"http://www.os-templates.com/\">OS Templates</a>\n");
      out.write("Author URI: http://www.os-templates.com/\n");
      out.write("Licence: Free to use under our free template licence terms\n");
      out.write("Licence URI: http://www.os-templates.com/template-terms\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Casa del Anciano</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n");
      out.write("        <link href=\"layout/styles/layout.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("    </head>\n");
      out.write("    <body id=\"top\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, true);
      out.write("\n");
      out.write("        <div class=\"wrapper overlay bgded\" style=\"background-image:url('images/foto3.JPG')\">\n");
      out.write("            <div id=\"pageintro\" class=\"centred clear\"> \n");
      out.write("                <ul class=\"carousel-items\">\n");
      out.write("                    <li>\n");
      out.write("                        <article>\n");
      out.write("                            <h2 class=\"heading\">Misión</h2>\n");
      out.write("                            <p>Ofrecer un espacio y crear una comunidad humana donde el anciano desamparado reciba asistencia física, moral y espiritual en un ambiente de serenidad y alegría con la finalidad de mejorar su alegría.</p>\n");
      out.write("                            <footer><a class=\"btn\" href=\"#\">Ver más</a></footer>\n");
      out.write("                        </article>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <article>\n");
      out.write("                            <h2 class=\"heading\">Visión</h2>\n");
      out.write("                            <p>Ser una Casa Hogar de tal manera que arraigue  a cada anciano y anciana para que viva su vejez en un ambiente respetuoso donde pueda desarrollar sus facultades sintiéndose aceptado, valorado y amado.</p>\n");
      out.write("                            <footer><a class=\"btn\" href=\"#\">Ver más</a></footer>\n");
      out.write("                        </article>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <article>\n");
      out.write("                            <h2 class=\"heading\">Valores</h2>\n");
      out.write("                            <p>Reconocer y respetar la dignidad del anciano, promoviendo sus derechos. Sentar las bases de una cultura humana de la vejez. Iluminar desde la fe el paso de la vida, a la verdadera vida.</p>\n");
      out.write("                            <footer><a class=\"btn\" href=\"#\">Ver más</a></footer>\n");
      out.write("                        </article>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"wrapper row3\">\n");
      out.write("            <main class=\"container clear\"> \n");
      out.write("                <div class=\"center clear\">\n");
      out.write("                    <div class=\"btmspace-50\">\n");
      out.write("                        <h2 class=\"underlined\">Certificaciones</h2>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"group services\">\n");
      out.write("                        <article class=\"one_third first\"><i></i>\n");
      out.write("                            <h4 class=\"font-x1 underlined\"><a href=\"#\">Voluntariado y Capacitación para la vida</a></h4>\n");
      out.write("                            <p>Registro estatal de las organizaciones de la sociedad civil.</p>\n");
      out.write("                        </article>\n");
      out.write("                        <article class=\"one_third\"><i></i>\n");
      out.write("                            <h4 class=\"font-x1 underlined\"><a href=\"#\">Sistema Nacional para el Desarrollo Integral de la Familia</a></h4>\n");
      out.write("                            <p>Constancia Por iniciar, promover, fomentar, estimular, patrocinar, sostener, administrar y dirigir toda clase de actividades que tenga por objeto atender en la Casa del Anciano Doctor Samuel Silva, a los indigentes y desamparados de ambos sexos.</p>\n");
      out.write("                        </article>\n");
      out.write("                        <article class=\"one_third last\"><i ></i>\n");
      out.write("                            <h4 class=\"font-x1 underlined\"><a href=\"#\">Cemefi 2011 y  2016</a></h4>\n");
      out.write("                            <p>Certificación de institucionalidad y trasparencia, nivel óptimo.</p>\n");
      out.write("                        </article>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("            </main>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"split clear\" style=\"background-image:url('images/2.JPG');\">\n");
      out.write("            <div class=\"box\"> \n");
      out.write("                <article class=\"btmspace-50\">\n");
      out.write("                    <h4>Objetivo</h4>\n");
      out.write("                    <p class=\"nospace\">Fomentar el respeto a la dignidad y a los derechos fundamentales de la persona anciana, con la convicción de que los ancianos tienen aún mucho que dar a la vida social. </a></p>\n");
      out.write("                </article>\n");
      out.write("                <article>\n");
      out.write("                    <h4>Meta Institucional</h4>\n");
      out.write("                    <p class=\"nospace\">Dar respuesta a las necesidades actuales de los residentes de la Casa Hogar;  con instalaciones adecuadas, seguras, salubres y personal capacitado, bien remunerado y comprometido. Por ello es importante una estrategia permanente de Recaudación de fondos.</a></p>\n");
      out.write("                </article>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"clear\"></div>\n");
      out.write("</section>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, true);
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"wrapper overlay bgded\" style=\"background-image:url('images/demo/backgrounds/03.png')\">\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<a id=\"backtotop\" href=\"#top\"><i class=\"fa fa-chevron-up\"></i></a>\n");
      out.write("<script src=\"layout/scripts/jquery.min.js\"></script>\n");
      out.write("<script src=\"layout/scripts/jquery.backtotop.js\"></script>\n");
      out.write("<script src=\"layout/scripts/jquery.mobilemenu.js\"></script>\n");
      out.write("<script src=\"layout/scripts/jquery.placeholder.min.js\"></script>\n");
      out.write("<script src=\"layout/scripts/jquery.flexslider-min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
