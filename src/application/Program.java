package application;

import java.util.HashMap;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		HashMap<Integer, String> produtos = new HashMap<>();
		
		int opcao;
		
		do {
			System.out.println("Digite 1 para incluir, "+ "2 para consultar "+"0 para sair");
			opcao= teclado.nextInt();
			
			switch(opcao) {
			
			//primeiro case inclui o codigo e o produto com a palavra put
			case 1:
				System.out.println("Código do novo produto");
				int codigoN = teclado.nextInt();
				System.out.println("Nome do Novo Produto");
				String nomeN = teclado.next();
				produtos.put(codigoN, nomeN);
				break;
				
				//segundo case quando digitado a opcao 2, ele pede o codigo esse codigo e guardado com a palavra get
				//e faz a comparação do codigo referencia ao priduto pertecente aquele codigo 
			case 2:
				System.out.println("Digite o codigo");
				int codigo = teclado.nextInt();
				String nome = produtos.get(codigo);
				if(nome != null) {
					
					System.out.println(nome);
					break;
					
				}
			
			}
			
		}
		while(opcao!= 0);
	}		
}
