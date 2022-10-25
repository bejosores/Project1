package br.com.coffeeandit.digital;

import br.com.coffeeandit.Livro.Livro;


public class LivroDigital extends Livro {
    public static final double INDICE_VIRTUAL = 0.03D;

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private String titulo;
    private String qrcode;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String genero;

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    private Integer ano;

    public LivroDigital(String titulo, String autor, String editora, double preco, int paginas, final String qrcode, Integer ano, String genero) {
        super(autor, editora, preco, paginas);
        this.titulo = titulo;
        this.qrcode = qrcode;
        this.ano = ano;
        this.genero = genero;
    }

    public LivroDigital() {

    }

    @Override
    public String getCapa() {
        return "www.coffeandit.store/capa_livro_digital.jpg";
    }

    @Override
    public void aumentarPreco(double percentual) {
        System.out.println(getClass().getSimpleName() + " " + percentual);
        double percentualNovo = percentual + INDICE_VIRTUAL;
        System.out.println(getClass().getSimpleName() + " " + percentualNovo);
        setPreco(getPreco() + (getPreco() * percentualNovo));
    }

    public void diminuirPreco(double percentual) {
        System.out.println(getClass().getSimpleName() + " " + percentual);
        double percentualNovo = percentual + INDICE_VIRTUAL;
        System.out.println(getClass().getSimpleName() + " " + percentualNovo);
        setPreco(getPreco() - (getPreco() * percentualNovo));
    }

    @Override
    public String toString() {
        return "LivroDigital{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", editora='" + getEditora() + '\'' +
                ", preco=" + getPreco() +
                ", qrcode" + qrcode +
                ", ano= " + ano +
                ", genero= " + genero +
                '}';
    }
}

