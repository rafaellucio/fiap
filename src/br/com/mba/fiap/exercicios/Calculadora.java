package br.com.mba.fiap.exercicios;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JOptionPane;

public class Calculadora implements CalculadoraBasica {

	private float resultado;
	
	public Object calcular(String expressao) throws ScriptException {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");
		Object result = engine.eval(expressao);
		
		return result;
	}

	public float calc() {
		String operador = JOptionPane.showInputDialog("Qual operação deseja fazer?");
		float valor1, valor2;
		
		switch(operador){
			case "+":
				valor1 = Float.parseFloat(JOptionPane.showInputDialog("Qual primeiro valor?"));
				valor2 = Float.parseFloat(JOptionPane.showInputDialog("Qual Segundo valor?"));
				this.resultado = somar(valor1, valor2);
				break;
			case "-": 
				valor1 = Float.parseFloat(JOptionPane.showInputDialog("Qual primeiro valor?"));
				valor2 = Float.parseFloat(JOptionPane.showInputDialog("Qual Segundo valor?"));
				this.resultado = subtrair(valor1, valor2);
				break;
			case "/": 
				valor1 = Float.parseFloat(JOptionPane.showInputDialog("Qual primeiro valor?"));
				valor2 = Float.parseFloat(JOptionPane.showInputDialog("Qual Segundo valor?"));
				this.resultado = dividir(valor1, valor2);
				break;
			case "*": 
				valor1 = Float.parseFloat(JOptionPane.showInputDialog("Qual primeiro valor?"));
				valor2 = Float.parseFloat(JOptionPane.showInputDialog("Qual Segundo valor?"));
				this.resultado = multiplicar(valor1, valor2);
		}
		
		return this.resultado;
	}
	
	@Override
	public float somar(float op1, float op2) {
		return op1 + op2;
		
	}

	@Override
	public float subtrair(float op1, float op2) {
		return op1 - op2;
	}

	@Override
	public float dividir(float op1, float op2) {
		return op1 / op2;
	}

	@Override
	public float multiplicar(float op1, float op2) {
		return op1 * op2;
	}
	
}
