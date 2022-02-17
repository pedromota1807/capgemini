package questao1;

import java.util.Scanner;

public class escadaDeAsteriscos {


	public static void main(String[] args) {
		int i, j, degraus;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite o número de degraus: ");
		degraus = teclado.nextInt();
		
		for (i = 1; i <= degraus; i++){ //controla os degraus
		   for (j = i; j < degraus; j++){
		      System.out.print(" ");  // controla o tamanho dos degraus
		   }
		   for (j = 0; j < i; j++){
		      System.out.print("*");  // imprime o degrau
		  }
		  System.out.println(""); // pula linha 
		}
		
		teclado.close();

	}

}
