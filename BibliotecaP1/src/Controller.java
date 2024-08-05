import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    Scanner ler = new Scanner(System.in);
    List<Livro> cadastrarLivro = new ArrayList<>();
    List<Usuario> cadastrarUser = new ArrayList<>();
    List<Emprestimo> emprestimos = new ArrayList<>();

    public void addLivro() {
        Livro livro = new Livro();
        System.out.println("Qual o Título do Livro que deseja cadastrar?");
        livro.setTitulo(ler.nextLine());
        System.out.println("Quais são os autores?");
        livro.setAutores(ler.nextLine());
        System.out.println("Qual a área?");
        livro.setArea(ler.nextLine());
        System.out.println("Quem é o editor(a)?");
        livro.setEditora(ler.nextLine());
        System.out.println("Qual o ano de lançamento?");
        livro.setAno(ler.nextInt());
        ler.nextLine(); // Limpar o buffer
        System.out.println("Qual a edição?");
        livro.setEdicao(ler.nextLine());
        System.out.println("Número de Páginas?");
        livro.setNumFolhas(ler.nextInt());
        ler.nextLine(); // Limpar o buffer

        cadastrarLivro.add(livro); // Adiciona o livro à lista
        System.out.println("Livro cadastrado com sucesso!");
    }

    public void addUsuario() {
        Usuario user = new Usuario();
        System.out.println("Qual o nome?");
        user.setNome(ler.nextLine());
        System.out.println("Quantos anos você tem?");
        user.setIdade(ler.nextInt());
        System.out.println("Qual o sexo? (M/F)");
        user.setSexo(ler.next().charAt(0));
        ler.nextLine(); // Limpar o buffer
        System.out.println("Qual o telefone?");
        user.setTelefone(ler.nextLine());

        cadastrarUser.add(user); // Adiciona o usuário à lista
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public void emprestimo() {
        //lista livros disponiveis
        for (Livro livro : cadastrarLivro) {
            if (!livro.isEmprestimo()) {
                System.out.println(livro);
            }
        }

        System.out.println("Digite o título do livro que deseja emprestar:");
        String titulo = ler.nextLine();

        Livro livroEmprestado = null;
        for (Livro livro : cadastrarLivro) {
            if (titulo.equalsIgnoreCase(livro.getTitulo()) && !livro.isEmprestimo()) {
                livroEmprestado = livro;
                break;
            }
        }

        if (livroEmprestado != null) {
            System.out.println("Digite o nome do usuário que deseja emprestar o livro:");
            String nomeUsuario = ler.nextLine();

            Usuario usuarioEmprestimo = null;
            for (Usuario user : cadastrarUser) {
                if (nomeUsuario.equalsIgnoreCase(user.getNome())) {
                    usuarioEmprestimo = user;
                    break;
                }
            }

            if (usuarioEmprestimo != null) {
                Emprestimo emprestimo = new Emprestimo();
                emprestimo.setLivros(livroEmprestado);
                emprestimo.setUsuario(usuarioEmprestimo);
                emprestimos.add(emprestimo);

                livroEmprestado.setEmprestimo(true); // Marca o livro como emprestado
                System.out.println("Livro emprestado com sucesso para " + usuarioEmprestimo.getNome() + "!");
            } else {
                System.out.println("Usuário não encontrado.");
            }
        } else {
            System.out.println("Livro não encontrado ou já está emprestado.");
        }
    }

    public void devolucao() {
        System.out.println("Digite o título do livro que deseja devolver:");
        String titulo = ler.nextLine().trim(); // Remover espaços em branco no início e no final

        Emprestimo emprestimoParaRemover = null;

        for (Emprestimo emprestimo : emprestimos) {
            Livro livro = emprestimo.getLivros();
            // Comparação de títulos (case insensitive)
            if (titulo.equalsIgnoreCase(livro.getTitulo())) {
                emprestimoParaRemover = emprestimo;
                break;
            }
        }

        if (emprestimoParaRemover != null) {
            Livro livroParaDevolver = emprestimoParaRemover.getLivros();
            livroParaDevolver.setEmprestimo(false); // Marcar o livro como não emprestado
            emprestimos.remove(emprestimoParaRemover); // Remover o empréstimo da lista
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("Livro não encontrado ou não estava emprestado.");
        }
    }


    // Método para listar todos os empréstimos
    public void listarEmprestimos() {
        if (emprestimos.isEmpty()) {
            System.out.println("Nenhum livro emprestado.");
        } else {
            for (Emprestimo emp : emprestimos) {
                System.out.println("Livro: " + emp.getLivros().getTitulo() +
                        ", Usuário: " + emp.getUsuario().getNome());
            }
        }
    }
}