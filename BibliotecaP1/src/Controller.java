import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Controller{
    Scanner ler = new Scanner(System.in);

    private String escolhaLivro;
    List<Livros> cadastrarLivro = new ArrayList<>();
    List<Usuario> cadastrarUser = new ArrayList<>();
    List<Emprestimo> emprestimos = new ArrayList<>();

    public void addLivro() {
        Livros livros = new Livros();
        System.out.println("Qual o Titulo do Livro que deseja cadastrar?");
        livros.setTitulo(ler.nextLine());
        System.out.println("Qual os autores?");
        livros.setAutores(ler.nextLine());
        System.out.println("Qual a area?");
        livros.setArea(ler.nextLine());
        System.out.println("Quem é o editoro(a)?");
        livros.setEditora(ler.nextLine());
        System.out.println("Qual ano de lançamento?");
        livros.setAno(ler.nextInt());
        ler.nextLine();
        System.out.println("Qual edição?");
        livros.setEdicao(ler.nextLine());
        System.out.println("Numero de Folhas?");
        livros.setNumFolhas(ler.nextInt());
        cadastrarLivro.add(livros);
    }

    public void addUsuario() {
        Usuario user = new Usuario();
        System.out.println("Qual o nome?");
        user.setNome(ler.nextLine());
        System.out.println("Quanto anos voce tem?");
        user.setIdade(ler.nextInt());
        System.out.println("Qual o sexo?");
        user.setSexo(ler.next().charAt(0));
        ler.nextLine();
        System.out.println("Qual telefone?");
        user.setTelefone(ler.nextLine());
        cadastrarUser.add(user);
    }

    public void Eprestimo(){

    }
}
