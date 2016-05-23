package br.com.fiap;

import java.util.Date;

import br.com.fiap.dao.GenericDao;
import br.com.fiap.entity.Agenda;
import br.com.fiap.entity.Matmed;
import br.com.fiap.entity.Paciente;
import br.com.fiap.entity.Procedimento;

public class Main {
	public static void main(String[] args) {
		
		GenericDao<Agenda> agendaDao = new GenericDao<>(Agenda.class);
		
		Agenda agenda = new Agenda();
		agenda.setData(new Date());
		agenda.setHora(new Date());
		agenda.setDescricao("Teste agenda");
		
		Paciente paciente = new Paciente();
		paciente.setCpf("38048534800");
		paciente.setNome("Rafael Antonio Lucio");
		paciente.setDataNasc(new Date());
		paciente.setTelefone("11970560770");
		
		Procedimento procedimento = new Procedimento();
		procedimento.setDescricao("Fenitoina 200mg");
		procedimento.setPaciente(paciente);
		procedimento.setPreco(50.00);
		
		Matmed matmed = new Matmed();
		matmed.setDescricao("Fenitoina");
		matmed.setFabricante("XPTO LTDA");
		matmed.setPaciente(paciente);
		matmed.setPreco(1.99);
		
		try {
			
			paciente.getProcedimentos().add(procedimento);
			paciente.getMatmeds().add(matmed);
			agenda.getPacientes().add(paciente);
			
			agendaDao.adicionar(agenda);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
