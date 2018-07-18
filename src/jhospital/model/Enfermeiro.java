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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rebecca
 */
@Entity
@Table(name = "enfermeiro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Enfermeiro.findAll", query = "SELECT e FROM Enfermeiro e")
    , @NamedQuery(name = "Enfermeiro.findById", query = "SELECT e FROM Enfermeiro e WHERE e.id = :id")
    , @NamedQuery(name = "Enfermeiro.findByNome", query = "SELECT e FROM Enfermeiro e WHERE e.nome = :nome")
    , @NamedQuery(name = "Enfermeiro.findByEmail", query = "SELECT e FROM Enfermeiro e WHERE e.email = :email")
    , @NamedQuery(name = "Enfermeiro.findByTelefone", query = "SELECT e FROM Enfermeiro e WHERE e.telefone = :telefone")
    , @NamedQuery(name = "Enfermeiro.findByEndereco", query = "SELECT e FROM Enfermeiro e WHERE e.endereco = :endereco")
    , @NamedQuery(name = "Enfermeiro.findByHorasmensais", query = "SELECT e FROM Enfermeiro e WHERE e.horasmensais = :horasmensais")
    , @NamedQuery(name = "Enfermeiro.findByValordashoras", query = "SELECT e FROM Enfermeiro e WHERE e.valordashoras = :valordashoras")})
public class Enfermeiro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
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
    @Column(name = "horasmensais")
    private Integer horasmensais;
    @Column(name = "valordashoras")
    private Integer valordashoras;

    public Enfermeiro() {
    }

    public Enfermeiro(Integer id) {
        this.id = id;
    }

    public Enfermeiro(Integer id, String nome, String email, String telefone, String endereco) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
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

    public Integer getHorasmensais() {
        return horasmensais;
    }

    public void setHorasmensais(Integer horasmensais) {
        this.horasmensais = horasmensais;
    }

    public Integer getValordashoras() {
        return valordashoras;
    }

    public void setValordashoras(Integer valordashoras) {
        this.valordashoras = valordashoras;
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
        if (!(object instanceof Enfermeiro)) {
            return false;
        }
        Enfermeiro other = (Enfermeiro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jhospital.model.Enfermeiro[ id=" + id + " ]";
    }
    
}
