package br.com.fiap.threads.simulador;

public class Aviao extends Thread {
	
	private String nomeDoVoo;
	private Aeroporto aeroporto;
	
	public Aviao(String nomeDoVoo, Aeroporto aeroporto) {
		this.nomeDoVoo = nomeDoVoo;
		this.aeroporto = aeroporto;
	}
	
	public void decolar() {
		if(this.aeroporto.aguardarPistaDisponivel()) {
			System.out.println(this.nomeDoVoo + ": Decolando");
		} else {
			System.out.println(this.nomeDoVoo+": Aguardando para decolagem");
		};
	}
	
	public void aterrissar() {
		if(this.aeroporto.aguardarPistaDisponivel()) {
			System.out.println(this.nomeDoVoo + ": Aterrissando");
		} else {
			System.out.println(this.nomeDoVoo + ": Aguardando para aterrissagem");
		}
	}
	
	public void voar() {
		try {
			sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
