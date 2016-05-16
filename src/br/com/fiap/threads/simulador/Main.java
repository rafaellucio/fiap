package br.com.fiap.threads.simulador;

public class Main {

	public static void main(String[] args) {
		
		Aeroporto aeroporto = new Aeroporto("XKTS0");
		
		Aviao aviao1 = new Aviao("TAN 123", aeroporto);
		Aviao aviao2 = new Aviao("OLÉ 111", aeroporto);
		Aviao aviao3 = new Aviao("LINHA 222", aeroporto);

		aeroporto.start();
		aviao1.decolar();
		aviao1.start();
		aviao2.decolar();
		aviao2.start();
		aviao3.decolar();
		aviao3.start();
		
	}

}
