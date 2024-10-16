package aula12;

public class Aula12 {
    public static void main(String[] args) throws Exception {
        /* 
        Mamifero m = new Mamifero();
        m.emitirSom();

        Lobo l = new Lobo();
        l.emitirSom();
        */

        Cachorro c = new Cachorro();
        //c.emitirSom();
        c.reagir("Ola");
        c.reagir("Nothing");
        c.reagir(11, 45);
        c.reagir(21, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
    }
}
