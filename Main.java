package src;
import java.util.Scanner;
import java.util.Random;
public class Main {

	private static Random r = new Random();
	
	//exercicio 8
	
	//exercicio 9
	
	//exercicio 10
	
	public static int somadiagonalprincipal(int[][] matriz) {
		if(matriz.length != matriz[0].length) {
			return 0;
		}
		int i = 0;
		int soma = 0;
		while(i < matriz.length) {
			soma += matriz[i][i];
			i++;
		}return soma;
	}
	
	//exercicio 11
	
	public static int[] bubblesort(int vetor[]) {
		int troca = 1;
		while(troca == 1) {
			troca = 0;
			int j = 0;
			while(j < vetor.length - 1) {
				if(vetor[j + 1] < vetor[j]) {
					troca = 1;
					int aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
				j++;
			}
		}
		return vetor;
	}
	
	public static void main(String args[]) {
		System.out.print("\f");
		//exercicio 8
		System.out.println("Exercicio 8");
		Scanner in = new Scanner(System.in);
		int numerodigitado = 0;
		do {
			System.out.println("Escreva um número:");
			numerodigitado = in.nextInt();
		}while(numerodigitado != 10);
		//exercicio 9
		System.out.println("Exercicio 9");
		System.out.println("Escreva um número:");
		int numerodigitado2 = in.nextInt();
		while(numerodigitado2 < 0) {
			numerodigitado2 = in.nextInt();
		}
		if(numerodigitado2 > 0) {
			System.out.println(0);
		}if(numerodigitado2 > 1) {
			System.out.println(1);
		}
		int acumulador = 0;
		int n0 = 0;
		int n1 = 1;
		while(n0 + n1 < numerodigitado2) {
			int result = n0 + n1;
			n0 = n1;
			n1 = result;
			System.out.println(result);
		}
		//exercicio 10
		System.out.println("Exercicio 10");
		int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Soma da diagonal principal = " + somadiagonalprincipal(matriz));
		
		//exercicio 11
		System.out.println("Exercicio 11");
		
		int[] vetor = new int[100];
		System.out.println("Gerando o vetor de 100 números");
		for(int i = 0; i < 100; i++) {
			vetor[i] = r.nextInt();
			System.out.println("Vetor do índice " + i + " = " + vetor[i]);
		}
		
		bubblesort(vetor);
		System.out.println("Gerando o vetor ordenado de 100 números");
		for(int i = 0; i < 100; i++) {
			System.out.println("Vetor do índice " + i + " = " + vetor[i]);
		}
		
	}
	
}
