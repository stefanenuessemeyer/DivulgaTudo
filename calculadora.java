public class calculadora {
    public static void main(String[] args) {

        double PERCENTUAL_CLIQUE = 8.33;
        double PERCENTUAL_COMPARTILHAMENTO = 6.66;
        int VISUALIZACOES_POR_COMPARTILHAMENTO = 40;
        int VISUALIZACOES_POR_REAL = 30;
        double valorInvestimento = 1.0;
        int visualizacaoPorInvestimento = (int) (30 * valorInvestimento);

        double v = visualizacaoPorInvestimento / PERCENTUAL_CLIQUE;
        double v1 = v / PERCENTUAL_COMPARTILHAMENTO;
        double v2 = v1 * 4;
        double v3 = v2 * VISUALIZACOES_POR_COMPARTILHAMENTO;
        double v4 = visualizacaoPorInvestimento + v3;
        
        System.out.println(v3);
        System.out.println(v4); 
    }

}