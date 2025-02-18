package View;

import javax.swing.JOptionPane;
import Controller.At1;

public class Principal {

	public static void main(String[] args) {
		At1 a = new At1();
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor"));
		
		int r = a.multi_sem_mult(x, y);
		System.out.println(r);
		

	}

}
