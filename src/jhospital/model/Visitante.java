/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jhospital.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rebecca
 */
@Entity
@Table(name = "visitante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Visitante.findAll", query = "SELECT v FROM Visitante v")
    , @NamedQuery(name = "Visitante.findById", query = "SELECT v FROM Visitante v WHERE v.id = :id")
    , @NamedQuery(name = "Visitante.findByNome", query = "SELECT v FROM Visitante v WHERE v.nome = :nome")
    , @NamedQuery(name = "Visitante.findByEmail", query = "SELECT v FROM Visitante v WHERE v.email = :email")
    , @NamedQuery(name = "Visitante.findByTelefone", query = "SELECT v FROM Visitante v WHERE v.telefone = :telefone")
    , @NamedQuery(name = "Visitante.findByEndereco", query = "SELECT v FROM Visitante v WHERE v.endereco = :endereco")
    , @NamedQuery(name = "Visitante.findByPaciente", query = "SELECT v FROM Visitante v WHERE v.paciente = :paciente")})
@SequenceGenerator (name = "SEQ_STORE", sequenceName = "Visitante_seq", allocationSize=20)
public class Visitante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue (strategy= GenerationType.AUTO, generator="SEQ_STORE")
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "telefone")
    private String telefone;
    @Basic(optional = false)
    @Column(name = "endereco")
    private String endereco;
    @Basic(optional = false)
    @Column(name = "paciente")
    private String paciente;

    public Visitante() {
    }

    public Visitante(Integer id) {
        this.id = id;
    }

    public Visitante(Integer id, String nome, String email, String telefone, String endereco, String paciente) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.paciente = paciente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
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
        if (!(object instanceof Visitante)) {
            return false;
        }
        Visitante other = (Visitante) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jhospital.model.Visitante[ id=" + id + " ]";
    }
    
}
