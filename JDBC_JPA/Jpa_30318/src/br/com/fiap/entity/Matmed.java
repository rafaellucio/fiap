package br.com.fiap.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="matmed")
public class Matmed implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID", length=11)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="DESCRICAO", length=45)
	private String descricao;
	
	@Column(name="PRECO")
	private double preco;
	
	@Column(name="FABRICANTE", length=45)
	private String fabricante;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CPFPAC")
	private Paciente paciente;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
}
