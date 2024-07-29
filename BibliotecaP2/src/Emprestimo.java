public class Emprestimo implements DAO {
    private String dataEmprstimo;
    private String horaEmprestimo;
    private Livros livros;
    private Usuario usuario;

    public void setDataEmprstimo(String dataEmprstimo) {
        this.dataEmprstimo = dataEmprstimo;
    }

    public Livros getLivros() {
        return livros;
    }

    public void setLivros(Livros livros) {
        this.livros = livros;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDataEmprstimo() {
        return dataEmprstimo;
    }

    public void setDataEprestimo(String dataEmprstimo) {
        this.dataEmprstimo = dataEmprstimo;
    }

    public String getHoraEmprestimo() {
        return horaEmprestimo;
    }

    public void setHoraEmprestimo(String horaEmprestimo) {
        this.horaEmprestimo = horaEmprestimo;
    }

    public void devolverLivro(){
        System.out.println("Livro devolvido");
        livros.setEmprestimo(false);
    }

    public void emprestarLivro(){
        System.out.println("Livro emprestado");
        livros.setEmprestimo(true);
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
