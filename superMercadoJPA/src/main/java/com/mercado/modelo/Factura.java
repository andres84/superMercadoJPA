package com.mercado.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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

    public Factura() {
    }

    public Factura(int cod_factura, String tipo, Date fecha, String observacion) {
        this.cod_factura = cod_factura;
        this.tipo = tipo;
        this.fecha = fecha;
        this.observacion = observacion;
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
        return "Factura{" + "cod_factura=" + cod_factura + ", tipo=" + tipo + ", fecha=" + fecha + ", observacion=" + observacion + '}';
    }

}
