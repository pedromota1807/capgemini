package Testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class questa3Teste {

	@Test
	void testeAnagrama() {
		
		//palavra ifailuhkqq
		
		boolean valorEsperado = questao3.anagrama.eAnagrama("ifa", "fai");
		
		Assertions.assertTrue(valorEsperado); 
	}

}
