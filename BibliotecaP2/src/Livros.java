public class Livros extends Obra implements DAO {
    private String area;
    private String editora;
    private String edicao;
    private int numFolhas;
    private boolean emprestimo;

    public Livros(){

    }

    public Livros(String titulo, String autores, String area, String editora, int ano, String edicao, int numFolhas, boolean emprestimo) {
        super(titulo, autores, ano);
        this.area = area;
        this.editora = editora;
        this.edicao = edicao;
        this.numFolhas = numFolhas;
        this.emprestimo = false;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public int getNum_folhas() {
        return numFolhas;
    }

    public void setNumFolhas(int num_folhas) {
        this.numFolhas = num_folhas;
    }

    public boolean isEmprestimo() {
        return emprestimo = false;
    }

    public void setEmprestimo(boolean emprestimo) {
        this.emprestimo = false;
    }
    public void abrirLivro(){
        System.out.println("Livro aberto");
    }
    public void fecharLivro(){
        System.out.println("Livro fechado");
    }

    @Override
    public String toString(){
        return
                "Titulo = " + getTitulo() +
                "\n Autores = " +getAutores()+
                "\n Area = " +area+
                "\n Editora = " +editora+
                "\n Ano = " +getAno()+
                "\n Edição = " +edicao+
                "\n Numero de Folhas = " +numFolhas+
                "\n Esta emprestados = " + emprestimo;
    }

    @Override
    public void grava() {

    }

    @Override
    public void excluir() {

    }

    @Override
    public void ler() {

    }

    @Override
    public void atualizar() {

    }
}
