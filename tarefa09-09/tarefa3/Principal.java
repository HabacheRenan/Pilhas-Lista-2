package tarefa3;

import tarefa3.Controller;
import br.edu.fateczl.*;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Controller f = new Controller();
		int valor = 11;
		
		while(valor > 10 || valor < 0) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("insira um valor de 0 a 10"));
		}
		System.out.println( f.fatController(valor));
	}	

}
