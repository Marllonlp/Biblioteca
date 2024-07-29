abstract class Obra {
    private String titulo;
    private String autores;
    private int ano;

    public Obra(){

    }
    public Obra(String titulo, String autores, int ano) {
        this.ano = ano;
        this.titulo = titulo;
        this.autores = autores;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }
}
