package aula13;

public class Vizualizacao {

    private Frank espectador;
    private Video filme;

    
    public Vizualizacao(Frank espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
    }


    public Frank getEspectador() {
        return espectador;
    }


    public void setEspectador(Frank espectador) {
        this.espectador = espectador;
    }


    public Video getFilme() {
        return filme;
    }


    public void setFilme(Video filme) {
        this.filme = filme;
    }


    @Override
    public String toString() {
        return "Vizualizacao [espectador = " + espectador + ", filme = " + filme + "]";
    }

}
