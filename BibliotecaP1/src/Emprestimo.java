public class Emprestimo {
    private String dataEmprstimo;
    private String horaEmprestimo;
    private Livro livros;
    private Usuario usuario;

    public void setDataEmprstimo(String dataEmprstimo) {
        this.dataEmprstimo = dataEmprstimo;
    }

    public Livro getLivros() {
        return livros;
    }

    public void setLivros(Livro livros) {
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
}
