package aula11;

public class Animais {
    public static void main(String[] args) throws Exception {
        
        Mamifero  m = new Mamifero();
        Reptil  r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro d = new Cachorro();
        Cobra s = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara ar = new Arara();

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

        c.setPeso(55.30f);
        c.setIdade(3);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();

        d.setPeso(3.3f);
        d.setIdade(4);
        d.setMembros(4);
        d.locomover();
        d.alimentar();
        d.emitirSom();
        d.abanarRabo();

        s.setPeso(3);
        s.setIdade(2);
        s.setMembros(0);
        s.locomover();
        s.alimentar();
        s.emitirSom();

        t.setPeso(5.300f);
        t.setIdade(20);
        t.setMembros(4);
        t.locomover();
        t.alimentar();
        t.emitirSom();

        g.setPeso(0.900f);
        g.setIdade(1);
        g.setMembros(0);
        g.locomover();
        g.alimentar();
        g.emitirSom();

        ar.setPeso(2.230f);
        ar.setIdade(3);
        ar.setMembros(2);
        ar.locomover();
        ar.alimentar();
        ar.emitirSom();
    
    }
}
