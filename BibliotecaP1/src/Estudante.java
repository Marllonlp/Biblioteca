public class Estudante extends Usuario {
    private String curso;
    private int periodo;

    public Estudante(){
        super(null, 0, ' ', null);
    }
    public Estudante(String nome, int idade, char sexo, String telefone, String curso) {
        super(nome, idade, sexo, telefone);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
