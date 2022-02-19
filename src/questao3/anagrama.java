package questao3;

import java.util.ArrayList;
import java.util.Scanner;


public class anagrama {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
        
		System.out.println("Digite uma string qualquer: ");
		
        String str = teclado.nextLine();
        ArrayList<String> lista = new ArrayList<>();
        int tamStr = str.length();
        int cont = 0;
        
        for (int i = 0; i < tamStr; i++) {                         //la�o para capturar as substrings e adicionar na lista.
        	for (int letra = 1; letra <= tamStr-i; letra++) {
        		String subStr = str.substring(i, i+letra);
        		lista.add(subStr);
            }
        }
        for (int i = 0; i < lista.size(); i++) {                   //la�o para verificar se as substrings capturadas s�o anagramas.
        	String elemento = lista.get(i);
        	for (int j = i+1; j < lista.size(); j++) {
        		if(eAnagrama(lista.get(j), elemento)){
        			cont++;										   //no nosso caso � o contador que interessa, pois ele que ir� contar quantos
        		}                                                  //anagramas tem a string digitada.
        	}
        }
         
        System.out.println("A string digitada contem "+cont+" par(es) de anagrama(s).");
        teclado.close();
        
	}

    public static boolean eAnagrama(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        int[] mapa = new int[26];
        for(int i=0; i < str1.length(); i++){
            char ch = str1.charAt(i);
            mapa[ch - 'a']++;
            ch = str2.charAt(i);
            mapa[ch - 'a']--;
        }

        for(int i=0; i<mapa.length; i++){
            if(mapa[i] != 0){
                return false;
            }
        }
        return true;
	}

}
