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

//    //NAME QUERY PROPIO
//    @NamedQuery(name = "Usuario.findUsuxCedula", query = "SELECT u FROM Usuario u WHERE u.cedulaNit = :16072842")})
    
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombre;

    private String apellidos;

    private String cedulaNit;

    private Integer idUsuario;

    private String login;

    private String pasword;

    public Usuario() {
    }

    public Usuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(Integer idUsuario, String nombre, String apellidos, String cedulaNit, String login, String pasword) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedulaNit = cedulaNit;
        this.login = login;
        this.pasword = pasword;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedulaNit() {
        return cedulaNit;
    }

    public void setCedulaNit(String cedulaNit) {
        this.cedulaNit = cedulaNit;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Usuario[ idUsuario=" + idUsuario + " ]";
    }
    
}
