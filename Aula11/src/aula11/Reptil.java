package aula11;

public class Reptil extends Animal{

    private String corEscama;


    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.printf("\nRastejando");
    }

    @Override
    public void alimentar() {
        System.out.printf("\nComendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.printf("\nsom de Reptil\n");
    }


}
