/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.juansebastian.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 *
 * @author juansebastiannaranjoadarve
 */

public class VentasCliente implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer idVentas;

    private int idProducto;

    private int idCliente;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation

    private BigDecimal gananciaVta;

    private Date fechaVenta;

    public VentasCliente() {
    }

    public VentasCliente(Integer idVentas) {
        this.idVentas = idVentas;
    }

    public VentasCliente(Integer idVentas, int idProducto, int idCliente, BigDecimal gananciaVta, Date fechaVenta) {
        this.idVentas = idVentas;
        this.idProducto = idProducto;
        this.idCliente = idCliente;
        this.gananciaVta = gananciaVta;
        this.fechaVenta = fechaVenta;
    }

    public Integer getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(Integer idVentas) {
        this.idVentas = idVentas;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public BigDecimal getGananciaVta() {
        return gananciaVta;
    }

    public void setGananciaVta(BigDecimal gananciaVta) {
        this.gananciaVta = gananciaVta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVentas != null ? idVentas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VentasCliente)) {
            return false;
        }
        VentasCliente other = (VentasCliente) object;
        if ((this.idVentas == null && other.idVentas != null) || (this.idVentas != null && !this.idVentas.equals(other.idVentas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.VentasCliente[ idVentas=" + idVentas + " ]";
    }
    
}
