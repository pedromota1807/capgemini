package questao3;

import java.util.Scanner;

public class anagrama {

	private static long fatorialDoNumero(int num) {
		int anterior = num-1;
		long fatorialDesteNumero = 0;
		
		if (num <= 1) return 1;
			else fatorialDesteNumero =  num * fatorialDoNumero(anterior); // Aqui está a recursividade no programa. O método "fatorialDoNumero" é chamado várias vezes dentro dele mesmo.
		
		return fatorialDesteNumero;
	}
	
	public static void main(String[] args) {
		
		String str;
        int tamanho, i, j, cont = 1;
		Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        
        str = teclado.next();
        int v[] = new int[str.length()];
       
        for(i = 0; i < str.length(); i++) {
        	for(j = i + 1; j < str.length(); j++) {
        		if(i > 1) {
        			for(int k = j + 1; k < str.length(); k++) {
        				if(str.charAt(i) == str.charAt(k)) {
        					cont--;
        				}
        			}
        		}
        		if(str.charAt(i) == str.charAt(j)) {
        			cont++;
        		}
        		v[i] = cont;
        	}
        	cont = 1;
        }
        for(i=0; i<v.length; i++) {
        	System.out.print(v[i]+" ");
        }
        
	}

}
