package aulaJPA.aula01;

import java.util.Scanner;

public class Somador {

	public static void main(String[] args) {
		// VARIAVEIS
		double a,b,som;
		// INSTACIAR CLASSE SCANNER
		Scanner ler = new Scanner (System.in);
		
		//ENTRADA DE DADOS
		System.out.println("Informe valor 1: ");
		a = ler.nextDouble();
		
		System.out.println("Informe valor 2: ");
		b = ler.nextDouble();		

		// PRCESSAMENTO
		som = a+b;
		
		//SAIDA
		System.out.println ("O resultado é : " + som);
	}

}
