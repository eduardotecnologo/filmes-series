package br.com.edudeveloper.seriesfilmes.calculos;

import br.com.edudeveloper.seriesfilmes.model.Titulo;

public class CalculadoraTempo {
	private int tempoTotal;

	public int getTempoTotal() {
		return tempoTotal;
	}
	
	/*public void inclui(Filme filme) {
		this.tempoTotal += filme.getDuracaoEmMinutos();
	}*/
	
	public void inclui(Titulo titulo) {
		this.tempoTotal += titulo.getDuracaoEmMinutos();	
	}
}
