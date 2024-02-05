public class Livro {
    public String titulo;
    public String autor;
    public int anoDePublicacao;

    public static void main(String[] args) {
        Livro meuLivro = new Livro();
        meuLivro.titulo = "Amigos,amores e aquela coisa terrível";
        meuLivro.autor = "Matthew Perry";
        meuLivro.anoDePublicacao = 2022;

        System.out.println("Título: " + meuLivro.titulo);
        System.out.println("Autor: " + meuLivro.autor);
        System.out.println("Ano de Publicação: " + meuLivro.anoDePublicacao);
    }
}
