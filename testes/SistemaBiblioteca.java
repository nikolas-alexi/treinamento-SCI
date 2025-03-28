import java.util.ArrayList;
import java.util.List;

// Classe Livro
class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        this.disponivel = false;
    }

    public void devolver() {
        this.disponivel = true;
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + " | Autor: " + autor + " | Disponível: " + (disponivel ? "Sim" : "Não");
    }
}

// Classe Usuario
class Usuario {
    private String nome;
    private Livro livroEmprestado;

    public Usuario(String nome) {
        this.nome = nome;
        this.livroEmprestado = null;
    }

    public String getNome() {
        return nome;
    }

    public Livro getLivroEmprestado() {
        return livroEmprestado;
    }

    public void pegarEmprestado(Livro livro) {
        this.livroEmprestado = livro;
    }

    public void devolverLivro() {
        this.livroEmprestado = null;
    }
}

// Classe Biblioteca
class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivrosDisponiveis() {
        System.out.println("\nLivros disponíveis:");
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                System.out.println(livro);
            }
        }
    }

    public void emprestarLivro(String titulo, Usuario usuario) {
        if (usuario.getLivroEmprestado() != null) {
            System.out.println(usuario.getNome() + " já tem um livro emprestado!");
            return;
        }

        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo) && livro.isDisponivel()) {
                livro.emprestar();
                usuario.pegarEmprestado(livro);
                System.out.println(usuario.getNome() + " emprestou o livro: " + titulo);
                return;
            }
        }
        System.out.println("Livro não encontrado ou indisponível!");
    }

    public void devolverLivro(Usuario usuario) {
        if (usuario.getLivroEmprestado() == null) {
            System.out.println(usuario.getNome() + " não tem nenhum livro para devolver!");
            return;
        }

        Livro livro = usuario.getLivroEmprestado();
        livro.devolver();
        usuario.devolverLivro();
        System.out.println(usuario.getNome() + " devolveu o livro: " + livro.getTitulo());
    }
}

// Classe principal com o main
public class SistemaBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Criando livros
        Livro livro1 = new Livro("O Hobbit", "J.R.R. Tolkien");
        Livro livro2 = new Livro("1984", "George Orwell");
        Livro livro3 = new Livro("Dom Quixote", "Miguel de Cervantes");

        // Adicionando livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // Criando usuários
        Usuario usuario1 = new Usuario("Alice");
        Usuario usuario2 = new Usuario("Carlos");

        // Listando livros disponíveis
        biblioteca.listarLivrosDisponiveis();

        // Emprestando livros
        biblioteca.emprestarLivro("O Hobbit", usuario1);
        biblioteca.emprestarLivro("1984", usuario2);

        // Tentando emprestar um livro já emprestado
        biblioteca.emprestarLivro("O Hobbit", usuario2);

        // Listando livros disponíveis após empréstimos
        biblioteca.listarLivrosDisponiveis();

        // Devolvendo um livro
        biblioteca.devolverLivro(usuario1);

        // Listando livros disponíveis após devolução
        biblioteca.listarLivrosDisponiveis();
    }
}