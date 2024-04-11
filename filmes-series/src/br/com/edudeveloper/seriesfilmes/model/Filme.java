package br.com.edudeveloper.seriesfilmes.model;

import br.com.edudeveloper.seriesfilmes.calculos.Classificacao;

public class Filme extends Titulo implements  Classificacao{
	private String diretor;

	public Filme(String nome) {
		this.setNome(nome);
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	@Override
	public int getClassificacao() {
		// TODO Auto-generated method stub
		return (int) obterMediaAvaliacoes() / 2;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "FIlme: " + this.getNome() + " (" + this.getAnoLancamento() + ")";
	}
}
