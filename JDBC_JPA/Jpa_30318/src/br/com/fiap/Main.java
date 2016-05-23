package br.com.fiap;

import java.util.Date;

import br.com.fiap.dao.GenericDao;
import br.com.fiap.entity.Agenda;

public class Main {
	public static void main(String[] args) {
		
		GenericDao<Agenda> agendaDao = new GenericDao<>(Agenda.class);
		
		Agenda agenda = new Agenda();
		agenda.setData(new Date());
		agenda.setHora(new Date());
		agenda.setDescricao("Teste agenda");
		
		try {
			
			agendaDao.adicionar(agenda);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
