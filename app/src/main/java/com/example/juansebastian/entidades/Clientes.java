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

public class Clientes implements Serializable {
    private static final long serialVersionUID = 1L;

    private String ubicacion;

    private String direccion;

    private String nombreNegocio;

    private String nombreRepresentante;

    private String telefonoCelular;

    private String identificacionNit;

    private Integer idCliente;

    public Clientes() {
    }

    public Clientes(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Clientes(Integer idCliente, String direccion, String nombreNegocio, String nombreRepresentante, String telefonoCelular, String identificacionNit) {
        this.idCliente = idCliente;
        this.direccion = direccion;
        this.nombreNegocio = nombreNegocio;
        this.nombreRepresentante = nombreRepresentante;
        this.telefonoCelular = telefonoCelular;
        this.identificacionNit = identificacionNit;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreNegocio() {
        return nombreNegocio;
    }

    public void setNombreNegocio(String nombreNegocio) {
        this.nombreNegocio = nombreNegocio;
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

    public String getIdentificacionNit() {
        return identificacionNit;
    }

    public void setIdentificacionNit(String identificacionNit) {
        this.identificacionNit = identificacionNit;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Clientes[ idCliente=" + idCliente + " ]";
    }
    
}
