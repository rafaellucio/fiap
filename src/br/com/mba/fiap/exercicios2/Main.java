package br.com.mba.fiap.exercicios2;

public class Main {
	public static void main(String[] args) {
		EquipamentoEletronico tablet = new Tablet();
		EquipamentoEletronico smartphone = new Smartphone();
		Equipamento equipamento = new Equipamento();
		Object objeto = new Object();
		Movel movel = new Movel();
		Tablet tablet2 = new Tablet();
		Smartphone smartphone2 = new Smartphone();
		
		//a. objeto para equipamento (objeto=equipamento;); IMPLÍCITA
		//b. objeto para móvel (objeto=movel;); IMPLÍCITA
		//c. equipamento para tablet2 (equipamento=tablet2;); 
		//d. equipamento para smartphone2 (equipamento=smartphone2;); 
		//e. smartphone para tablet (smartphone=tablet;); 
		//f. smartphone2 para tablet2 (smartphone2=tablet2;); 
		//g. equipamento para tablete (equipamento=(Equipamento) tablet;); 
		//h. movel para tablete (movel=(Movel) tablet;); 
		//i. tablet para equipamento (tablet=(EquipamentoEletronico) equipamento;);  
	}
}
