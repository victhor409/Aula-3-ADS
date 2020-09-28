package application;

import java.util.HashMap;

public class Program {

	public static void main(String[] args) {
		
		HashMap<Integer, String> produtos = new HashMap<>();
		
		//inserindo os valores das variaveis usando a palavra put
		produtos.put(1011, "teclado");
		produtos.put(2033,"mouse");
		
		//get retorna o valor da chave atribuida
		System.out.println(produtos.get(1011));
		
		//percorre os valores do mapeamento 
		for (String x : produtos.values()) {
			System.out.println(x);
			
			
		}
		
		//remove os objetos
		produtos.remove(1011);
		
		
	}

}
