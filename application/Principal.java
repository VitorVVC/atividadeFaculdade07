package application;

import java.util.Locale;
import entities.Apartamento;
import entities.Casa;

public class Principal {
	// Questão:
//Um imóvel é uma propriedade e pode fazer menção a um bem imobiliário, sendo uma alternativa para investidores que desejam adquiri-lo e vendê-lo após alguns meses ou anos. Você é responsável por administrar um sistema de gerenciamento de imóveis. Seguindo regras de encapsulamento, implemente a classe Imovel sabendo que qualquer imóvel tem uma área (em metros quadrados), uma quantidade de quartos e um preço de compra. Sua classe deve ter construtor, gets e sets.
//Casas e apartamentos são exemplos de imóveis. Implemente as classes Casa e Apartamento. A classe Casa, além dos atributos relacionados a um imóvel, tem um indicador se há quintal ou não, enquanto a classe Apartamento tem um indicador se há piscina na  área externa ou não. Implemente construtor, gets e sets.
//Casas que possuem quantidade de quartos superior a 4 ou que têm quintal são vendidas com 30% a mais sobre o valor de compra; do contrário, são vendidas com 15% a mais. Na classe Casa, faça um método que calcule e retorne o preço de venda de uma casa. Apartamentos que possuem área maior que 300 metros quadrados e que têm piscina são vendidos por 50% a mais sobre o valor de compra; do contrário, são vendidos com 10% a mais. Na classe Apartamento, faça um método que calcule e retorne o preço de venda de um apartamento.
//Seu sistema de gerenciamento de imóveis deve permitir expansão para futuras classes (de imóveis) que venham a ser implementadas, como casas de praia, casas de campo, escritórios, dentre outras. Assegura que todas elas terão um método que calcula e retorna o preço de venda de um imóvel.
//Na classe principal, instancie um objeto do tipo Casa e outro do tipo Apartamento. Mostre o valor de venda de cada um.
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
