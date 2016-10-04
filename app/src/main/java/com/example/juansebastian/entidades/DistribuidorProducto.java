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

public class DistribuidorProducto implements Serializable {
    private static final long serialVersionUID = 1L;

    private int idDistribuidor;

    private int idProducto;

    private Integer idDistribuidorProducto;

    public DistribuidorProducto() {
    }

    public DistribuidorProducto(Integer idDistribuidorProducto) {
        this.idDistribuidorProducto = idDistribuidorProducto;
    }

    public DistribuidorProducto(Integer idDistribuidorProducto, int idDistribuidor, int idProducto) {
        this.idDistribuidorProducto = idDistribuidorProducto;
        this.idDistribuidor = idDistribuidor;
        this.idProducto = idProducto;
    }

    public int getIdDistribuidor() {
        return idDistribuidor;
    }

    public void setIdDistribuidor(int idDistribuidor) {
        this.idDistribuidor = idDistribuidor;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdDistribuidorProducto() {
        return idDistribuidorProducto;
    }

    public void setIdDistribuidorProducto(Integer idDistribuidorProducto) {
        this.idDistribuidorProducto = idDistribuidorProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDistribuidorProducto != null ? idDistribuidorProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DistribuidorProducto)) {
            return false;
        }
        DistribuidorProducto other = (DistribuidorProducto) object;
        if ((this.idDistribuidorProducto == null && other.idDistribuidorProducto != null) || (this.idDistribuidorProducto != null && !this.idDistribuidorProducto.equals(other.idDistribuidorProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.DistribuidorProducto[ idDistribuidorProducto=" + idDistribuidorProducto + " ]";
    }
    
}
