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

    public Lutador() {
        
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

    private void setCategoria(String) {
        if (getPeso() < 52.2) {
            System.out.println("Invalido");
        } else if (getPeso() <= 70.3) {
            setCategoria("Leve");
        } else if (getPeso() <= 83.9) {
            setCategoria("Medio");
        } else if (getPeso() <= 120.2) {
            setCategoria("Pesado");
        } else {
            setCategoria("Invalido");
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


    @Override
    public void apresentar() {
        System.out.printf("Lutador: ", getNome());
        System.out.printf("Origem: ", getNacionalidade());
        System.out.println(getIdade(), " anos");
        System.out.println(getAltura(), " m de altura");
        System.out.printf("Pesando ", getPeso(), "Kg");
        System.out.printf("Ganhou: ", getVitorias());
        System.out.printf("Perdeu: ", getDerrotas());
        System.out.printf("Empatou: ", getEmpates());
    }
    @Override
    public void status() {
        System.out.println(getNome());
        System.out.println("e um peso ", getCategoria());
        System.out.println(getVitorias(), "vitorias");
        System.out.println(getDerrotas(), "derrotas");
        System.out.println(getEmpates(), "empates");
    }
    @Override
    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }
    @Override
    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }
    @Override
    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
}

