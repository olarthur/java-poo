package aula13;

public class Vizualizacao {

    private Frank espectador;
    private Video filme;

    
    public Vizualizacao(Frank espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }


    public void avaliar() {

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
