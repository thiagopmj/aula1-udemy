package exercicio2;

import java.util.Scanner;

public class AreaDoCirculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		double pi = 3.14159;
//		double raio;
//		double area;
//		
//		System.out.println("Digite o valor do Raio:");
//		raio = sc.nextDouble();
//		area = pi * Math.pow(raio,2);
//		System.out.printf("A área do círculo é: %.4f%n ",area);
//			

		int numero;
		int numero1 = 1;
//		double divisao;
		System.out.println("Digite um número:");
		numero = sc.nextInt();
		
		
		
//		if (numero < 0) {
//			System.out.println(numero + "; negativo");
//			
//		}else {
//			System.out.println(numero + "; positivo");
//		}
//		if (numero%2 !=0) {
//			System.out.println("Ímpar");
//		}else {
//			System.out.println("Par");
//		}
//		
//		
//				
//		System.out.println("Digite outro número:");
//		numero1 = sc.nextInt();
//		
//		if(numero1%numero == 0 || numero%numero1 ==0){
//			
//			System.out.println("São multiplos");
//		}else {
//			System.out.println("Não são multiplos");
//		}
		
		
		for(int i = numero;  i >= 1 ; i--) {
				numero1 = numero1 * i;
				
		}
			System.out.println("Fatorial de " + numero + " = " + numero1);
		sc.close();

	}

}
