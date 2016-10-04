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

public class Distribuidor implements Serializable {
    private static final long serialVersionUID = 1L;

    private String identificacionNit;

    private String nombreEmpresaDist;

    private String nombreRepresentante;

    private String telefonoCelular;

    private Integer idDistribuidor;

    public Distribuidor() {
    }

    public Distribuidor(Integer idDistribuidor) {
        this.idDistribuidor = idDistribuidor;
    }

    public Distribuidor(Integer idDistribuidor, String identificacionNit, String nombreEmpresaDist, String nombreRepresentante) {
        this.idDistribuidor = idDistribuidor;
        this.identificacionNit = identificacionNit;
        this.nombreEmpresaDist = nombreEmpresaDist;
        this.nombreRepresentante = nombreRepresentante;
    }

    public String getIdentificacionNit() {
        return identificacionNit;
    }

    public void setIdentificacionNit(String identificacionNit) {
        this.identificacionNit = identificacionNit;
    }

    public String getNombreEmpresaDist() {
        return nombreEmpresaDist;
    }

    public void setNombreEmpresaDist(String nombreEmpresaDist) {
        this.nombreEmpresaDist = nombreEmpresaDist;
    }

    public String getNombreRepresentante() {
        return nombreRepresentante;
    }

    public void setNombreRepresentante(String nombreRepresentante) {
        this.nombreRepresentante = nombreRepresentante;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public Integer getIdDistribuidor() {
        return idDistribuidor;
    }

    public void setIdDistribuidor(Integer idDistribuidor) {
        this.idDistribuidor = idDistribuidor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDistribuidor != null ? idDistribuidor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Distribuidor)) {
            return false;
        }
        Distribuidor other = (Distribuidor) object;
        if ((this.idDistribuidor == null && other.idDistribuidor != null) || (this.idDistribuidor != null && !this.idDistribuidor.equals(other.idDistribuidor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Distribuidor[ idDistribuidor=" + idDistribuidor + " ]";
    }
    
}
