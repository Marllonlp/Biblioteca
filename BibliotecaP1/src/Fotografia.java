public class Fotografia extends Obra {
    private boolean cor;
    private String forma;

    public Fotografia(boolean cor, String forma) {
        this.cor = cor;
        this.forma = forma;
    }

    public Fotografia(String titulo, String autores, int ano, boolean cor, String forma) {
        super(titulo, autores, ano);
        this.cor = cor;
        this.forma = forma;
    }

    public boolean isCor() {
        return cor;
    }

    public void setCor(boolean cor) {
        this.cor = cor;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }
}
