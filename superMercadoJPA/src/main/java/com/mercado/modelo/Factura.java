package com.mercado.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "factura")
public class Factura implements Serializable {

    @Id
    private int cod_factura;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "observacion")
    private String observacion;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "codigo_cliente")
    private Cliente cliente;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "codigo_empleado")
    private Empleado empleado;

    @ManyToMany(mappedBy = "factura", cascade = CascadeType.ALL)
    List<Producto> producto = new ArrayList<>();
    
    
    public void agregarP(Producto p){
        
        producto.add(p);
        p.getFactura().add(this);
        
    }

    public Factura() {
    }

    public Factura(int cod_factura, String tipo, Date fecha, String observacion, Cliente cliente, Empleado empleado) {
        this.cod_factura = cod_factura;
        this.tipo = tipo;
        this.fecha = fecha;
        this.observacion = observacion;
        this.cliente = cliente;
        this.empleado = empleado;
    }

    public List<Producto> getProducto() {
        return producto;
    }

    public void setProducto(List<Producto> producto) {
        this.producto = producto;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCod_factura() {
        return cod_factura;
    }

    public void setCod_factura(int cod_factura) {
        this.cod_factura = cod_factura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
        hash = 31 * hash + this.cod_factura;
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
        final Factura other = (Factura) obj;
        if (this.cod_factura != other.cod_factura) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Factura{" + "cod_factura=" + cod_factura + ", tipo=" + tipo + ", fecha=" + fecha + ", observacion=" + observacion + ", cliente=" + cliente + ", empleado=" + empleado + '}';
    }

}
