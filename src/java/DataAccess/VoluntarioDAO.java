/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import BO.*;
import java.text.SimpleDateFormat;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chuy_
 */
public class VoluntarioDAO {

    private PreparedStatement statement;
    private Connection connection;
    private static final Logger logger = Logger.getLogger(VoluntarioDAO.class.getName());

    public VoluntarioDAO(Connection connection) {
        this.connection = connection;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void addVoluntario(Voluntario voluntario) {
        try {
            statement = connection.prepareStatement("INSERT INTO voluntarios(nombre,apellido,email,telefono,direccion,zip,ciudad,estado,estudios,servicio) VALUES(?,?,?,?,?,?,?,?,?,?)");
            synchronized (statement) {
                statement.setString(1, voluntario.getNombre());
                statement.setString(2, voluntario.getApellido());
                statement.setString(3, voluntario.getEmail());
                statement.setString(4, voluntario.getTelefono());
                statement.setString(5, voluntario.getDomicilio());
                statement.setString(6, voluntario.getZip());
                statement.setString(7, voluntario.getCiudad());
                statement.setString(8, voluntario.getEstado());
                statement.setString(9, voluntario.getEstudios());
                statement.setString(10, voluntario.getServicio());
                statement.executeUpdate();
            }
            statement.close();
        } catch (SQLException sqle) {
            logger.log(Level.SEVERE, sqle.toString(), sqle);
            throw new RuntimeException(sqle);
        }
    }

    public Voluntario getVoluntario(int id) {
        Voluntario v = new Voluntario();
        try {
            statement = connection.prepareStatement("select *from voluntarios where id = ?");
            statement.setInt(1, id);

            synchronized (statement) {
                ResultSet results = statement.executeQuery();

                while (results.next()) {
                    v.setId(id);
                    v.setNombre(results.getString("nombre"));
                    v.setApellido(results.getString("apellido"));
                    v.setEmail(results.getString("email"));
                    v.setTelefono(results.getString("telefono"));
                    v.setDomicilio(results.getString("direccion"));
                    v.setZip(results.getString("zip"));
                    v.setCiudad(results.getString("ciudad"));
                    v.setEstado(results.getString("estado"));
                    v.setEstudios(results.getString("estudios"));
                    v.setServicio(results.getString("servicio"));
                    
                }
            }
            statement.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
        return v;
    }

    public void updateVoluntario(Voluntario v) {
        try {
            statement = connection.prepareStatement("update voluntarios set nombre = ?, apellido = ?, email = ?, telefono = ?, direccion = ?, zip = ?, ciudad = ?, estado = ?, estudios = ?, servicio = ?  where id = ? ");
            statement.setString(1, v.getNombre());
            statement.setString(2, v.getApellido());
            statement.setString(3, v.getEmail());
            statement.setString(4, v.getTelefono());
            statement.setString(5, v.getDomicilio());
            statement.setString(6, v.getZip());
            statement.setString(7, v.getCiudad());
            statement.setString(8, v.getEstado());
            statement.setString(9, v.getEstudios());
            statement.setString(10, v.getServicio());
            statement.setInt(11, v.getId());
            synchronized (statement) {
                ResultSet results = statement.executeQuery();
            }
            statement.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public boolean findUser(String usuario, String contraseña) {
        User user = null;
        try {
            statement = connection.prepareStatement("select *from usuarios where usuario = ? and contraseña = ?");
            statement.setString(1, usuario);
            statement.setString(2, contraseña);
            synchronized (statement) {
                ResultSet results = statement.executeQuery();

                while (results.next()) {
                    user = new User();
                    user.setUsuario(results.getString("usuario"));
                    user.setContraseña(results.getString("contraseña"));
                }
            }
            statement.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
        if (user != null) {
            return true;
        }
        return false;
    }

    public List<Voluntario> allVoluntarios() {
        List<Voluntario> voluntarios = new ArrayList<>();
        Voluntario v = null;
        try {
            statement = connection.prepareStatement("select *from voluntarios");
            synchronized (statement) {
                ResultSet results = statement.executeQuery();

                while (results.next()) {
                    v = new Voluntario();
                    v.setId(Integer.parseInt(results.getString("id")));
                    v.setNombre(results.getString("nombre"));
                    v.setApellido(results.getString("apellido"));
                    v.setEmail(results.getString("email"));
                    v.setTelefono(results.getString("telefono"));
                    v.setDomicilio(results.getString("direccion"));
                    v.setZip(results.getString("zip"));
                    v.setCiudad(results.getString("ciudad"));
                    v.setEstado(results.getString("estado"));
                    v.setEstudios(results.getString("estudios"));
                    v.setServicio(results.getString("servicio"));
                    voluntarios.add(v);
                }
            }
            statement.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
        return voluntarios;
    }

    /* public void updateVoluntario(Voluntario v) {
        try {
            statement = connection.prepareStatement("update voluntatios set nombre = ?, cantidad = ?, status = ?  where id = ? ");
            statement.setString(1, i.getNombre());
            statement.setInt(2, i.getCantidad());
            statement.setString(3, i.getStatus());
            statement.setInt(4, i.getId());
            synchronized (statement) {
                ResultSet results = statement.executeQuery();
            }
            statement.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }*/
 /* public void addUserMySql(User user) {
        try {
            Statement statement = connection.createStatement();
            String query = "INSERT INTO users values ('" + user.getEmail() + "','" + user.getFirstName() + "','" + user.getLastName() + "','" + user.getArea() + "')";
            statement.executeUpdate(query);
            connection.close();
        } catch (SQLException e) {
            System.err.println(e);
        }

    }*/
}
