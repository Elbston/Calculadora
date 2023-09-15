/** aprendendo a programar
 * 
 */
package br.edu.uteis;


public class Calculadora {
	public void soma(int a, int b) {
		System.out.println("O resultado da soma: " + (a+b));
	}
	public void subtração(int a, int b) {
		System.out.println("O resultado da subtração: " + (a-b));
	}
	public void multiplicação(int a, int b) {
		System.out.println("O resultado da multiplicação: " + (a*b));
	}
	public void divisão(int a, int b) {
		System.out.println("O resultado da divisão: " + (a/b));
	}
	public void potencia(int a, int b) {
		System.out.println("O resultado da potencia: " + (Math.pow(a, b)));
	}
}
