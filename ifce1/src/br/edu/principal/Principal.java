/** aprendendo a programar
 * 
 */
package br.edu.principal;

import java.util.Scanner;

import br.edu.uteis.Calculadora;

public class Principal {
	
	
	public static void main (String [] args) {
		Scanner jj = new Scanner(System.in);
		System.out.println("Digite X: ");
		int x = jj.nextInt();
		System.out.println("Digite Y: ");
		int y = jj.nextInt();
		Calculadora c = new Calculadora();
		c.soma(x, y);
		c.subtra��o(x, y);
		c.divis�o(x, y);
		c.multiplica��o(x, y);
		c.potencia(x, y);
	
	}
}
