package br.com.fiap.threads.simulador;

public class Aeroporto extends Thread {

	private String nomeDoAeroporto;
	private boolean pistaDisponivel;
	
	public Aeroporto(String nomeDoAeroporto) {
		this.nomeDoAeroporto = nomeDoAeroporto;
	}
	
	public boolean aguardarPistaDisponivel() {		
		if(!this.pistaDisponivel) {
			this.aguardarPistaDisponivel();
			System.out.println(this.nomeDoAeroporto + ": Pista indisponível");
			return false;
		} else {
			System.out.println(this.nomeDoAeroporto + ": Pista disponível");
			return true;
		}
	}
	
	public boolean alterarEstado() {
		this.pistaDisponivel = !this.pistaDisponivel;		
		return this.pistaDisponivel;
	}
	
	@Override
	public void run() {
		try {
			this.alterarEstado();
			sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
