package Testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class questao1Teste {

	@Test
	void testeEscada() {
		
		String textoEsperado = "     *\n    **\n   ***\n  ****\n *****\n******\n";
		
		Assertions.assertEquals(textoEsperado, questao1.escadaDeAsteriscos.construtorDeEscada(6));
	}

}
