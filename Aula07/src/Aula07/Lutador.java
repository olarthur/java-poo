package Aula07;

public class Lutador implements Painel{
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public String getNome() {
        return nome;
    }
    public void setNome(String n) {
        this.nome = n;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nc) {
        this.nacionalidade = nc;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int i) {
        this.idade = i;
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float a) {
        this.altura = a;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float p) {
        this.peso = p;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String c) {
        this.categoria = c;
    }

    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int v) {
        this.vitorias = v;
    }

    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int d) {
        this.derrotas = d;
    }

    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int e) {
        this.empates = e;
    }

    
    @Override
    public void apresentar() {
        
    }
    @Override
    public void status() {
        
    }
    @Override
    public void ganharLuta() {
        
    }
    @Override
    public void perderLuta() {
        
    }
    @Override
    public void empatarLuta() {
        
    }
}

