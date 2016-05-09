package br.com.fiap.exercicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
	
	public static void main(String[] args) {
		System.out.println(DateTime.getDataHoraAtual("dd/MM/yyyy hh:mm"));
		System.out.println(DateTime.getDataHoraAtual("yyyy-MM-dd hh:mm"));
		System.out.println(DateTime.getDataHoraAtual("dd-MM-yy hh:mm:ss"));
		System.out.println(DateTime.getDataHoraAtual("E"));
		System.out.println(DateTime.getDataHoraAtual("G"));
	}
	
	public static String getDataHoraAtual(String format) {
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(format);
		return date.format(dateTimeFormatter);
	}
}
