public class Filme {
    String nome;
    int anoLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacaoes;
    int duracaoEmMinutos;
    
    int getTotalDeAvaliacaoes() {
    	return totalDeAvaliacaoes;
    }
    
    void exibeFichaTecnica() {
    	System.out.println(nome);
    }
    
    void avalia(double nota){
    	somaDasAvaliacoes += nota; 
    	totalDeAvaliacaoes++;
    }
    
    double obterMediaAvaliacoes() {
    	return somaDasAvaliacoes / totalDeAvaliacaoes;
    }
}
