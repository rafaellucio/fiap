package br.com.mba.fiap.exercicios;

public class Fatorial {
	
	public int getValorFatorial(int valor) {
		int f = valor;
		
		while(valor > 1) {
			f = f * (valor -1);
			valor--;
		}
		
		return f;
	}
}
