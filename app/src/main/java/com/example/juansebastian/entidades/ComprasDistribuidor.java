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

public class ComprasDistribuidor implements Serializable {
    private static final long serialVersionUID = 1L;

    private int idProducto;

    private Integer idComprasDis;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation

    private BigDecimal precioPqte;

    private BigDecimal precioCaja;

    private int idDistribuidor;


    private Date fechaCompraDis;

    private int idUsuario;

    public ComprasDistribuidor() {
    }

    public ComprasDistribuidor(Integer idComprasDis) {
        this.idComprasDis = idComprasDis;
    }

    public ComprasDistribuidor(Integer idComprasDis, int idProducto, BigDecimal precioPqte, BigDecimal precioCaja, int idDistribuidor, Date fechaCompraDis, int idUsuario) {
        this.idComprasDis = idComprasDis;
        this.idProducto = idProducto;
        this.precioPqte = precioPqte;
        this.precioCaja = precioCaja;
        this.idDistribuidor = idDistribuidor;
        this.fechaCompraDis = fechaCompraDis;
        this.idUsuario = idUsuario;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdComprasDis() {
        return idComprasDis;
    }

    public void setIdComprasDis(Integer idComprasDis) {
        this.idComprasDis = idComprasDis;
    }

    public BigDecimal getPrecioPqte() {
        return precioPqte;
    }

    public void setPrecioPqte(BigDecimal precioPqte) {
        this.precioPqte = precioPqte;
    }

    public BigDecimal getPrecioCaja() {
        return precioCaja;
    }

    public void setPrecioCaja(BigDecimal precioCaja) {
        this.precioCaja = precioCaja;
    }

    public int getIdDistribuidor() {
        return idDistribuidor;
    }

    public void setIdDistribuidor(int idDistribuidor) {
        this.idDistribuidor = idDistribuidor;
    }

    public Date getFechaCompraDis() {
        return fechaCompraDis;
    }

    public void setFechaCompraDis(Date fechaCompraDis) {
        this.fechaCompraDis = fechaCompraDis;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idComprasDis != null ? idComprasDis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComprasDistribuidor)) {
            return false;
        }
        ComprasDistribuidor other = (ComprasDistribuidor) object;
        if ((this.idComprasDis == null && other.idComprasDis != null) || (this.idComprasDis != null && !this.idComprasDis.equals(other.idComprasDis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.ComprasDistribuidor[ idComprasDis=" + idComprasDis + " ]";
    }
    
}
