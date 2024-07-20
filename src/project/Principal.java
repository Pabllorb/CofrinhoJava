package project;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Cofrinho cofrinho = new Cofrinho();
		
		int menu = 0;
		
		//Utiliza do-while para a criação do menu e interação do usuário.
		do {
			System.out.println("\n------------------MENU PRINCIPAL------------------");
			System.out.println("\n1. Adicionar moedas de diferentes valores e tipos");
			System.out.println("2. Remover moedas específicas");
			System.out.println("3. Listar todas as moedas");
			System.out.println("4. Calcular valor guardado convertido para Real");
			System.out.println("5. Sair");
			System.out.println("Escolha uma das opções acima: \n");
			
			//Tratamento de exceção na entrada do menu principal.
			try {
				menu = entrada.nextInt();
			} catch (Exception e) {
				System.out.println("\nEscolha inválida! Por favor, digite apenas números.\n");
				entrada.next();
				continue;
			}
			
			switch(menu) {
				case 1:
					System.out.println("\n------------------MENU ADICIONAR------------------");
					System.out.println("\n1. Adicionar Real");
					System.out.println("2. Adicionar Dolar");
					System.out.println("3. Adicionar Euro");
					System.out.println("4. Voltar");
					System.out.println("Escolha um dos tipos de moeda: \n");
					
					int escolhaMoeda;
					
					//Tratamento de exceção na entrada do menu adicionar moedas.
					try {
						escolhaMoeda = entrada.nextInt();
					} catch(Exception e) {
						System.out.println("\nEscolha inválida! Por favor, digite apenas números.\n");
						entrada.next();
						continue;
					}
					
					try {						
						
						if (escolhaMoeda == 1) {
							System.out.println("\nDigite o Valor: ");
							double valorReal = entrada.nextDouble();
							cofrinho.adcionar(new Real(valorReal));
							}
						else if (escolhaMoeda == 2) {
							System.out.println("\nDigite o Valor: ");
							double valorDolar = entrada.nextDouble();
							cofrinho.adcionar(new Dolar(valorDolar));
							}
						else if (escolhaMoeda == 3) {
							System.out.println("\nDigite o Valor: ");
							double valorEuro = entrada.nextDouble();
							cofrinho.adcionar(new Euro(valorEuro));
							}
						else if (escolhaMoeda == 4) {
								continue;
							}
						else {
							System.out.println("\nEscolha inválida! Digite apenas os números disponíveis no menu.");
							}
					} catch(Exception e) {
							System.out.println("\nPor favor, digite apenas números válidos. (Ex. 1,00)");
							entrada.next();
							
					}
				break;
					
				case 2:
					System.out.println("\n------------------MENU REMOVER------------------");
					System.out.println("\n1. Remover Real");
					System.out.println("2. Remover Dolar");
					System.out.println("3. Remover Euro");
					System.out.println("4. Voltar");
					System.out.println("Escolha um dos tipos de moeda: \n");
					
					int escolhaMoeda2;
					
					//Tratamento de exceção na entrada do menu remover moedas.
					try {
					escolhaMoeda2 = entrada.nextInt();
					} catch(Exception e) {
						System.out.println("Escolha inválida! Por favor, digite apenas números.\n");
						entrada.next();
						continue;
					}
					
					try {					
					
						if (escolhaMoeda2 == 1) {
							System.out.println("\nDigite o Valor a ser removido: ");
							double removeReal = entrada.nextDouble();
							cofrinho.remover(new Real(removeReal));	
							}
						else if (escolhaMoeda2 == 2) {
							System.out.println("\nDigite o Valor a ser removido: ");
							double removeDolar = entrada.nextDouble();
							cofrinho.remover(new Dolar(removeDolar));
							}
						else if (escolhaMoeda2 == 3) {
							System.out.println("\nDigite o Valor a ser removido: ");
							double removeEuro = entrada.nextDouble();
							cofrinho.remover(new Euro(removeEuro));
							}
						else if (escolhaMoeda2 == 4) {
							continue;
						}
						else {
							System.out.println("\nEscolha inválida! Digite apenas os números disponíveis no menu.");
							}
					} catch(Exception e) {
							System.out.println("\nPor favor, digite apenas números válidos. (Ex. 1,00)");
							entrada.next();
						}
				break;
				case 3:
					System.out.println("\n------------------LISTA DE MOEDAS------------------");
					cofrinho.listar(null);
				break;
				case 4:
					System.out.println("\n---------------CALCULO DO TOTAL CONVERTIDO---------------");
					double total = cofrinho.totalConvertido();
					System.out.println(String.format("\nVocê possui R$%.2f em seu cofrinho.", total));
				break;				
				
				case 5:
					System.out.println("Encerrando programa...");
				break;
				
				default:
					System.out.println("Escolha inválida! Digite apenas os números disponíveis no menu.");
			}		
			
		} while(menu != 5);
			
			entrada.close();
			
	}
	
}