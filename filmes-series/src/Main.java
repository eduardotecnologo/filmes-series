public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Star Wars";
        meuFilme.anoLancamento = 1980;
        meuFilme.duracaoEmMinutos = 180;
        
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        
        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacaoes());
        System.out.println(meuFilme.obterMediaAvaliacoes());
    }
}