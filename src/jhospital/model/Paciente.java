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
@Table(name = "paciente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paciente.findAll", query = "SELECT p FROM Paciente p")
    , @NamedQuery(name = "Paciente.findById", query = "SELECT p FROM Paciente p WHERE p.id = :id")
    , @NamedQuery(name = "Paciente.findByNome", query = "SELECT p FROM Paciente p WHERE p.nome = :nome")
    , @NamedQuery(name = "Paciente.findByEmail", query = "SELECT p FROM Paciente p WHERE p.email = :email")
    , @NamedQuery(name = "Paciente.findByTelefone", query = "SELECT p FROM Paciente p WHERE p.telefone = :telefone")
    , @NamedQuery(name = "Paciente.findByEndereco", query = "SELECT p FROM Paciente p WHERE p.endereco = :endereco")
    , @NamedQuery(name = "Paciente.findByDoenca", query = "SELECT p FROM Paciente p WHERE p.doenca = :doenca")
    , @NamedQuery(name = "Paciente.findByTemplanodesaude", query = "SELECT p FROM Paciente p WHERE p.templanodesaude = :templanodesaude")
    , @NamedQuery(name = "Paciente.findByDiasdeinternacao", query = "SELECT p FROM Paciente p WHERE p.diasdeinternacao = :diasdeinternacao")
    , @NamedQuery(name = "Paciente.findByNumerodoquarto", query = "SELECT p FROM Paciente p WHERE p.numerodoquarto = :numerodoquarto")})

@SequenceGenerator (name = "SEQ_STORE", sequenceName = "paciente_seq", allocationSize=20)

public class Paciente implements Serializable {

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
    @Column(name = "doenca")
    private String doenca;
    @Basic(optional = false)
    @Column(name = "templanodesaude")
    private boolean templanodesaude;
    @Column(name = "diasdeinternacao")
    private Integer diasdeinternacao;
    @Column(name = "numerodoquarto")
    private Integer numerodoquarto;

    public Paciente() {
    }

    public Paciente(Integer id) {
        this.id = id;
    }

    public Paciente(Integer id, String nome, String email, String telefone, String endereco, String doenca, boolean templanodesaude) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.doenca = doenca;
        this.templanodesaude = templanodesaude;
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

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    public boolean getTemplanodesaude() {
        return templanodesaude;
    }

    public void setTemplanodesaude(boolean templanodesaude) {
        this.templanodesaude = templanodesaude;
    }

    public Integer getDiasdeinternacao() {
        return diasdeinternacao;
    }

    public void setDiasdeinternacao(Integer diasdeinternacao) {
        this.diasdeinternacao = diasdeinternacao;
    }

    public Integer getNumerodoquarto() {
        return numerodoquarto;
    }

    public void setNumerodoquarto(Integer numerodoquarto) {
        this.numerodoquarto = numerodoquarto;
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
        if (!(object instanceof Paciente)) {
            return false;
        }
        Paciente other = (Paciente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jhospital.model.Paciente[ id=" + id + " ]";
    }
    
}
