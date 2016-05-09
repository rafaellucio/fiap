package br.com.fiap.exercicios.quatro;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Pessoa> arrayPessoas = new ArrayList<>();
		
		arrayPessoas.add(new Pessoa("João Garcia", 20, 'M', "AIK Enterprises"));
		arrayPessoas.add(new Pessoa("Maria Martins", 44, 'F', "Simples"));
		arrayPessoas.add(new Pessoa("Henrique Fernando", 43, 'M', "AIK Enterprises"));
		arrayPessoas.add(new Pessoa("Inácio Luís", 33, 'M', "Magazine André"));
		arrayPessoas.add(new Pessoa("Fernando Ferreira", 87, 'M', "Casas Recife"));
		
		for (Pessoa pessoa : Pessoa.sortByNameAndRemoveItem(arrayPessoas, 0)) {
			System.out.println(pessoa);
		}

		System.out.println("===========================================================================");
		System.out.println("===========================================================================");
		
		for (Pessoa pessoa : Pessoa.sortByName(arrayPessoas)) {
			System.out.println(pessoa);
		}
		
		System.out.println("===========================================================================");
		System.out.println("===========================================================================");
		
		for (Pessoa pessoa : Pessoa.sortByNameAndReversed(arrayPessoas)) {
			System.out.println(pessoa);
		}
	}

}
