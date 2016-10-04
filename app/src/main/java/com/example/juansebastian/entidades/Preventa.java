/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.juansebastian.entidades;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author juansebastiannaranjoadarve
 */

public class Preventa implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer idPreventa;

    private int idCliente;

    private int idProducto;

    private Date fechaPreventa;

    public Preventa() {
    }

    public Preventa(Integer idPreventa) {
        this.idPreventa = idPreventa;
    }

    public Preventa(Integer idPreventa, int idCliente, int idProducto, Date fechaPreventa) {
        this.idPreventa = idPreventa;
        this.idCliente = idCliente;
        this.idProducto = idProducto;
        this.fechaPreventa = fechaPreventa;
    }

    public Integer getIdPreventa() {
        return idPreventa;
    }

    public void setIdPreventa(Integer idPreventa) {
        this.idPreventa = idPreventa;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public Date getFechaPreventa() {
        return fechaPreventa;
    }

    public void setFechaPreventa(Date fechaPreventa) {
        this.fechaPreventa = fechaPreventa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPreventa != null ? idPreventa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Preventa)) {
            return false;
        }
        Preventa other = (Preventa) object;
        if ((this.idPreventa == null && other.idPreventa != null) || (this.idPreventa != null && !this.idPreventa.equals(other.idPreventa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Preventa[ idPreventa=" + idPreventa + " ]";
    }
    
}
