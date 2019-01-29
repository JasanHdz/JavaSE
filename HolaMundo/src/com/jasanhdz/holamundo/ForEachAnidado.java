package com.jasanhdz.holamundo;

public class ForEachAnidado {
	
	public static void main(String[] args) {
		
		// Definimos un array de 2 dimensiones; de 3 filas x 5 columnas
		char[][] array = { {'A','B','C','D','F'}, {'G','H','I','J','K'}, {'L','M','N','Ñ','O'} };
		
		// Recorremos el array multidimensional
		for(char[] arrayinterno : array) {
			for(char numero: arrayinterno) {
				System.out.println(numero);
			}
		}
		System.out.println("\n *** Array de 3 dimensiones ***");
		// Definimos un array de 3 dimensiones:
		int[][][] numeros = { 
					{ 
						{1,2,3}, {4,5,6} 
					}, 
					{ 
						{7,8,9}, {10,11,12} 
					} 
				};
		// Tenemos un array de 3 dimensiones de [1][2][3]
		
		// Recorremos el array de 3 Dimensiones
		for(int[][] numeros2d : numeros) {
			for(int[] arrayinterno : numeros2d) {
				for(int numero : arrayinterno) {
					System.out.println(numero);
				}
			}
		}
	}
}
