package exercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out
				.println("Crie um algoritmo que leia o valor do sal�rio m�nimo e o valor do sal�rio de um usu�rio,\r\n"
						+ "calcule a quantidade de sal�rios m�nimos esse usu�rio ganha e imprima o resultado");

		System.out.println("");
		Scanner imput = new Scanner(System.in);

		String nome;
		double salarioMinimo;
		double salarioAtual;

		cadastro("", 1, 1);

		String simNao;
		System.out.println("Sim /N�o?");
		simNao = imput.next();

		switch(simNao.toLowerCase()){
		case "sim":
			System.out.println("");
			break;
		case "n�o":
		case "nao":
			System.out.println("Digite novamente os dados.");
			cadastro("",1,1);
			break;
		default:
			System.out.println("Voc� n�o sabe o que quer. Tchau.");
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
				"Ent�o " + nome + " voc� ganha " + salarioAtual + "R$. e o salario minimo � " + salarioMinimo + "R$");

	}
	
	public static void calculo(int salario) {
		
	}
}
