package br.com.coffeeandit.Livro;

public class CalcularBonificacao implements Calculo{
    @Override
    public double aumentarPreco(Livro livro, double indice) {
        return 2;
    }

    @Override
    public double diminuirPreco(Livro livro, double indice) {
        return 0;
    }
}

