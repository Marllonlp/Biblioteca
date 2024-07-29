public class Professor extends Usuario{
    private boolean ativo;
    private String matria;

    public Professor(){
        super(null,0, ' ',null);
    }
    public Professor(String nome, int idade, char sexo, String telefone, boolean ativo) {
        super(nome, idade, sexo, telefone);
        this.ativo = ativo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}
