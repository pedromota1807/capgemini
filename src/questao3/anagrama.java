package questao3;

import java.util.Scanner;

public class anagrama {

	private static long fatorialDoNumero(int num) {
		int anterior = num-1;
		long fatorialDesteNumero = 0;
		
		if (num <= 1) return 1;
			else fatorialDesteNumero =  num * fatorialDoNumero(anterior); // Aqui est� a recursividade no programa. O m�todo "fatorialDoNumero" � chamado v�rias vezes dentro dele mesmo.
		
		return fatorialDesteNumero;
	}
	
	public static void main(String[] args) {
		
		String str;
        int tamanho, i, j, cont = 0, v[];
		Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        
        str = teclado.next();
        v[] = str.length();
        for(i = 0; i < str.length(); i++) {
        	for(j = 0; j < str.length(); j++) {
        		if(i == j) {
        			j++;
        		}
        		if(str.charAt(i) == str.charAt(j)) {
        			cont++;
        		}
        	}
        	v[str.length()]
        	
        }
        
        
        
        tamanho = str.length();
        
        
       
        

	}

}
