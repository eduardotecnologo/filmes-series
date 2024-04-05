package br.com.edudeveloper.seriesfilmes.model;

public class Titulo {
	private String nome;
	private int anoLancamento;
	private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacaoes;
    private int duracaoEmMinutos;
    
    
    public int getTotalDeAvaliacaoes() {
    	return totalDeAvaliacaoes;
    }
    
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public boolean getIncluidoNoPlano() {
		return incluidoNoPlano;
	}

	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	public void exibeFichaTecnica() {
    	System.out.println(nome);
    }
    
    public void avalia(double nota){
    	somaDasAvaliacoes += nota; 
    	totalDeAvaliacaoes++;
    }
    
    public double obterMediaAvaliacoes() {
    	return somaDasAvaliacoes / totalDeAvaliacaoes;
    }
}
