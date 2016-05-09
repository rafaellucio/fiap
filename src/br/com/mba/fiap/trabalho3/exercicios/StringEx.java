package br.com.fiap.exercicios;

public class StringEx {

	public static void main(String[] args) {
		String string = "";
		int z=0;
		for (int i = 0; i < 12; i++) {
			z++;
			string += "string";
		}
		
		System.out.println(string);
		//a: Quantos objetos do tipo String serão criados? 
		//r: 13 Objetos String
		
		//b: Qual seria a forma mais eficiente de manipular os dados em memória?
		//r: No caso de Strings utilizando o StirngBuilder
		
		StringBuilder strings = new StringBuilder();
		
		for (int i = 0; i < 12; i++) {
			z++;
			strings.append("string");
		}
		
		System.out.println(strings.toString());
	}
}
