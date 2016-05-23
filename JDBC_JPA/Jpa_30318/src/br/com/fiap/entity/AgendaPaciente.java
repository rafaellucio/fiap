package br.com.fiap.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="agenda_paciente", catalog="dbagendamento_30318")
public class AgendaPaciente implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="AGENDA_ID", length=11)
	private int agendaId;
	
	@Column(name="PACIENTE_CPF", length=11)
	private String pacienteCpf;

	public int getAgendaId() {
		return agendaId;
	}

	public void setAgendaId(int agendaId) {
		this.agendaId = agendaId;
	}

	public String getPacienteCpf() {
		return pacienteCpf;
	}

	public void setPacienteCpf(String pacienteCpf) {
		this.pacienteCpf = pacienteCpf;
	}
	
}
