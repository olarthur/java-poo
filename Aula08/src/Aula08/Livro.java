package Aula08;

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
        this.leitor = leitor;
    }


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
        
    }

    @Override
    public void fechar() {
        
    }

    @Override
    public void folhear() {
        
    }

    @Override
    public void avancarPag() {
        
    }

    @Override
    public void voltarPag() {
        
    }

    
}
