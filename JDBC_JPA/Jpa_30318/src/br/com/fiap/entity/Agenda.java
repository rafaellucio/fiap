package br.com.fiap.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="agenda", catalog="dbagendamento_30318")
public class Agenda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name="ID")
	private Integer id;
	
	@Temporal(value=TemporalType.TIMESTAMP)
	@Column(name="DATA")
	private Date data;
	
	@Temporal(value=TemporalType.TIMESTAMP)
	@Column(name="HORA")
	private Date hora;
	
	@Column(name="DESCRICAO", length=45)
	private String descricao;
	
	@ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinTable(name="agenda_paciente", 
		catalog="dbagendamento_30318", 
		joinColumns={
				@JoinColumn(name="AGENDA_ID")
		},
		inverseJoinColumns={
			@JoinColumn(name="PACIENTE_CPF")
		}
	)
	private Set<Paciente> pacientes = new HashSet<>();

	public Integer getId() {
		return id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Set<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(Set<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
}
