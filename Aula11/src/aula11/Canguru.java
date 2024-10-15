package aula11;

public class Canguru extends Mamifero{

    public void usarBolsa() {
        System.out.printf("Usando bolsa");
    }

    @Override
    public void locomover() {
        System.out.printf("\nSaltando");
    }
}
