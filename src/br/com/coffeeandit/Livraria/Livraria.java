package br.com.coffeeandit.Livraria;


import br.com.coffeeandit.Livro.Livro;
import br.com.coffeeandit.digital.LivroDigital;

import java.util.ArrayList;
import java.util.List;

public class Livraria {
    public Livraria() {
    }

    public static void main(String args[]) {
        LivroDigital livro = new LivroDigital("Harry potter", "J.K.R.", "Abril", 200.00, 350, "qrcode", 2000, "ficção");

        // livro.aumentarPreco(0.5);
        //livro.diminuirPreco(0.7);


        LivroDigital livro2 = new LivroDigital("Deixe ir, não insista", "Diego Menin", "Record", 35.00, 420, "qrcode", 2010, "romance");
        LivroDigital livro3 = new LivroDigital("Prisioneiros da mente", "Augusto Curry", "Harter Collins", 300.00, 500, "qrcode", 2010, "romance");
        LivroDigital livro4 = new LivroDigital("Em busca de mim", "Viola Davies", "best seller", 41.90, 1220, "qrcode", 2022, "autobiografia");
        LivroDigital livro5 = new LivroDigital("Correntes", "Olga Tokarczuk", "ebook", 43.69, 400, "qrcode", 2021, "romance");
        LivroDigital livro6 = new LivroDigital("Querido John", "Nicholas Sparks", "amazon", 22.99, 288, "qrcode", 2010, "romance");
        LivroDigital livro7 = new LivroDigital("Dom Casmurro", "Machado de Assis", "prinipis", 11.98, 208, "qrcode", 1899, "realismo psicológico");
        LivroDigital livro8 = new LivroDigital("Quincas Borba", "Machado de Assis", "principis", 8.91, 240, "qrcode", 1891, "romance");
        LivroDigital livro9 = new LivroDigital("Memórias Póstumas de Brás Cubas", "Machado de Assis", "principis", 8.91, 192, "qrcode", 1881, "romance");
        LivroDigital livro10 = new LivroDigital("O vendedor de sonhos", "Augusto Curry", "academia", 17.91, 296, "qrcode", 2008, "romance psicológico");
        LivroDigital livro11 = new LivroDigital("Sobre os ossos dos mortos", "Olga Tokarczuk", "todavia", 44.91, 256, "qrcode", 2019, "ficção");
        LivroDigital livro12 = new LivroDigital("Capitães de areia", "Jorge Amado", "companhia das letras", 29.90, 237, "qrcpde", 1937, "ficção");


        List<LivroDigital> livrosDigitais = new ArrayList<>();
        livrosDigitais.add(livro);
        livrosDigitais.add(livro2);
        livrosDigitais.add(livro3);
        livrosDigitais.add(livro4);
        livrosDigitais.add(livro5);
        livrosDigitais.add(livro6);
        livrosDigitais.add(livro7);
        livrosDigitais.add(livro8);
        livrosDigitais.add(livro9);
        livrosDigitais.add(livro10);
        livrosDigitais.add(livro11);
        livrosDigitais.add(livro12);


        for (LivroDigital livros : livrosDigitais) {
            System.out.println("nome: " + livros.getTitulo());
            System.out.println("autor: " + livros.getAutor());
            System.out.println("editora: " + livros.getEditora());
            System.out.println("preço: " + livros.getPreco());
        }

        double menorPreco = 0;

        for (LivroDigital livroMenorPreco : livrosDigitais) {
            if (menorPreco == 0) {
                menorPreco = livroMenorPreco.getPreco();
            } else if (livroMenorPreco.getPreco() < menorPreco) {
                menorPreco = livroMenorPreco.getPreco();
            }
        }
        System.out.println("menor preço: " + menorPreco);

        double maispaginas = 0;
        for (LivroDigital livroMaisPagina : livrosDigitais) {
            if (maispaginas == 0) {
                maispaginas = livroMaisPagina.getPaginas();
            } else if (livroMaisPagina.getPaginas() > maispaginas) {
                maispaginas = livroMaisPagina.getPaginas();
            }
        }
        System.out.println("O livro com mais paginas é: " + maispaginas);

        double somaPreco = 0;
        for (LivroDigital livroDigit : livrosDigitais) {
            somaPreco = livroDigit.getPreco() + somaPreco;
        }
        System.out.println("a soma de todos os livros é " + somaPreco);

        // Integer anolanc = 1881;
        String nomeAutor = "Olga Tokarczuk";
        for (LivroDigital getNomeDaObra : livrosDigitais) {
            if (nomeAutor.equals(getNomeDaObra.getAutor())) {
                //  && anolanc.intValue() == getNomeDaObra.getAno().intValue())
                System.out.println(getNomeDaObra.getTitulo());
            }
        }
        int count = 0;
        String nomeLivro = "";
        Integer anoPublicacao = 0;

        for (LivroDigital tituloMaisAntigo : livrosDigitais) {
            count++;

            if (count == 1) {
                anoPublicacao = tituloMaisAntigo.getAno();

            }

            if ((tituloMaisAntigo.getAno() < anoPublicacao)) {
                anoPublicacao = tituloMaisAntigo.getAno().intValue();
                nomeLivro = tituloMaisAntigo.getTitulo();
            }
            if (count == livrosDigitais.size()) {
                System.out.println("o livro mais antigo do catálogo é: " + nomeLivro + " ano lançamento " + anoPublicacao.toString());
            }
        }

        List<LivroDigital> filtroLista = new ArrayList<>();
        for (LivroDigital livrosRef : livrosDigitais) {
            if (livrosRef.getAutor().equals("Machado de Assis")) {
                filtroLista.add(livrosRef);
            }
        }
        for (LivroDigital livroprint : filtroLista) {
            if (livroprint.getAutor().equals("Machado de Assis")) {
                System.out.println("Os livros disponiveis do autor são: " + livroprint.getTitulo());
            }


        List<LivroDigital> listagenero = new ArrayList<>();
        for (LivroDigital filtroGenero : livrosDigitais) {
            if (filtroGenero.getGenero().equals("romance")) {
                listagenero.add(filtroGenero);
            }
        }
        for (LivroDigital objGenero : listagenero) {
            System.out.println("Livros da categria romance:" + objGenero.getTitulo());
        }
    }


}
