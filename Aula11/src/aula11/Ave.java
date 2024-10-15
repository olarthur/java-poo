package aula11;

public class Ave extends Animal{

    private String corPena;


    public void fazerNinho() {
        System.out.println("Construindo um ninho");
    }


    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }


    @Override
    public void locomover() {
        System.out.println("Voando");
    }


    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }


    @Override
    public void emitirSom() {
        System.out.printf("Som de ave\n");
    }

}
