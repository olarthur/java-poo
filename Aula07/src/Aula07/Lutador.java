package Aula07;

public class Lutador implements Painel{
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;
    

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.peso = pe;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public void apresentar() {

    }

    public void status() {

    }

    public void ganharLuta() {

    } 

    public void perderLuta() {

    }

    public void empatarLuta() {

    }


    public String getNome() {
        return nome;
    }
    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int id) {
        this.idade = id;
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float al) {
        this.altura = al;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float pe) {
        this.peso = pe;
        setCategoria();
    }

    private void setCategoria() {
        if (getPeso() < 52.2) {
            this.categoria = ("Invalido");
        } else if (getPeso() <= 70.3) {
            this.categoria = ("Leve");
        } else if (getPeso() <= 83.9) {
            this.categoria = ("Medio");
        } else if (getPeso() <= 120.2) {
            this.categoria = ("Pesado");
        } else {
            this.categoria = ("Invalido");
        }
    }

    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int em) {
        this.empates = em;
    }

}

