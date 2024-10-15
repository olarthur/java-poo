package aula11;

public class Ave extends Animal{

    private String corPena;


    public void fazerNinho() {
        System.out.println("Construindo um Ninho");
    }


    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }


    @Override
    public void locomover() {
        System.out.printf("\nVoando");
    }


    @Override
    public void alimentar() {
        System.out.printf("\nComendo frutas");
    }


    @Override
    public void emitirSom() {
        System.out.printf("\nSom de ave\n");
    }

}
