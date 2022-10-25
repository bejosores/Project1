package br.com.coffeeandit.Livro;

import br.com.coffeeandit.Fisico.LivroFisico;

public class CalculaReajuste implements Calculo {

    private static final String SOMA = "+";
    private static final String DIMINUICAO = "-";
    public static CalculaReajuste diminuirpreco;

    public CalculaReajuste() {

    }

    private double calcular(Livro livro, double indice, String operacao) {
        double indiceEscopo = indice;
        if (operacao.equals(SOMA)) {
            livro.aumentarPreco(indiceEscopo);
        } else {
            livro.diminuirPreco(indiceEscopo);
        }
        return livro.getPreco();
    }

    @Override
    public double aumentarPreco(Livro livro, double indice) {

        return calcular(livro, indice, SOMA);
    }

    public double diminuirPreco(Livro livro, double indice) {
        return calcular(livro, indice, DIMINUICAO);
    }
}
