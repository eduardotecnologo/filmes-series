import br.com.edudeveloper.seriesfilmes.calculos.CalculadoraTempo;
import br.com.edudeveloper.seriesfilmes.calculos.FiltroRecomendacao;
import br.com.edudeveloper.seriesfilmes.model.Episodio;
import br.com.edudeveloper.seriesfilmes.model.Filme;
import br.com.edudeveloper.seriesfilmes.model.Serie;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Star Wars"); 
        meuFilme.setAnoLancamento(1980);;
        meuFilme.setDuracaoEmMinutos(180); ;
        
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        
        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodioPorTemporada(10);
        lost.setMinutosPorEpisodio(46);
        
        System.out.println(meuFilme.getDuracaoEmMinutos());
        System.out.println(lost.getDuracaoEmMinutos());
        CalculadoraTempo calculadora = new CalculadoraTempo();
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal()); 
        
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
        
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        
        filtro.filtra(episodio);
    }
}