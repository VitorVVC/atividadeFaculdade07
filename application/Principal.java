package application;

import java.util.Locale;
import entities.Apartamento;
import entities.Casa;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		
		// Na ordem de : AREA, QUANTIDADE DE QUARTOS, PRECO DE COMPRA, SE TEM OU NÃO QUINTAL.
		Casa casa = new Casa(200,5,100000,true);
		Casa casaDois = new Casa(500,3,80000,false);
		// Acima instacio dois objetos casa com dados diferentes para melhor comparacao
		
		// Na ordem: AREA, QUANTIDADE DE QUARTOS, PRECOS DE COMPRA, SE TEM OU NÃO PISCINA.
		Apartamento apartamento = new Apartamento(350,3,150000,true);
		Apartamento apartamentoDois = new Apartamento(200,2,120000,false);
		// Acima instacio dois objetos apartamentos com dados diferentes para melhor comparacao
		
		
		System.out.println("Dados dos objetos casas:");
		// Prints de casa e o método calcula preco 
		System.out.printf("Print do preco de venda da casa: { %.2f }%n",casa.calculaPreco());
		System.out.printf("Print do preco de venda da casaDois: { %.2f }%n",casaDois.calculaPreco());
		
		System.out.println("===============================");
		
		System.out.println("Dados dos objetos apartamentos:");
		// Prints de apartamento e o método calcula preco
		System.out.printf("Print do preco de venda do apartamento: { %.2f }%n",apartamento.calculaPreco());
		System.out.printf("Print do preco de venda do apartamentoDois: { %.2f }%n",apartamentoDois.calculaPreco());


	}

}
