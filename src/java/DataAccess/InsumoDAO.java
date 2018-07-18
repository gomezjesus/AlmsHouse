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
public class InsumoDAO {

    private PreparedStatement statement;
    private Connection connection;
    private static final Logger logger = Logger.getLogger(VoluntarioDAO.class.getName());

    public InsumoDAO(Connection connection) {
        this.connection = connection;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void addInsumo(Insumo insumo) {
        try {
            statement = connection.prepareStatement("INSERT INTO insumos(nombre,categoria,cantidad,tipo_unidad,status) VALUES(?,?,?,?,?)");
            synchronized (statement) {
                statement.setString(1, insumo.getNombre());
                statement.setString(2, insumo.getCategoria());
                statement.setInt(3, insumo.getCantidad());
                statement.setString(4, insumo.getUnidad());
                statement.setString(5, insumo.getStatus());
                statement.executeUpdate();
            }
            statement.close();
        } catch (SQLException sqle) {
            logger.log(Level.SEVERE, sqle.toString(), sqle);
            throw new RuntimeException(sqle);
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

    public List<Insumo> showEscasos() {
        List<Insumo> insumos = new ArrayList<>();
        Insumo i = null;
        try {
            statement = connection.prepareStatement("select * from insumos where status in ('Escaso','Aceptable')");
            synchronized (statement) {
                ResultSet results = statement.executeQuery();
                while (results.next()) {
                    i = new Insumo();
                    i.setId(Integer.parseInt(results.getString("id")));
                    i.setNombre(results.getString("nombre"));
                    i.setCategoria(results.getString("categoria"));
                    i.setCantidad(Integer.parseInt(results.getString("cantidad")));
                    i.setUnidad(results.getString("tipo_unidad"));
                    i.setStatus(results.getString("status"));
                    insumos.add(i);
                }
            }
            statement.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
        return insumos;
    }

    public List<Insumo> allInsumos() {
        List<Insumo> insumos = new ArrayList<>();
        Insumo i = null;
        try {
            statement = connection.prepareStatement("select *from insumos");
            synchronized (statement) {
                ResultSet results = statement.executeQuery();

                while (results.next()) {
                    i = new Insumo();
                    i.setId(Integer.parseInt(results.getString("id")));
                    i.setNombre(results.getString("nombre"));
                    i.setCategoria(results.getString("categoria"));
                    i.setCantidad(Integer.parseInt(results.getString("cantidad")));
                    i.setUnidad(results.getString("tipo_unidad"));
                    i.setStatus(results.getString("status"));
                    insumos.add(i);
                }
            }
            statement.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
        return insumos;
    }

    public void updateInsumo(Insumo i) {
        try {
            statement = connection.prepareStatement("update insumos set nombre = ?, cantidad = ?, status = ?  where id = ? ");
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
    }

    public Insumo getInsumo(int id) {
        Insumo i = new Insumo();
        try {
            statement = connection.prepareStatement("select *from insumos where id = ?");
            statement.setInt(1, id);

            synchronized (statement) {
                ResultSet results = statement.executeQuery();

                while (results.next()) {
                    i.setId(id);
                    i.setNombre(results.getString("nombre"));
                    i.setCategoria(results.getString("categoria"));
                    i.setCantidad(Integer.parseInt(results.getString("cantidad")));
                    i.setUnidad(results.getString("tipo_unidad"));
                    i.setStatus(results.getString("status"));
                }
            }
            statement.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
        return i;
    }
}
