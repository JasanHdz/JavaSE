package com.jasanhdz.holamundo;

// Upper Camel Case
public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola chicos! :)");
		
		// Tipos de datos enteros
		byte  edad = 127; // 1 byte
		short year = -32768; // 2 bytes
		int id_user = 1001; // 4 bytes
		long id_twitter = 12339929292233L; // 8 bytes
		
		// Números de punto Flotante
		float diametro = 34.25F; // 4 bytes
		double precio = 12345.2345399494949494; // 8 bytes
		
		// Datos de Tipo Texto
		char genero = 'F';
		
		// Datos Lógicos
		boolean isVisible = true; // 2 bytes
		boolean funciona = false;
		
		// Nombres en Java 
		// Sensible a mayúsculas y minúsculas
		// Comenzar con letra, $ 0 "_"
		
		// Letras posteriores pueden ser letras, números $ y "_"
		
		// Una variable jamás puede empezar con un número.
		
		// Las constantes se escriben en mayúsculas y contienen "_"
		int VALOR = 0;
		int VALOR_MAXIMO = 1;
		
		// Por convección se debe usar la técnica camello
		// Upper Camel Case: La primera letra siempre debe empezar con mayúsculas, si se compone de 2 o más palabras las consecutivas deben volver 
		// a empezar con mayúscula
		
		// ejemplo:
		
		// {NombredeArchivos NombreDeClases}
		
		// Si queremos trabajar con variables o con objetos, lo haremos con: Lower Camel Case
		int variableNueva = 5; 
		
		// Lower Camel Case: {nombreDeMetodos, declaracionDeVariables}
		
		// ******** Casteo de Variables ********
		
		byte b = 6;
		short s = b;
		
		b = (byte) s;
		
		int i = 1;
		double d = 2.5;

		i = (int) d;
		
		int codigo = 97;
		char codigoASCII = (char) codigo;
		
		
//		System.out.println(codigoASCII);
		
		// Arrays
		// Declaración de array
		
		 int[] arregloInt = new int[5];
		 double arregloDouble[];
		 
		// Iniciación de array
//		 int[] arregloInt = new int[2];
//		 double arregloDouble[] = new double[45];

		 // Array de 2 dimensiones
		 int[][] array2D = new int[2][3]; // caben 6 elementos

		 // array de 3 dimensiones
		 int[][][] array3D = new int[3][3][2]; // caben 18 elementos

		 // array de 4 dimensiones
		 int[][][][] array4D = new int[1][2][3][4];
		 
		 char[][] days = {{'M', 'T', 'W'},{'M', 'T', 'W'}};
		 
		 char[] names = new char[4];
		 names[0] = 'h';
		 names[1] = 'o';
		 names[2] = 'l';
		 names[3] = 'a';
		 
		 System.out.println(names[0]);
		 System.out.println(names[1]);
		 System.out.println(names[2]);
		 System.out.println(names[3]);
		 
		 char[][][][] monkey = new char[2][3][2][2];
		 monkey[1][0][0][1] = 'm';
		 System.out.println(monkey[1][0][0][1]);
		 
		 // Operadores Aritméticos
		 int a = 1;
		 int aa = a+a;
		 System.out.println("El valor de aa es: " + aa);
		 
		 double x = 2.56;
		 int y = 9;
		 
		 float w = (float) x + y;
		 System.out.println("El valor de w es: " + w);
		 System.out.println(w*2);
		 
		 double k = 4/0.00002;
		 System.out.println(k);
		 
		 System.out.println(7%2);
		 
		 int f = 2;
		 int g = 3;
//		 f = f + g;
		 f+=g ;
		 
		 System.out.println(f);
		 System.out.println("***************");
		 
		 int l = 3;
		 l++;
		 System.out.println(l);
		 
		// Operadores de equidad
		 System.out.println("Operadores de equidad");
		 int q = 5;
		 int p = 4;
		 System.out.println(q == p);
		 System.out.println(q != p);
		 
		// Operadores relacionales
		 System.out.println("Operadores relacionales");
		 System.out.println("q > p -> " + (q > p));
		 System.out.println("q < p -> " + (q < p));
		 
		 System.out.println("q >= p -> " + (q >= p));
		 System.out.println("q <= p -> " + (q <= p));
		 
		 // Operadores lógicos 
		 boolean n = false;
		 boolean m = true;
		 
		 System.out.println("n && m ->" + (n && m));
		 System.out.println("n || m ->" + (n || m));
		 System.out.println("!n -> " + (!n));
		 System.out.println("!m -> " + (!m));
		 System.out.println();
		 
		 System.out.println("Llenando arreglo usando FOR");
		 
		 int[] numeros = new int[5];
		 for(i = 0; i < 5; i++) {
			 numeros[i] = i;
			 System.out.println("numeros["+i+"] = " + numeros[i]);
		 }
		 
		 for(int j: numeros) {
			 System.out.println(j);
		 }
		 
	}

}
