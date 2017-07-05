package com.mercado.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

    @Id
    private int cod_cliente;

    @Column(name = "nombre_cli")
    private String nombre_cli;

    @Column(name = "apellidos_cli")
    private String apellidos_cli;

    @Column(name = "direccion_cli")
    private String direccion_cli;

    @Column(name = "telefono")
    private int telefono;

    @Column(name = "correo")
    private String correo;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    List<Factura> factura = new ArrayList<>();
    
    @ManyToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    List<Empleado> empleado = new ArrayList<>();
    
    @ManyToMany(mappedBy = "cliente")
    List<Producto> producto = new ArrayList<>();
    
    public void agregarE(Empleado e){
        
        empleado.add(e);
        e.getCliente().add(this);
        
    }
    
    public void agregarP(Producto p){
        
        producto.add(p);
        p.getCliente().add(this);
        
    }

    public Cliente() {
    }
    

    public Cliente(int cod_cliente, String nombre_cli, String apellidos_cli, String direccion_cli, int telefono, String correo) {
        this.cod_cliente = cod_cliente;
        this.nombre_cli = nombre_cli;
        this.apellidos_cli = apellidos_cli;
        this.direccion_cli = direccion_cli;
        this.telefono = telefono;
        this.correo = correo;
    }

    public List<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(List<Empleado> empleado) {
        this.empleado = empleado;
    }

    public List<Producto> getProducto() {
        return producto;
    }

    public void setProducto(List<Producto> producto) {
        this.producto = producto;
    }
    
    

    public List<Factura> getFactura() {
        return factura;
    }

    public void setFactura(List<Factura> factura) {
        this.factura = factura;
    }

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public String getNombre_cli() {
        return nombre_cli;
    }

    public void setNombre_cli(String nombre_cli) {
        this.nombre_cli = nombre_cli;
    }

    public String getApellidos_cli() {
        return apellidos_cli;
    }

    public void setApellidos_cli(String apellidos_cli) {
        this.apellidos_cli = apellidos_cli;
    }

    public String getDireccion_cli() {
        return direccion_cli;
    }

    public void setDireccion_cli(String direccion_cli) {
        this.direccion_cli = direccion_cli;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.cod_cliente;
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
        final Cliente other = (Cliente) obj;
        if (this.cod_cliente != other.cod_cliente) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cod_cliente=" + cod_cliente + ", nombre_cli=" + nombre_cli + ", apellidos_cli=" + apellidos_cli + ", direccion_cli=" + direccion_cli + ", telefono=" + telefono + ", correo=" + correo + '}';
    }

}
