package br.com.coffeeandit.Livro;

public abstract class Livro {


    public Livro(String titulo, String autor, double preco, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.preco = preco;
        this.paginas = paginas;
    }

    public Livro() {

    }

    private String titulo;
    private String autor;
    private String editora;
    private double preco;
    private int paginas;


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    protected abstract void aumentarPreco(final double percentual);

    protected abstract void diminuirPreco(double percentual);

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public abstract String getCapa();

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", preco=" + preco +
                ", paginas=" + paginas +
                '}';
    }
}
