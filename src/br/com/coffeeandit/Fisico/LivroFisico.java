package br.com.coffeeandit.Fisico;

import br.com.coffeeandit.Livro.Livro;

public class LivroFisico extends Livro {

    public static final double INDICE_FISICO = 0.5;

    public LivroFisico(String titulo, String autor, String editora, double preco, int paginas) {
        super(titulo, autor, preco, paginas);
    }

    public String getCapa() {
        return "www.coffeandit.store/capa_livro_fisico.jpg";
    }

    @Override
    protected void aumentarPreco(double percentual) {
        System.out.println(getClass().getSimpleName() + " " + percentual);
        double percentualNovo = percentual + INDICE_FISICO;
        System.out.println(getClass().getSimpleName() + " " + percentualNovo);
        setPreco(getPreco() + (getPreco() * percentualNovo));
    }

    protected void diminuirPreco(double percentual) {
        System.out.println(getClass().getSimpleName() + " " + percentual);
        double percentualNovo = percentual + INDICE_FISICO;
        System.out.println(getClass().getSimpleName() + " " + percentualNovo);
        setPreco(getPreco() - (getPreco() * percentualNovo));
    }
}



