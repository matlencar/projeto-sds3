package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SellerDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String nome;
	
	public SellerDTO() {
	}

	public SellerDTO(long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public SellerDTO(Seller entity) {
		id = entity.getId();
		nome = entity.getName();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
