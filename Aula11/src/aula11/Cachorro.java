package aula11;

public class Cachorro extends Mamifero{

    public void enterrarOsso() {
        System.out.printf("Enterrando Osso");
    }
        
    public void abanarRabo() {
        System.out.printf("Abanando Rabo\n");
    }

    @Override
    public void emitirSom() {
        System.out.println("\nLatindo..");
    }
}
