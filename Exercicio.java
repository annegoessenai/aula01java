package aulaJPA.aula01;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		// VARIAVEIS
		String nome;
		int idade;
		
		// INSTACIAR CLASSE SCANNER
		Scanner ler = new Scanner (System.in);
		
		// ENTRADA DE DADOS 
		System.out.println("NOME: ");
		nome = ler.next();
		
		System.out.println("IDADE: ");
		idade = ler.nextInt();
		
		// SAIDA
		System.out.println (" O SEU NOME É:  " + nome+ " E SUA IDADE É: " + idade );
	}

}
