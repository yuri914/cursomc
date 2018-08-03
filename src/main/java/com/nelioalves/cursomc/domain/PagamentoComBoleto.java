package com.nelioalves.cursomc.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

import com.nelioalves.cursomc.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento implements Serializable {

    private static final long serialVersionUID = -7174870145413056055L;

    private Date dataVencimento;
    private Date dataPagamento;
    
    public PagamentoComBoleto() {
	super();
    }
    
    public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
	super(id, estado, pedido);
	this.dataPagamento = dataPagamento;
	this.dataVencimento = dataVencimento;
    }

    public Date getDataVencimento() {
	return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
	this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
	return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
	this.dataPagamento = dataPagamento;
    }
    
}
