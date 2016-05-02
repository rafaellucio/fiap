package br.com.mba.fiap.exercicios;

public class ReverseArray {
	
	/**
	 * Função para inverter array
	 * @param arr
	 * @return
	 */
	public int[] reverse(int [] arr) {
		
		int[] temp = new int[arr.length];
		
		if(arr.length <= 10) {
			for (int i = 0; i < arr.length; i++) {
				temp[i] = arr[arr.length - (i + 1)];
			}	
		}
		
		return temp;
	}
	
}
