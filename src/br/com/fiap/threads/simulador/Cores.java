package br.com.fiap.threads.simulador;

public enum Cores {
	BRANCO(21),
	PRETO(22),
	VERMELHO(23),
	AMARELO(24),
	AZUL(25);
	
	private int cores;
	
	private Cores(int cores) {
		this.cores = cores;
	}
	
	public int getCodigoCor() {
		return this.cores;
	}
}
