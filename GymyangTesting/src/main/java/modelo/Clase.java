/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Entidad que mapea la tabla Clase de la base de datos
 * @author adria
 */
@Entity
@Table(name = "Clase")
@NamedQueries({
    @NamedQuery(name = "Clase.findAll", query = "SELECT c FROM Clase c"),
    @NamedQuery(name = "Clase.findById", query = "SELECT c FROM Clase c WHERE c.id = :id"),
    @NamedQuery(name = "Clase.findByNombre", query = "SELECT c FROM Clase c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Clase.findByHoraInicio", query = "SELECT c FROM Clase c WHERE c.horaInicio = :horaInicio"),
    @NamedQuery(name = "Clase.findByHoraFin", query = "SELECT c FROM Clase c WHERE c.horaFin = :horaFin"),
    @NamedQuery(name = "Clase.findByPlazas", query = "SELECT c FROM Clase c WHERE c.plazas = :plazas"),
    @NamedQuery(name = "Clase.findNombres", query = "SELECT c.nombre FROM Clase c")})
public class Clase implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "hora_inicio")
    private String horaInicio;
    @Column(name = "hora_fin")
    private String horaFin;
    @Column(name = "plazas")
    private Integer plazas;
    @Column(name = "descripcion")
    private String descripcion;
    @ManyToMany(mappedBy = "listaClases")
    private List<Usuario> listaUsuarios;
    @ManyToMany(mappedBy = "listaClases")
    private List<Material> listaMaterial;
    @ManyToOne
    @JoinColumn(name = "monitor_fk")
    private Monitor clase_monitor_fk;

    public Clase() {
    }

    public Clase(String nombre, String horaInicio, String horaFin, Integer plazas, String descripcion) {
        this.nombre = nombre;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.plazas = plazas;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    

    public Clase(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public Integer getPlazas() {
        return plazas;
    }

    public void setPlazas(Integer plazas) {
        this.plazas = plazas;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public List<Material> getListaMaterial() {
        return listaMaterial;
    }

    public void setListaMaterial(List<Material> listaMaterial) {
        this.listaMaterial = listaMaterial;
    }

    public Monitor getClase_monitor_fk() {
        return clase_monitor_fk;
    }

    public void setClase_monitor_fk(Monitor clase_monitor_fk) {
        this.clase_monitor_fk = clase_monitor_fk;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clase)) {
            return false;
        }
        Clase other = (Clase) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Clase{" + "id=" + id + ", nombre=" + nombre + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", plazas=" + plazas + '}';
    }

    

    
    
}
