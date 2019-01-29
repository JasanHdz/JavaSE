package com.jasanhdz.holamundo;

public class ForAnidado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Definimos un array de 2 dimensiones; de 3 filas x 5 columnas
		char[][] array = { {'A','B','C','D','F'}, {'G','H','I','J','K'}, {'L','M','N','Ñ','O'} };
//		int array[][] = { {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15} };
		
		// Recorremos el array multidimensional
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				System.out.println(array[i][j]);
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
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros[0].length; j++) {
				for(int k = 0; k < numeros[0][0].length; k++) {
					System.out.println(numeros[i][j][k]);
				}
			}
		}
	}

}
