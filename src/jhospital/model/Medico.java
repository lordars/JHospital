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
@Table(name = "medico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Medico.findAll", query = "SELECT m FROM Medico m")
    , @NamedQuery(name = "Medico.findById", query = "SELECT m FROM Medico m WHERE m.id = :id")
    , @NamedQuery(name = "Medico.findByNome", query = "SELECT m FROM Medico m WHERE m.nome = :nome")
    , @NamedQuery(name = "Medico.findByEmail", query = "SELECT m FROM Medico m WHERE m.email = :email")
    , @NamedQuery(name = "Medico.findByTelefone", query = "SELECT m FROM Medico m WHERE m.telefone = :telefone")
    , @NamedQuery(name = "Medico.findByEndereco", query = "SELECT m FROM Medico m WHERE m.endereco = :endereco")
    , @NamedQuery(name = "Medico.findByEspecialidade", query = "SELECT m FROM Medico m WHERE m.especialidade = :especialidade")
    , @NamedQuery(name = "Medico.findByHorasmensais", query = "SELECT m FROM Medico m WHERE m.horasmensais = :horasmensais")
    , @NamedQuery(name = "Medico.findByValordashoras", query = "SELECT m FROM Medico m WHERE m.valordashoras = :valordashoras")})
@SequenceGenerator (name = "SEQ_STORE", sequenceName = "Medico_seq", allocationSize=20)
public class Medico implements Serializable {

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
    @Column(name = "especialidade")
    private String especialidade;
    @Column(name = "horasmensais")
    private Integer horasmensais;
    @Column(name = "valordashoras")
    private Integer valordashoras;

    public Medico() {
    }

    public Medico(Integer id) {
        this.id = id;
    }

    public Medico(Integer id, String nome, String email, String telefone, String endereco, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.especialidade = especialidade;
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

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
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
        if (!(object instanceof Medico)) {
            return false;
        }
        Medico other = (Medico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jhospital.model.Medico[ id=" + id + " ]";
    }
    
}
