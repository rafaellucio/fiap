package br.com.mba.fiap.exercicios;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Calculadora implements CalculadoraBasica {

	public Object calcular(String expressao) throws ScriptException {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");
		Object result = engine.eval(expressao);
		
		return result;
	}
	
}
