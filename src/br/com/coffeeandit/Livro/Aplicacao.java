package br.com.coffeeandit.Livro;

import br.com.coffeeandit.Fisico.LivroFisico;
import br.com.coffeeandit.digital.LivroDigital;

public class Aplicacao {
    private static final double INDICE_AUMENTO = 0.2;
    private static final double INDICE_REDUCAO = 0.1;

    public static void main(String[] args) {


        Calculo calculaReajuste = new CalculaReajuste();

        LivroDigital livroDigital = new LivroDigital(" Império", " Neil Fergusson", " Abril", 80d, 230, "=qrcode", 10, "ficção");
        LivroFisico livroFisico = new LivroFisico(" O Silmarillion ", " J. R. Tolkien", " Capa dura", 33, 580);
        System.out.println(livroDigital);
        System.out.println("o preço do livro " + livroDigital.getTitulo() + " era de " + livroDigital.getPreco());
        CalculaReajuste calculaReajuste1 = new CalculaReajuste();
        calculaReajuste1.diminuirPreco(livroDigital, INDICE_REDUCAO);
        System.out.println("o preço do livro " + livroDigital.getTitulo() + "foi para " + livroDigital.getPreco());

        System.out.println(livroFisico);
        System.out.println("o preço do livro " + livroFisico.getTitulo() + " era de " + livroFisico.getPreco());
        calculaReajuste1.diminuirPreco(livroFisico, INDICE_REDUCAO);
        System.out.println("o preço do livro " + livroFisico.getTitulo() + "foi para " + livroFisico.getPreco());


    }

}
