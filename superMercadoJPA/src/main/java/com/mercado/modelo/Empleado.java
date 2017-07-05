package com.mercado.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado implements Serializable {

    @Id
    private int cod_empleado;

    @Column(name = "nombre_emp")
    private String nombre_emp;

    @Column(name = "apellidos_emp")
    private String apellidos_emp;

    @Column(name = "cargo_emp")
    private String cargo_emp;

    @Column(name = "direccion_emp")
    private String direccion_emp;

    @Column(name = "telefono_emp")
    private int telefono;

    @Column(name = "correo_emp")
    private String correo_emp;

    public Empleado() {
    }

    public Empleado(int cod_empleado, String nombre_emp, String apellidos_emp, String cargo_emp, String direccion_emp, int telefono, String correo_emp) {
        this.cod_empleado = cod_empleado;
        this.nombre_emp = nombre_emp;
        this.apellidos_emp = apellidos_emp;
        this.cargo_emp = cargo_emp;
        this.direccion_emp = direccion_emp;
        this.telefono = telefono;
        this.correo_emp = correo_emp;
    }

    public int getCod_empleado() {
        return cod_empleado;
    }

    public void setCod_empleado(int cod_empleado) {
        this.cod_empleado = cod_empleado;
    }

    public String getNombre_emp() {
        return nombre_emp;
    }

    public void setNombre_emp(String nombre_emp) {
        this.nombre_emp = nombre_emp;
    }

    public String getApellidos_emp() {
        return apellidos_emp;
    }

    public void setApellidos_emp(String apellidos_emp) {
        this.apellidos_emp = apellidos_emp;
    }

    public String getCargo_emp() {
        return cargo_emp;
    }

    public void setCargo_emp(String cargo_emp) {
        this.cargo_emp = cargo_emp;
    }

    public String getDireccion_emp() {
        return direccion_emp;
    }

    public void setDireccion_emp(String direccion_emp) {
        this.direccion_emp = direccion_emp;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo_emp() {
        return correo_emp;
    }

    public void setCorreo_emp(String correo_emp) {
        this.correo_emp = correo_emp;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.cod_empleado;
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
        final Empleado other = (Empleado) obj;
        if (this.cod_empleado != other.cod_empleado) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Empleado{" + "cod_empleado=" + cod_empleado + ", nombre_emp=" + nombre_emp + ", apellidos_emp=" + apellidos_emp + ", cargo_emp=" + cargo_emp + ", direccion_emp=" + direccion_emp + ", telefono=" + telefono + ", correo_emp=" + correo_emp + '}';
    }

}
