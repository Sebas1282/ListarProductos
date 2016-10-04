/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.juansebastian.entidades;

import java.io.Serializable;


/**
 *
 * @author juansebastiannaranjoadarve
 */

public class Bodega implements Serializable {
    private static final long serialVersionUID = 1L;

    private int cantDispProd;

    private int cantidadProducto;

    private Integer idBodega;

    private int idProducto;

    private int idDistribuidor;

    public Bodega() {
    }

    public Bodega(Integer idBodega) {
        this.idBodega = idBodega;
    }

    public Bodega(Integer idBodega, int cantDispProd, int cantidadProducto, int idProducto, int idDistribuidor) {
        this.idBodega = idBodega;
        this.cantDispProd = cantDispProd;
        this.cantidadProducto = cantidadProducto;
        this.idProducto = idProducto;
        this.idDistribuidor = idDistribuidor;
    }

    public int getCantDispProd() {
        return cantDispProd;
    }

    public void setCantDispProd(int cantDispProd) {
        this.cantDispProd = cantDispProd;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public Integer getIdBodega() {
        return idBodega;
    }

    public void setIdBodega(Integer idBodega) {
        this.idBodega = idBodega;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdDistribuidor() {
        return idDistribuidor;
    }

    public void setIdDistribuidor(int idDistribuidor) {
        this.idDistribuidor = idDistribuidor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBodega != null ? idBodega.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bodega)) {
            return false;
        }
        Bodega other = (Bodega) object;
        if ((this.idBodega == null && other.idBodega != null) || (this.idBodega != null && !this.idBodega.equals(other.idBodega))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Bodega[ idBodega=" + idBodega + " ]";
    }
    
}
