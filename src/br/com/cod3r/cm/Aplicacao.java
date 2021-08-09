package br.com.cod3r.cm;

import br.com.cod3r.cm.modelo.Tabuleiro;

public class Aplicacao {
	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		
		tabuleiro.abrirCampo(3, 3);
		tabuleiro.marcarCampo(4, 4);
		System.out.println(tabuleiro);
		
	}
}