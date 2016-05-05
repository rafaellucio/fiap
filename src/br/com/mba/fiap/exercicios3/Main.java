package br.com.mba.fiap.exercicios3;

public class Main {
	public static void main(String[] args) {
		ChowChow chowChow = new ChowChow();
		Boolean valor1 = chowChow instanceof Cachorro;
		System.out.println("Verdadeiro ou Falso: "+valor1); //Verdadeiro ou Falso: true
		
		Cachorro cachorro = new Cachorro();
		Boolean valor2 = cachorro instanceof ChowChow;
		System.out.println("Verdadeiro ou Falso: "+valor2); //Verdadeiro ou Falso: false

	}
}