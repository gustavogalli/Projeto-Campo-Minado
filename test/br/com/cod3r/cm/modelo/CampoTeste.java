package br.com.cod3r.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CampoTeste {
	
	private Campo campo;
	
	@BeforeEach // <- a cada novo método será executada essa função antes
	void iniciarCampo() {
		campo = new Campo(3, 3);
	}
	
	@Test
	void testeAdicionarVizinhoDistancia1Esquerda() {
		Campo vizinho = new Campo(3, 2);
		boolean resultado = campo.adicionarVizinho(vizinho); // o retorno deve ser TRUE
		assertTrue(resultado);
	}

	@Test
	void testeAdicionarVizinhoDistancia1Direita() {
		Campo vizinho = new Campo(3, 4);
		boolean resultado = campo.adicionarVizinho(vizinho); // o retorno deve ser TRUE
		assertTrue(resultado);
	}

	@Test
	void testeAdicionarVizinhoDistancia1Cima() {
		Campo vizinho = new Campo(2, 3);
		boolean resultado = campo.adicionarVizinho(vizinho); // o retorno deve ser TRUE
		assertTrue(resultado);
	}

	@Test
	void testeAdicionarVizinhoDistancia1Baixo() {
		Campo vizinho = new Campo(4, 3);
		boolean resultado = campo.adicionarVizinho(vizinho); // o retorno deve ser TRUE
		assertTrue(resultado);
	}
	
	@Test
	void testeAdicionarVizinhoDistancia2Diagonal() {
		Campo vizinho = new Campo(2, 2);
		boolean resultado = campo.adicionarVizinho(vizinho); // o retorno deve ser TRUE
		assertTrue(resultado);
	}
	
	@Test
	void testeNaoVizinho() {
		Campo vizinho = new Campo(1, 1);
		boolean resultado = campo.adicionarVizinho(vizinho); // o retorno deve ser TRUE
		assertFalse(resultado);
	}
	
	
	
	
}