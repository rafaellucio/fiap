package br.com.mba.fiap.exercicios;

import javax.swing.JOptionPane;

public class MediaSalarialEmpresa {
	
	private double[] vetorSalarios;
	private int quantidadeFuncionarios;
	private double media;

	public int getQuantidadeFuncionarios() {
		return quantidadeFuncionarios;
	}

	public void setQuantidadeFuncionarios() {
		this.quantidadeFuncionarios = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de funcionários:"));
		this.vetorSalarios = new double[this.quantidadeFuncionarios];
	}
	
	public void questinarSalario() {
		for (int i = 0; i < vetorSalarios.length; i++) {
			vetorSalarios[i] = Double.parseDouble(JOptionPane.showInputDialog("Valor do salário do funcionario " + (i + 1)));
		}
	}
	
	public double getMediaSalatial() {
		double soma = 0;
		
		for (double d : vetorSalarios) {
			soma += d;
		}
		
		this.media = (soma / this.quantidadeFuncionarios);

		return this.media;
	}
}
