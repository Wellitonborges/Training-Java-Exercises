package exercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out
				.println("Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,\r\n"
						+ "calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado");

		System.out.println("");
		Scanner imput = new Scanner(System.in);

		String nome;
		double salarioMinimo;
		double salarioAtual;

		cadastro("", 1, 1);

		String simNao;
		System.out.println("Sim /Não?");
		simNao = imput.next();

		switch(simNao.toLowerCase()){
		case "sim":
			System.out.println("");
			break;
		case "não":
		case "nao":
			System.out.println("Digite novamente os dados.");
			cadastro("",1,1);
			break;
		default:
			System.out.println("Você não sabe o que quer. Tchau.");
			System.exit(0);
		break;
			
		}
	}

	public static void cadastro(String nome, double salarioMinimo, double salarioAtual) {
		Scanner imput = new Scanner(System.in);
		System.out.println("Ola qual seu nome? ");
		nome = imput.nextLine();

		System.out.println(nome + " Qual o valor de um salarioi minimo?");
		salarioMinimo = imput.nextDouble();

		System.out.println("Qual o valor so seu salario atual?");
		salarioAtual = imput.nextDouble();

		System.out.println(
				"Então " + nome + " você ganha " + salarioAtual + "R$. e o salario minimo é " + salarioMinimo + "R$");

	}
	
	public static void calculo(int salario) {
		
	}
}
