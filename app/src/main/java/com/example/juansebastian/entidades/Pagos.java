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

public class Pagos implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer idPago;

    private int idCliente;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation

    private BigDecimal abono;

    private BigDecimal deudaPendiente;

    private BigDecimal pagoTotal;

    private Date fechaPago;

    public Pagos() {
    }

    public Pagos(Integer idPago) {
        this.idPago = idPago;
    }

    public Pagos(Integer idPago, int idCliente, Date fechaPago) {
        this.idPago = idPago;
        this.idCliente = idCliente;
        this.fechaPago = fechaPago;
    }

    public Integer getIdPago() {
        return idPago;
    }

    public void setIdPago(Integer idPago) {
        this.idPago = idPago;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public BigDecimal getAbono() {
        return abono;
    }

    public void setAbono(BigDecimal abono) {
        this.abono = abono;
    }

    public BigDecimal getDeudaPendiente() {
        return deudaPendiente;
    }

    public void setDeudaPendiente(BigDecimal deudaPendiente) {
        this.deudaPendiente = deudaPendiente;
    }

    public BigDecimal getPagoTotal() {
        return pagoTotal;
    }

    public void setPagoTotal(BigDecimal pagoTotal) {
        this.pagoTotal = pagoTotal;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPago != null ? idPago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pagos)) {
            return false;
        }
        Pagos other = (Pagos) object;
        if ((this.idPago == null && other.idPago != null) || (this.idPago != null && !this.idPago.equals(other.idPago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Pagos[ idPago=" + idPago + " ]";
    }
    
}
