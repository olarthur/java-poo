package aula11;

public class Mamifero extends Animal{

    private String corPelo;


    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        System.out.printf("\nCorrendo...");
    }

    @Override
    public void alimentar() {
        System.out.printf("\nMamando");
    }

    @Override
    public void emitirSom() {
        System.out.printf("\nGrunido\n");
    }

}
