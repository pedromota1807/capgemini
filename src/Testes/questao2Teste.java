package Testes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


class questao2Teste{
	
	@Test
	void testeSenha(){
		String senha = "senha";
		
		boolean testeTamanho = questao2.senhaSegura.verificarTamanho(senha);
		Assertions.assertFalse(testeTamanho);
		
		boolean testeMaiuscula = questao2.senhaSegura.verificarMaiuscula(senha);
		Assertions.assertFalse(testeMaiuscula); ;
		
		boolean testeMinuscula = questao2.senhaSegura.verificarMinuscula(senha);
		Assertions.assertTrue(testeMinuscula);
		
		boolean testeDigito = questao2.senhaSegura.verificarDigito(senha);
		Assertions.assertFalse(testeDigito);
		
		boolean testeEspecial = questao2.senhaSegura.verificarEspecial(senha);
		Assertions.assertFalse(testeEspecial);
		
		
	}
}
