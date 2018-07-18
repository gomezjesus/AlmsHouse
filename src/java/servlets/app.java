/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import BO.Insumo;
import BO.Voluntario;
import DataAccess.ConnectionDB;
import DataAccess.InsumoDAO;
import DataAccess.VoluntarioDAO;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chuy_
 */
@WebServlet(name = "app", urlPatterns = {"/app"})
public class app extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet app</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet app at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        String id = request.getParameter("id");
        String idv = request.getParameter("idv");
        ConnectionDB connectionDB = new ConnectionDB();
        Connection connection = connectionDB.getConnection();
        VoluntarioDAO userDao = new VoluntarioDAO(connection);
        String url = "";
        if (action != null) {
            if (action.equals("showv")) {
                List<Voluntario> voluntarios = new ArrayList<>();
                voluntarios = userDao.allVoluntarios();
                request.setAttribute("voluntarios", voluntarios);
                url = "/voluntarios.jsp";
            } else if (action.equals("showI")) {
                InsumoDAO insumoDao = new InsumoDAO(connection);
                List<Insumo> insumos = new ArrayList<>();
                insumos = insumoDao.allInsumos();
                request.setAttribute("insumos", insumos);
                url = "/insumosall.jsp";
            } else if (action.equals("urgent")) {
                InsumoDAO insumoDao = new InsumoDAO(connection);
                List<Insumo> insumos = new ArrayList<>();
                insumos = insumoDao.showEscasos();
                request.setAttribute("insumos", insumos);
                url = "/urgente.jsp";
            }
        } else if (id != null) {
            InsumoDAO insumoDao = new InsumoDAO(connection);
            Insumo insumo = insumoDao.getInsumo(Integer.parseInt(id));
            request.setAttribute("insumo", insumo);
            url = "/insumo_details.jsp";

        } else if (idv != null) {
            VoluntarioDAO voluntarioDao = new VoluntarioDAO(connection);
            Voluntario v = voluntarioDao.getVoluntario(Integer.parseInt(idv));
            request.setAttribute("voluntario", v);
            url = "/voluntarios_details.jsp";
        }

        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        String url = "/index.jsp";
        if (action.equals("find")) {
            ConnectionDB connectionDB = new ConnectionDB();
            Connection connection = connectionDB.getConnection();
            VoluntarioDAO userDao = new VoluntarioDAO(connection);
            String usuario = request.getParameter("usuario");
            String pass = request.getParameter("pass");
            boolean found = userDao.findUser(usuario, pass);
            if (found) {
                url = "/admin.jsp";
            } else {
                url = "/loginf.jsp";
            }
        } else if (action.equals("addV")) {
            ConnectionDB connectionDB = new ConnectionDB();
            Connection connection = connectionDB.getConnection();
            VoluntarioDAO userDao = new VoluntarioDAO(connection);
            String nombre = request.getParameter("name");
            String apellido = request.getParameter("lastname");
            String email = request.getParameter("email");
            String tel = request.getParameter("tel");
            String domicilio = request.getParameter("address");
            String zip = request.getParameter("zip");
            String ciudad = request.getParameter("city");
            String estado = request.getParameter("state");
            String estudio = request.getParameter("study");
            String servicio = request.getParameter("service");

            Voluntario v = new Voluntario(nombre, apellido, email, domicilio, estado, ciudad, zip, estudio, servicio, tel);
            userDao.addVoluntario(v);
            url = "/success.jsp";
        } else if (action.equals("addI")) {
            ConnectionDB connectionDB = new ConnectionDB();
            Connection connection = connectionDB.getConnection();
            InsumoDAO insumoDao = new InsumoDAO(connection);
            String nombre = request.getParameter("name");
            String categoria = request.getParameter("category");
            int cantidad = Integer.parseInt(request.getParameter("qty"));
            String unidad = request.getParameter("unit");
            String status = request.getParameter("status");

            Insumo i = new Insumo(nombre, categoria, cantidad, unidad, status);
            insumoDao.addInsumo(i);
            url = "/success_add.jsp";
        } else if (action.equals("showI")) {
            ConnectionDB connectionDB = new ConnectionDB();
            Connection connection = connectionDB.getConnection();
            InsumoDAO insumoDao = new InsumoDAO(connection);
        } else if (action.equals("edit")) {
            ConnectionDB connectionDB = new ConnectionDB();
            Connection connection = connectionDB.getConnection();
            InsumoDAO insumoDao = new InsumoDAO(connection);
            int id = Integer.parseInt(request.getParameter("id"));
            String nombre = request.getParameter("name");
            String categoria = request.getParameter("category");
            int cantidad = Integer.parseInt(request.getParameter("qty"));
            String unidad = request.getParameter("unit");
            String status = request.getParameter("status");
            Insumo i = new Insumo(id, nombre, categoria, cantidad, unidad, status);
            insumoDao.updateInsumo(i);
            url = "/success_edit.jsp";
        } else if (action.equals("editV")) {
            ConnectionDB connectionDB = new ConnectionDB();
            Connection connection = connectionDB.getConnection();
            VoluntarioDAO voluntarioDao = new VoluntarioDAO(connection);
            int idv = Integer.parseInt(request.getParameter("id"));
            String nombre = request.getParameter("name");
            String apellido = request.getParameter("lastname");
            String email = request.getParameter("email");
            String tel = request.getParameter("tel");
            String domicilio = request.getParameter("address");
            String zip = request.getParameter("zip");
            String ciudad = request.getParameter("city");
            String estado = request.getParameter("state");
            String estudio = request.getParameter("study");
            String servicio = request.getParameter("service");
            Voluntario v = new Voluntario(idv,nombre, apellido, email, domicilio, estado, ciudad, zip, estudio, servicio, tel);
            voluntarioDao.updateVoluntario(v);
            url = "/success_edit.jsp";

        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
