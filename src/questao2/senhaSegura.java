package questao2;

import java.util.Scanner;

public class senhaSegura {

	public static void main(String[] args) {
        String senha;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma senha: ");
        
        senha = teclado.next();
        
        if (senha.length() < 6){
        	int falta = 6 - senha.length();
            System.out.println("A senha deve ter no mínimo 6 caracteres.\nFalta(m) "+falta+" caracter(eres).");
        }
        else{
            System.out.println("Tamanho minimo: ok");
        }
          
       //Pelo que entendi no enunciado, poderia finalizar aqui.
       //No entanto preferi fazer o exercício completo conforme segue.
    
        teclado.close();
        
        
        if(verificarMaiuscula(senha) == false) {
        	System.out.println("Falta pelo menos uma letra maiuscula.");
        }
        
        if(verificarMinuscula(senha) == false) {
        	System.out.println("Falta pelo menos uma letra minuscula.");
        }
        
        if(verificarDigito(senha) == false) {
        	System.out.println("Falta pelo menos um numero.");
        }
        
        if(verificarEspecial(senha) == false) {
        	System.out.println("Falta pelo menos um caracter especial.");
        }
        
        if(verificarTamanho(senha) && verificarMaiuscula(senha) && verificarMinuscula(senha) && verificarDigito(senha) 
        		&& verificarEspecial(senha)) {
        	System.out.println("Senha forte!");
        }
    }
	
	public static boolean verificarTamanho(String senha) {
		if (senha.length() >= 6) {
			return true;
		}
		else {
        	return false;
        }
	}
        
    public static boolean verificarMaiuscula(String senha) { 
    	
    	char c;
        boolean maiuscula = false;
    	
        for(int i = 0; i< senha.length(); i++){                
            c = senha.charAt(i);
            if(Character.isUpperCase(c)){
                maiuscula = true;
            }
        }
		return maiuscula;
    }
    
    public static boolean verificarMinuscula(String senha) { 
    	
    	char c;
    	boolean minuscula = false;
        
        for(int i = 0; i< senha.length(); i++){                
            c = senha.charAt(i);
            if(Character.isLowerCase(c)){
                minuscula = true;
            }
        }
		return minuscula;
    }
    
    public static boolean verificarDigito(String senha) { 
    	
    	boolean digito = false;
    	char c;
        
        for(int i = 0; i< senha.length(); i++){                
            c = senha.charAt(i);
            if(Character.isDigit(c)){
                digito = true;
            }
        }
        
        return digito;
    }
 
 	public static boolean verificarEspecial(String senha) { 
 	
 		boolean especial = false;
 		char c;
     
 		for(int i = 0; i< senha.length(); i++){                
 			c =  senha.charAt(i);
 			if(!Character.isLetterOrDigit(c)) {
 				especial = true;
 			}
 		}
 		
 		return especial;
 	}
    	
}
