package exercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu\r\n"
				+ "antecessor e seu sucessor.");
		
		 Scanner entrada = new  Scanner(System.in); 

		 int number;
	
		 
		 
		 System.out.println("Olá por favor digite um numero: ");
		 number = entrada.nextInt();
		 

		
		System.out.println("seu numero foi "+number+" e o numero sucessor  é "+(number+1)+" e o numero antecessor é "+(number-1));
		 
		 
	}

}
