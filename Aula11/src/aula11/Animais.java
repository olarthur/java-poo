package aula11;

public class Animais {
    public static void main(String[] args) throws Exception {
        
        Mamifero  m = new Mamifero();
        Reptil  r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(85.3f);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();

        r.setPeso(25f);
        r.setIdade(3);
        r.setMembros(4);
        r.locomover();
        r.alimentar();
        r.emitirSom();

        p.setPeso(0.50f);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();

        a.setPeso(2.3f);
        a.setIdade(3);
        a.setMembros(2);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();

    }
}
