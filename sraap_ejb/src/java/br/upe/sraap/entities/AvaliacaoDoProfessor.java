/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.upe.sraap.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mathe
 */
@Entity
@Table(name = "avaliacao_do_professor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AvaliacaoDoProfessor.findAll", query = "SELECT a FROM AvaliacaoDoProfessor a")
    , @NamedQuery(name = "AvaliacaoDoProfessor.findById", query = "SELECT a FROM AvaliacaoDoProfessor a WHERE a.id = :id")
    , @NamedQuery(name = "AvaliacaoDoProfessor.findByIdTurma", query = "SELECT a FROM AvaliacaoDoProfessor a WHERE a.idTurma = :idTurma")
    , @NamedQuery(name = "AvaliacaoDoProfessor.findByConceito1", query = "SELECT a FROM AvaliacaoDoProfessor a WHERE a.conceito1 = :conceito1")
    , @NamedQuery(name = "AvaliacaoDoProfessor.findByConceito2", query = "SELECT a FROM AvaliacaoDoProfessor a WHERE a.conceito2 = :conceito2")
    , @NamedQuery(name = "AvaliacaoDoProfessor.findByConceito3", query = "SELECT a FROM AvaliacaoDoProfessor a WHERE a.conceito3 = :conceito3")
    , @NamedQuery(name = "AvaliacaoDoProfessor.findByConceito4", query = "SELECT a FROM AvaliacaoDoProfessor a WHERE a.conceito4 = :conceito4")
    , @NamedQuery(name = "AvaliacaoDoProfessor.findByConceito5", query = "SELECT a FROM AvaliacaoDoProfessor a WHERE a.conceito5 = :conceito5")
    , @NamedQuery(name = "AvaliacaoDoProfessor.findByConceito6", query = "SELECT a FROM AvaliacaoDoProfessor a WHERE a.conceito6 = :conceito6")
    , @NamedQuery(name = "AvaliacaoDoProfessor.findByConceito7", query = "SELECT a FROM AvaliacaoDoProfessor a WHERE a.conceito7 = :conceito7")
    , @NamedQuery(name = "AvaliacaoDoProfessor.findByConceito8", query = "SELECT a FROM AvaliacaoDoProfessor a WHERE a.conceito8 = :conceito8")
    , @NamedQuery(name = "AvaliacaoDoProfessor.findByConceito9", query = "SELECT a FROM AvaliacaoDoProfessor a WHERE a.conceito9 = :conceito9")
    , @NamedQuery(name = "AvaliacaoDoProfessor.findByConceito10", query = "SELECT a FROM AvaliacaoDoProfessor a WHERE a.conceito10 = :conceito10")
    , @NamedQuery(name = "AvaliacaoDoProfessor.findByConceito11", query = "SELECT a FROM AvaliacaoDoProfessor a WHERE a.conceito11 = :conceito11")
    , @NamedQuery(name = "AvaliacaoDoProfessor.findByConceito12", query = "SELECT a FROM AvaliacaoDoProfessor a WHERE a.conceito12 = :conceito12")})
public class AvaliacaoDoProfessor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_turma")
    private long idTurma;
    @Basic(optional = false)
    @NotNull
    @Column(name = "conceito1")
    private int conceito1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "conceito2")
    private int conceito2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "conceito3")
    private int conceito3;
    @Basic(optional = false)
    @NotNull
    @Column(name = "conceito4")
    private int conceito4;
    @Basic(optional = false)
    @NotNull
    @Column(name = "conceito5")
    private int conceito5;
    @Basic(optional = false)
    @NotNull
    @Column(name = "conceito6")
    private int conceito6;
    @Basic(optional = false)
    @NotNull
    @Column(name = "conceito7")
    private int conceito7;
    @Basic(optional = false)
    @NotNull
    @Column(name = "conceito8")
    private int conceito8;
    @Basic(optional = false)
    @NotNull
    @Column(name = "conceito9")
    private int conceito9;
    @Basic(optional = false)
    @NotNull
    @Column(name = "conceito10")
    private int conceito10;
    @Basic(optional = false)
    @NotNull
    @Column(name = "conceito11")
    private int conceito11;
    @Basic(optional = false)
    @NotNull
    @Column(name = "conceito12")
    private int conceito12;

    public AvaliacaoDoProfessor() {
    }

    public AvaliacaoDoProfessor(Long id) {
        this.id = id;
    }

    public AvaliacaoDoProfessor(Long id, long idTurma, int conceito1, int conceito2, int conceito3, int conceito4, int conceito5, int conceito6, int conceito7, int conceito8, int conceito9, int conceito10, int conceito11, int conceito12) {
        this.id = id;
        this.idTurma = idTurma;
        this.conceito1 = conceito1;
        this.conceito2 = conceito2;
        this.conceito3 = conceito3;
        this.conceito4 = conceito4;
        this.conceito5 = conceito5;
        this.conceito6 = conceito6;
        this.conceito7 = conceito7;
        this.conceito8 = conceito8;
        this.conceito9 = conceito9;
        this.conceito10 = conceito10;
        this.conceito11 = conceito11;
        this.conceito12 = conceito12;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(long idTurma) {
        this.idTurma = idTurma;
    }

    public int getConceito1() {
        return conceito1;
    }

    public void setConceito1(int conceito1) {
        this.conceito1 = conceito1;
    }

    public int getConceito2() {
        return conceito2;
    }

    public void setConceito2(int conceito2) {
        this.conceito2 = conceito2;
    }

    public int getConceito3() {
        return conceito3;
    }

    public void setConceito3(int conceito3) {
        this.conceito3 = conceito3;
    }

    public int getConceito4() {
        return conceito4;
    }

    public void setConceito4(int conceito4) {
        this.conceito4 = conceito4;
    }

    public int getConceito5() {
        return conceito5;
    }

    public void setConceito5(int conceito5) {
        this.conceito5 = conceito5;
    }

    public int getConceito6() {
        return conceito6;
    }

    public void setConceito6(int conceito6) {
        this.conceito6 = conceito6;
    }

    public int getConceito7() {
        return conceito7;
    }

    public void setConceito7(int conceito7) {
        this.conceito7 = conceito7;
    }

    public int getConceito8() {
        return conceito8;
    }

    public void setConceito8(int conceito8) {
        this.conceito8 = conceito8;
    }

    public int getConceito9() {
        return conceito9;
    }

    public void setConceito9(int conceito9) {
        this.conceito9 = conceito9;
    }

    public int getConceito10() {
        return conceito10;
    }

    public void setConceito10(int conceito10) {
        this.conceito10 = conceito10;
    }

    public int getConceito11() {
        return conceito11;
    }

    public void setConceito11(int conceito11) {
        this.conceito11 = conceito11;
    }

    public int getConceito12() {
        return conceito12;
    }

    public void setConceito12(int conceito12) {
        this.conceito12 = conceito12;
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
        if (!(object instanceof AvaliacaoDoProfessor)) {
            return false;
        }
        AvaliacaoDoProfessor other = (AvaliacaoDoProfessor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.upe.sraap.entities.AvaliacaoDoProfessor[ id=" + id + " ]";
    }
    
}
