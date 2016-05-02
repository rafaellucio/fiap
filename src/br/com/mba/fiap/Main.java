package br.com.mba.fiap;

import javax.script.ScriptException;

import br.com.mba.fiap.exercicios.Calculadora;
import br.com.mba.fiap.exercicios.Fatorial;
import br.com.mba.fiap.exercicios.MediaSalarialEmpresa;
import br.com.mba.fiap.exercicios.ReverseArray;

public class Main {

	public static void main(String[] args) throws ScriptException {
		// TODO Auto-generated method stub
		
		int [] array = {1, 2, 3};
		ReverseArray reverseArray = new ReverseArray();
		MediaSalarialEmpresa mediaSalarialEmpresa = new MediaSalarialEmpresa();
		Calculadora calculadora = new Calculadora();
		Fatorial fatorial = new Fatorial();
		
		System.out.println("Array inverso: ");
		for (int i : reverseArray.reverse(array)) {
			System.out.println(i);
		}
		
		mediaSalarialEmpresa.setQuantidadeFuncionarios();
		mediaSalarialEmpresa.questinarSalario();
		System.out.println("Média salarial da empresa: " + mediaSalarialEmpresa.getMediaSalatial());
		System.out.println("Calculadora: " + calculadora.calcular("2+2+4-5"));
		System.out.println("Fatorial: "+ fatorial.getValorFatorial(3));
		System.out.println(calculadora.calc());
	}

}
