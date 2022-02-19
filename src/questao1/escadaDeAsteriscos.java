package questao1;

import java.util.Scanner;

public class escadaDeAsteriscos {


	public static void main(String[] args) {
		int degraus;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite o número de degraus: ");
		degraus = teclado.nextInt();
		
		String escada = construtorDeEscada(degraus);
		
		System.out.println(escada);
		teclado.close();

	}
	
	public static String construtorDeEscada (int degraus){
		int i, j;
	    StringBuilder s = new StringBuilder();
	    for (i = 1; i <= degraus; i++) {       //controla os degraus
	      for (j = i; j < degraus; j++) {      //controla o tamanho dos degraus
	        s.append(" ");
	      }
	      for (j = 0; j < i; j++) {            //imprime o degrau
	        s.append("*");
	      }
	      s.append("\n");                      //pula linha
	    }
	    return s.toString();
	}

}
