package view;

import br.edu.fateczl.pilha.PilhaInt;

public class Tarefa5 {

	public static void main(String[] args) {
		
		int[] valores = {1,17,20,22,25,11,39,5,15,38,26,14};
		
		PilhaInt pilha = new PilhaInt();
		int maior = 0;
		int compara = 0;
		int tamanho = 1;
		for(int i: valores) {
			pilha.push(i);
		}
		
		while(tamanho != 0) {
			try {
				compara = pilha.pop();
				tamanho = pilha.size();
			} catch (Exception e) {
			}
			
			if(compara > maior) {
				maior = compara;
			}	
			try {
				compara = pilha.pop();
				tamanho = pilha.size();
			} catch (Exception e) {
			}
			
			if(compara > maior) {
				maior = compara;
			}	
			pilha.push(compara);
			
		}
		
		System.out.println(maior);
	}

}
