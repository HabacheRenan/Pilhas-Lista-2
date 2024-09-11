package tarefa3;
import br.edu.fateczl.pilha.PilhaInt;
public class Controller {
	
	public static int fatController(int valor) {
		
		PilhaInt p = new PilhaInt();
		
		for( int i = 1; i <= valor; i ++ ) {
			p.push(i);
		}
		
		int fat = 1;
		for(int i = 0; i < valor; i++) {
			try {
				fat = fat * p.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return fat;
	}
	
}
