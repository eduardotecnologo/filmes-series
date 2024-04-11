import java.util.ArrayList;

import br.com.edudeveloper.seriesfilmes.calculos.CalculadoraTempo;
import br.com.edudeveloper.seriesfilmes.calculos.FiltroRecomendacao;
import br.com.edudeveloper.seriesfilmes.model.Episodio;
import br.com.edudeveloper.seriesfilmes.model.Filme;
import br.com.edudeveloper.seriesfilmes.model.Serie;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Star Wars");
        //meuFilme.setNome("Star Wars"); 
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
        
        var newFilme = new Filme("A Rede Social");

        newFilme.setDuracaoEmMinutos(300);
        //newFilme.setNome("A Rede Social");
        newFilme.setAnoLancamento(2015);
        newFilme.avalia(10);
        
        ArrayList<Filme> listaDeFilmes = new ArrayList<Filme>();
        listaDeFilmes.add(newFilme);
        listaDeFilmes.add(meuFilme);
        
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());
    }
}