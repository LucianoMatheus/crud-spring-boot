package com.mballem.curso.boot.domain;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@SuppressWarnings("serial")
@Entity
@Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long>{
	
	@NotBlank
	@Size(min = 3, max = 60)
	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;
	
	@OneToMany(mappedBy = "departamento")
	private List<Cargo> cargos;
	
	public List<Cargo> getCargos() {
		return cargos;
	}

	public void setCargos(List<Cargo> cargos) {
		this.cargos = cargos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
