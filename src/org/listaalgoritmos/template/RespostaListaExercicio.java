package org.listaalgoritmos.template;

public class RespostaListaExercicio {

	/*
	 * Utilize apenas o método main para testar a implementação dos métodos. Não se
	 * faz necessário implementar dentro do escopo do método.
	 */
	public static void main(String[] args) {

//		IMC
		float peso = 73f;
		float alturaImc = 1.82f;
		float imc = calcularImc(peso, alturaImc);
		System.out.println("Imc: " + imc);

//		Area do trapezio
		float baseMaior = 24f;
		float baseMenor = 9f;
		float h = 15f;
		float areaTrapezio = ((baseMaior + baseMenor) * h) / 2;
		System.out.println("Area do Trapezio: " + areaTrapezio);

//	Maior entre dois inteiros	
		int a = 12;
		int b = 2;
		int maiorValor = maiorEntreDoisInteiros(a, b);
		System.out.println("Maior valor: " + maiorValor);

//		Impar - Par
		int numero = 3;
		boolean imparPar = verificarParImpar(numero);
		System.out.println(imparPar);

//		Media Notas
		float notas[] = { 7f, 7.5f, 8, 6f, 7.5f, 9, 5f };
		float media = calcularMediaNotas(notas);
		System.out.println("Média das notas: " + media);

// 		Array inverso
		int array[] = { 1, 2, 3, 4, 5 };
		int resultado = imprimirArrayInverso(array);

//		Array de inteiros
//		int array1[] = {1, 2, 3, 4, 5}; 
//		int resultadoArrayInteiros = imprimirElementosPrimos(array1);

//		Array de Primos
		int[] arrayPrimos = { 2, 3, 5, 7, 11, 13, 17, 19, 23 };
		imprimirElementosPrimos(arrayPrimos);

//		Array de Impares
		int arrayImpares[] = { 1, 3, 4, 6, 7 };
		int resultadoArrayImpares = imprimirElementosImpares(arrayImpares);

//		Array de pares
		int arrayPares[] = { 2, 3, 4, 6, 7 };
		int resultadoArrayPares = imprimirElementosPares(arrayPares);

//		Maior Menos
		int[] exemploArray = { 4, 2, 7, 1, 9, 5 };
		imprimirMaiorMenorElemento(exemploArray);

//		Media Aritimetica
		int[] arrayAritimetica = { 1, 2, 3, 4, 5 };
		float resultadoMedia = calcularMediaAritmetica(arrayAritimetica);
		System.out.println("Média: " + resultadoMedia);

	}

	/**
	 * Método deve calcular o IMC utilizando peso e altura. Como resultado o método
	 * deve retornar uma variável resultado do tipo float.
	 * 
	 * @param peso
	 * @param altura
	 * @return resultado
	 */
	public static float calcularImc(float peso, float alturaImc) {
		float imc = peso / (alturaImc * alturaImc);
		return imc;
	}

	/**
	 * Método deve calcular a área do trapézio independente da unidade de medida.
	 * Como resultado, o método deve retornar a área calculada.
	 * 
	 * @param baseMaior
	 * @param baseMenor
	 * @param altura
	 * @return areaTrapezio
	 */
	public static float calcularAreaTrapezio(float baseMaior, float baseMenor, float h) {
		float areaTrapezio = ((baseMaior + baseMenor) * h) / 2;
		return areaTrapezio;
	}

	/**
	 * O método deve calcular o maior entre dois inteiros, que são fornecidos como
	 * argumento do método. O retorno deve ser o maior valor dado como entrada,
	 * sendo do tipo inteiro.
	 * 
	 * @param a
	 * @param b
	 * @return maiorValor
	 */
	public static int maiorEntreDoisInteiros(int a, int b) {

		if (a > b) {
			return a;
		} else {
			return b;
		}

	}

	/**
	 * Método verifica se o número apresentado como argumento é ímpar ou par. caso
	 * seja par, o retorno do método deve ser verdadeiro. Caso contrário, o valor
	 * retornado deve ser falso.
	 * 
	 * @param numero
	 * @return condicao
	 */
	public static boolean verificarParImpar(int numero) {

		if (numero % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Método calcula a média aritmetica dos elementos float a partir de um array. O
	 * retorno deve ser o resultado do cálculo da média.
	 * 
	 * @param notas
	 * @return media
	 */
	public static float calcularMediaNotas(float[] notas) {

		float soma = 0;

		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}

		return soma / notas.length;
	}

	/**
	 * Método imprime array de inteiros no sentido inverso, separando os elementos
	 * por vírgula. O último elemento impresso não deve preceder vírgula. Use o
	 * System.out.print() para imprimir os valores. Os elementos devem ser impresso
	 * numa única linha.
	 * 
	 * @param array
	 * @return
	 */
	public static int imprimirArrayInverso(int[] array) {

		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
		return 0;
	}

	/**
	 * Método deve imprimir os elementos primos de um array de inteiros. O formato
	 * da impressão deve ser feito numa única linha, utilizando espaço em branco ("
	 * ") entre os elementos e após o último elemento. Utilize System.out.print()
	 * 
	 * @param array
	 * @return
	 */
	public static void imprimirElementosPrimos(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (ehPrimo1(array[i])) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println(); 
	}

	public static boolean ehPrimo1(int numero) {
		if (numero <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static boolean ehPrimo(int i) {
		return false;
	}

	/**
	 * Método deve imprimir os elementos ímpares de um array de inteiros. O formato
	 * da impressão deve ser feito numa única linha, utilizando espaço em branco ("
	 * ") entre os elementos e após o último elemento. Utilize System.out.print()
	 * 
	 * @param array
	 * @return
	 */
	public static int imprimirElementosImpares(int[] arrayImpares) {

		for (int i = 0; i < arrayImpares.length; i++) {

			if (arrayImpares[i] % 2 != 0) {
				System.out.print(arrayImpares[i] + ",");
			}
		}
		System.out.println("");
		return 0;
	}

	/**
	 * Método deve imprimir os elementos pares de um array de inteiros. O formato da
	 * impressão deve ser feito numa única linha, utilizando espaço em branco (" ")
	 * entre os elementos e após o último elemento. Utilize System.out.print()
	 * 
	 * @param array
	 * @return
	 */
	public static int imprimirElementosPares(int[] arrayPares) {

		for (int i = 0; i < arrayPares.length; i++) {

			if (arrayPares[i] % 2 == 0) {
				System.out.print(arrayPares[i] + ",");
			}
		}
		System.out.println("");
		return 0;
	}

	/**
	 * Método deve imprimir o maior e o menor elemento de um array de inteiros. O
	 * formato da impressão deve ser feito numa única linha, utilizando espaço em
	 * branco (" ") entre os elementos e após o último elemento. Utilize
	 * System.out.print()
	 * 
	 * @param array
	 */
	public static void imprimirMaiorMenorElemento(int[] array) {

		if (array == null || array.length == 0) {
			System.out.println("Array vazio");
			return;
		}

		int maior = array[0];
		int menor = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > maior) {
				maior = array[i];
			} else if (array[i] < menor) {
				menor = array[i];
			}
		}

		System.out.print(menor + " " + maior);

	}

	/**
	 * O método calcula a média aritmética dos elementos de um array de inteiros.
	 * Como resultado, o valor da média deve ser retornado no método.
	 * 
	 * @param array
	 * @return media
	 */
	public static float calcularMediaAritmetica(int[] arrayAritimetica) {

		if (arrayAritimetica.length == 0) {
            return 0f;
        }

        int soma = 0;

        for (int elemento : arrayAritimetica) {
            soma += elemento;
        }

        return (float) soma / arrayAritimetica.length;
		
	}

}
