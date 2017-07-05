package com.mercado.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto implements Serializable {

    @Id
    private int cod_producto;

    @Column(name = "nombre_pro")
    private String nombre_pro;

    @Column(name = "precio")
    private int precio;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "observacion")
    private String observacion;

    public Producto() {
    }

    public Producto(int cod_producto, String nombre_pro, int precio, int cantidad, String observacion) {
        this.cod_producto = cod_producto;
        this.nombre_pro = nombre_pro;
        this.precio = precio;
        this.cantidad = cantidad;
        this.observacion = observacion;
    }

    public int getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(int cod_producto) {
        this.cod_producto = cod_producto;
    }

    public String getNombre_pro() {
        return nombre_pro;
    }

    public void setNombre_pro(String nombre_pro) {
        this.nombre_pro = nombre_pro;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.cod_producto;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (this.cod_producto != other.cod_producto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Producto{" + "cod_producto=" + cod_producto + ", nombre_pro=" + nombre_pro + ", precio=" + precio + ", cantidad=" + cantidad + ", observacion=" + observacion + '}';
    }

}
