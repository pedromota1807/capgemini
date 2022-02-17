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
        
        boolean maiuscula = false;
        boolean minuscula = false;
        boolean digito = false;
        boolean especial = false;
        
        char c;
        
        for(int i = 0; i< senha.length(); i++){
            c = senha.charAt(i);
            if(Character.isUpperCase(c)){
                maiuscula = true;
            }
            else if(Character.isLowerCase(c)){
                minuscula = true;
            }
            else if(Character.isDigit(c)){
                digito = true;
            }
            else { 
                especial = true;
            }
        }
        
        if( maiuscula == false){
            System.out.println("Falta pelo menos uma letra maiuscula.");
        }
        if( minuscula == false){
            System.out.println("falta pelo menos uma letra minuscula.");
        }
        if( digito == false){
            System.out.println("Falta pelo menos um numero.");
        }
        if( especial == false){
            System.out.println("Falta pelo menos um caracter especial");
        }
        if(maiuscula == true & minuscula == true & digito == true & especial == true) { 
            System.out.println("Senha Forte");
        }
    
        teclado.close();
    }

}
