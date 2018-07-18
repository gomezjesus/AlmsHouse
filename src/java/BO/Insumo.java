/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

/**
 *
 * @author chuy_
 */
public class Insumo {

    private String nombre, categoria, unidad, status;
    private int id, cantidad;

    public Insumo() {
    }

    public Insumo(String nombre, String categoria, int cantidad, String unidad, String status) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.unidad = unidad;
        this.status = status;
    }

    public Insumo(int id, String nombre, String categoria, int cantidad, String unidad, String status) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.unidad = unidad;
        this.status = status;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the unidad
     */
    public String getUnidad() {
        return unidad;
    }

    /**
     * @param unidad the unidad to set
     */
    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    /**
     * @return the statu
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param statu the statu to set
     */
    public void setStatus(String statu) {
        this.status = statu;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

}
