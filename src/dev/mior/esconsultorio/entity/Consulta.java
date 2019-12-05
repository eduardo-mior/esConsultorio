package dev.mior.esconsultorio.entity;

import dev.mior.esconsultorio.defaults.Defaults;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Mior
 */
@Entity
public class Consulta implements Serializable, Comparable<Consulta> {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaInicial;
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaFinal;
    
    @Column(length = 1000)
    private String observacoes;
    
    @ManyToOne(optional = false)
    private Cliente cliente;
    
    @OneToMany(fetch = FetchType.EAGER)
    private List<Servico> servicos;
    
    @OneToMany
    private List<ParcelaPagamento> pagamentos;

    public Consulta() {}

    public Consulta(Long id, Date horaInicial, Date horaFinal, String observacoes, Cliente cliente, List<Servico> servicos, List<ParcelaPagamento> pagamentos) {
        this.id = id;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.observacoes = observacoes;
        this.cliente = cliente;
        this.servicos = servicos;
        this.pagamentos = pagamentos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(Date horaInicial) {
        this.horaInicial = horaInicial;
    }

    public Date getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Date horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    public List<ParcelaPagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<ParcelaPagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }
    
    public Double getValorServicos() {
        Double valor = 0D;
        for (Servico servico : servicos) {
            valor += servico.getValor();
        }
        return valor;
    }
    
    public Double getValorProdutos() {
        Double valor = 0D;
        for (Servico servico : servicos) {
            valor += servico.getValorProdutos();
        }
        return valor;
    }
    
    public Double getValorTotal() {
        return getValorProdutos() + getValorServicos();
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Consulta)) {
            return false;
        }
        Consulta other = (Consulta) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return cliente + ": " + Defaults.DH_FORMAT.format(getHoraInicial()) + " as " + Defaults.DH_FORMAT.format(getHoraInicial());
    }

    @Override
    public int compareTo(Consulta o) {
        return this.getHoraInicial().getTime() < o.getHoraInicial().getTime() ? -1 : 1;
    }

}