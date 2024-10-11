package Aula08;

public class Livro {
    private String titulo;
    private String autor;
    private int totPaginas;
    private boolean aberto;
    private Pesooa leitor;
    

    public void detalhes() {

    }

    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }


    public boolean isAberto() {
        return aberto;
    }


    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }


    public Pesooa getLeitor() {
        return leitor;
    }


    public void setLeitor(Pesooa leitor) {
        this.leitor = leitor;
    }
}
