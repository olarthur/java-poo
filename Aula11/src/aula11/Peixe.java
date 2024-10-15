package aula11;

public class Peixe extends Animal{

    private String corEscama;


    public void soltarBolha() {
        System.out.println("Soltando bolhas\n");
    }


    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }


    @Override
    public void locomover() {
        System.out.printf("\nNadando...");
    }


    @Override
    public void alimentar() {
        System.out.printf("\nComendo substancias");
    }


    @Override
    public void emitirSom() {
        System.out.printf("\nPeixe nao faz som\n");
    }
}
