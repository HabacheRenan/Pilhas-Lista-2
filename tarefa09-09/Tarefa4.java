package tarefa4;
import br.edu.fateczl.pilha.PilhaInt;
public class Tarefa4 {

	public static void main(String[] args) {
		
		int[] valores = {5,26,1,17,20,22,25,11,39,5,15,38,26,14};
		
		PilhaInt p1 = new PilhaInt();
		PilhaInt p2 = new PilhaInt();
		PilhaInt aux = new PilhaInt();
		
		for(int i : valores) {
			p1.push(i);
		}
		
		int tamanho = p1.size();
		
		for(int i = 0; i < tamanho; i++) {
			
			try {
				aux.push(p1.pop());
			} catch (Exception e) {
			}
		}
		
		
		
		for(int i = 0; i < tamanho; i++) {
			
			try {
				if(aux.top() % 2 == 0) {
					p1.push(aux.pop());
				}else {
					p2.push(aux.pop());
				}
			} catch (Exception e) {
			}
			
		}
		int tamanhop1 = p1.size(); 
		int tamanhop2 = p2.size();
		for(int i = 0; i < tamanhop1; i++) {
			try {
				System.out.println(p1.pop());
			} catch (Exception e) {
			}
		}
		for(int i = 0; i < tamanhop2; i++) {
			try {
				System.out.println(p2.pop());
			} catch (Exception e) {
			}
		}
			
	}

}
