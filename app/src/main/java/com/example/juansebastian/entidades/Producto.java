/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.juansebastian.entidades;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 *
 * @author juansebastiannaranjoadarve
 */

public class Producto implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombreProducto;

    private int unidadesCaja;

    private int unidadesPaquete;

    private Integer idProducto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation

    private double precioPqte;

    private double precioCaja;

    private int idDistribuidor;

    private int idBodega;

    public Producto() {
    }

    public Producto(Integer idProducto) {

        this.idProducto = idProducto;
    }

    public Producto(Integer idProducto, String nombreProducto, int unidadesCaja, int unidadesPaquete, double precioPqte, double precioCaja, int idDistribuidor, int idBodega) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.unidadesCaja = unidadesCaja;
        this.unidadesPaquete = unidadesPaquete;
        this.precioPqte = precioPqte;
        this.precioCaja = precioCaja;
        this.idDistribuidor = idDistribuidor;
        this.idBodega = idBodega;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getUnidadesCaja() {
        return unidadesCaja;
    }

    public void setUnidadesCaja(int unidadesCaja) {
        this.unidadesCaja = unidadesCaja;
    }

    public int getUnidadesPaquete() {
        return unidadesPaquete;
    }

    public void setUnidadesPaquete(int unidadesPaquete) {
        this.unidadesPaquete = unidadesPaquete;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public double getPrecioPqte() {
        return precioPqte;
    }

    public void setPrecioPqte(double precioPqte) {
        this.precioPqte = precioPqte;
    }

    public double getPrecioCaja() {
        return precioCaja;
    }

    public void setPrecioCaja(double precioCaja) {
        this.precioCaja = precioCaja;
    }

    public int getIdDistribuidor() {
        return idDistribuidor;
    }

    public void setIdDistribuidor(int idDistribuidor) {
        this.idDistribuidor = idDistribuidor;
    }

    public int getIdBodega() {
        return idBodega;
    }

    public void setIdBodega(int idBodega) {
        this.idBodega = idBodega;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProducto != null ? idProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Producto[ idProducto=" + idProducto + " ]";
    }
    
}
