package br.com.fazendoutopia.domain;

import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class CategoriaProduto extends GenericDomain {

	private String descricao;
	private boolean status;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "CategoriaProduto [descricao=" + descricao + ", status=" + status + "]";
	}
}
