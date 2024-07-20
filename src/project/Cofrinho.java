package project;

import java.util.ArrayList;
import java.util.Iterator;

public class Cofrinho {
	
	//Cria ArrayList 
	ArrayList<Moeda> colecaoMoedas = new ArrayList<Moeda>(); 
	
	public Cofrinho() {
		colecaoMoedas = new ArrayList<>();
	}
	
	//Cria método para adicionar moedas na colecaoMoedas.
	public void adcionar(Moeda moeda) {
		colecaoMoedas.add(moeda);
		moeda.info();
		System.out.println("Valor adicionado com sucesso!\n");
	}
	
	//Cria método que remove moedas da colecaoMoedas.
	public void remover(Moeda moeda) {
		Iterator<Moeda> iterator = colecaoMoedas.iterator();
		boolean moedaRemovida = false;
		
		while (iterator.hasNext()) {
			Moeda moedaAtual = iterator.next();
			if (moedaAtual.equals(moeda)) {
				iterator.remove();
				System.out.println("Moeda removida com sucesso!\n");
				moedaRemovida = true;
				break;
			}
			
		}
		
		if (!moedaRemovida) {
			System.out.println("\nEssa moeda não existe no seu cofrinho.\n");
		}
		
	}
	//Cria método que lista todas as moedas presentes na colecaoMoedas.
	public void listar(Moeda moeda) {
		System.out.println("Suas Moedas: ");
		for (Moeda moeda1 : colecaoMoedas) {
			moeda1.info();
		}
	}
	
	//Retorna o total convertido para real utilizando o método converte da classe abstrata Moeda.
	public double totalConvertido() {
		double total = 0;
		for (Moeda moeda : colecaoMoedas) {
			total += moeda.converte();
		}
		return total;
	}
}