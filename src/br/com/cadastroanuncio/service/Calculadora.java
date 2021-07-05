package br.com.cadastroanuncio.service;

public class Calculadora {

    private double PERCENTUAL_CLIQUE = 8.33;
    private double PERCENTUAL_COMPARTILHAMENTO = 6.66;
    private int VISUALIZACOES_POR_COMPARTILHAMENTO = 40;
    private int VISUALIZACOES_POR_REAL = 30;

    public void calculaInvestimeto(double valorInvestimento) {
        int visualizacaoPorInvestimento = (int) (VISUALIZACOES_POR_REAL * valorInvestimento);

        double cliquesGerados = visualizacaoPorInvestimento / PERCENTUAL_CLIQUE;
        System.out.printf("Quantidade máxima de cliques: %.2f%n", cliquesGerados);

        double compartilhamentoEmRedeSocial = cliquesGerados / PERCENTUAL_COMPARTILHAMENTO;
        double vizualizacaoEmRedeSocial = compartilhamentoEmRedeSocial * 4;
        System.out.printf("Quantidade máxima de compartilhamentos: %.2f%n", vizualizacaoEmRedeSocial);

        double somaDeVizualizacaoEcompartilhamento = vizualizacaoEmRedeSocial * VISUALIZACOES_POR_COMPARTILHAMENTO;
        System.out.printf("Quantidade máxima de visualizações: %.2f%n", somaDeVizualizacaoEcompartilhamento);
    }

}
