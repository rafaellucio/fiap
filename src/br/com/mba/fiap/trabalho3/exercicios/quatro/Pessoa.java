package br.com.mba.fiap.trabalho3.exercicios.quatro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Pessoa {
	private String nome;
	private int idade;
	private char sexo;
	private String empresa;
	
	public Pessoa(String nome, int idade, char sexo, String empresa) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.empresa = empresa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public static ArrayList<Pessoa> sortByNameAndRemoveItem(ArrayList<Pessoa> arrayPessoas, int index) {

		Collections.sort(arrayPessoas, new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.getNome().compareTo(o2.getNome());
			}
		});
		
		arrayPessoas.remove(index);
		return arrayPessoas;
	}
	
	public static ArrayList<Pessoa> sortByName(ArrayList<Pessoa> arrayPessoas) {

		Collections.sort(arrayPessoas, new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.getNome().compareTo(o2.getNome());
			}
		});
		
		return arrayPessoas;
	}
	
	public static ArrayList<Pessoa> sortByNameAndReversed(ArrayList<Pessoa> arrayPessoas) {

		Collections.sort(arrayPessoas, new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.getNome().compareTo(o2.getNome());
			}
		}.reversed());
		
		return arrayPessoas;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", empresa=" + empresa + "]";
	}
}
