public class MidiaAudio extends Obra{
    private String formato;
    private int duracao;

    public MidiaAudio(String formato, int duracao) {
        this.formato = formato;
        this.duracao = duracao;
    }

    public MidiaAudio(String titulo, String autores, int ano, String formato, int duracao) {
        super(titulo, autores, ano);
        this.formato = formato;
        this.duracao = duracao;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
