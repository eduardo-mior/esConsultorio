package dev.mior.esconsultorio.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Mior
 */
@Entity
public class ParcelaPagamento implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(nullable = false)
    private Double valor;
    
    @Column
    private String observacoes;
    
    @Column(nullable = false)
    private String formaPagamento;
    
    @Column
    @Temporal(TemporalType.DATE)
    private Date dataPagamento;
    
    @Column
    @Temporal(TemporalType.DATE)
    private Date dataVencimento;
    
    @Column
    @Temporal(TemporalType.DATE)
    private Date dataEmissao;

    public ParcelaPagamento() {}

    public ParcelaPagamento(Long id, Double valor, String observacoes, String formaPagamento, Date dataPagamento, Date dataVencimento, Date dataEmissao) {
        this.id = id;
        this.valor = valor;
        this.observacoes = observacoes;
        this.formaPagamento = formaPagamento;
        this.dataPagamento = dataPagamento;
        this.dataVencimento = dataVencimento;
        this.dataEmissao = dataEmissao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }
    
    public ParcelaPagamento getParcelaPagamento() {
        return this;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ParcelaPagamento)) {
            return false;
        }
        ParcelaPagamento other = (ParcelaPagamento) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return getValor() + " R$ via " + getFormaPagamento();
    }

}