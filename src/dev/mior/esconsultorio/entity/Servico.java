package dev.mior.esconsultorio.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Mior
 */
@Entity
public class Servico implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String descricao;
    
    @Column(nullable = false)
    private Double valor;
    
    @ManyToOne
    private TipoServico tipoServico;
    
    @OneToMany(fetch = FetchType.EAGER)
    private List<Produto> produtos;
    
    public Servico() {}

    public Servico(Long id, String descricao, Double valor, TipoServico tipoServico, List<Produto> produtos) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.tipoServico = tipoServico;
        this.produtos = produtos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public TipoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    public Double getValorProdutos() {
        Double value = 0D;
        for (Produto produto : produtos) {
            value += produto.getValor();
        }
        return value;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Servico)) {
            return false;
        }
        Servico other = (Servico) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return descricao;
    }

}