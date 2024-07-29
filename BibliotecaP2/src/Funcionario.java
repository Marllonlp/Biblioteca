public class Funcionario extends Usuario{
    private String cargo;

    public Funcionario(String nome, int idade, char sexo, String telefone, String cargo) {
        super(nome, idade, sexo, telefone);
        this.cargo = cargo;
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


