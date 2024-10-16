package aula08;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pesooa leitor;
    
    
    public Livro(String titulo, String autor, int totPaginas, Pesooa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }


    public String detalhes() {
        return "{Livro: titulo = " + titulo + ",\n autor = " + autor + ",\n totPaginas = " + totPaginas + ", pagAtual = " + pagAtual +
              ", aberto = "  + aberto  + ",\n leitor = " + leitor.getNome() + ", idade = " + leitor.getIdade() + ", seco = " + leitor.getSexo() + "}";
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
    
    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
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

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPaginas) {
            this.pagAtual = 0;
        } else {
            this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }

    
}
