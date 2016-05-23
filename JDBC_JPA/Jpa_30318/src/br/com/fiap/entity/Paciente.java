package br.com.fiap.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="paciente", catalog="dbagendamento_30318")
public class Paciente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CPF", unique=true, length=11)
	private String cpf;
	
	@Column(name="NOME", length=45)
	private String nome;
	
	@Column(name="DATANASC")
	private Date dataNasc;
	
	@Column(name="TELEFONE", length=20)
	private String telefone;
	
	@ManyToMany(fetch=FetchType.LAZY, mappedBy="agendaPecientes")
	private Set<Agenda> agendas = new HashSet<>();
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="paciente")
	private Set<Procedimento> procedimentos = new HashSet<>();
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="paciente")
	private Set<Matmed> matmeds = new HashSet<>();
}
