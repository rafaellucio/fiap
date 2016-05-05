package br.com.mba.fiap;

import javax.script.ScriptException;

import br.com.mba.fiap.exercicios.Calculadora;

public class Main {

	public static void main(String[] args) throws ScriptException {

		Calculadora calculadora = new Calculadora();
		
		System.out.println("Calculadora: " + calculadora.calcular("2+2+4-5"));
		System.out.println(calculadora.calc());
	}

}
