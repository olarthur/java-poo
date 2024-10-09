package Aula06;
public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int v) {
        this.volume = v;
    }

    public boolean getLigado() {
        return ligado;
    }
    public void setLigado(boolean l) {
        this.ligado = l;
    }
    
    public boolean getTocando() {
        return tocando;
    }
    public void setTocando(boolean t) {
        this.tocando = t;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Esta ligado? " + this.getLigado());
        System.out.println("Esta tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10) {
            System.out.println("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
       if (this.getLigado()) {
            this.setVolume(this.getVolume() + 1);
       }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 1);
        } 
    }

    @Override
    public void ligarMudo() {
        
    }

    @Override
    public void desligarMundo() {
        
    }

    @Override
    public void play() {
        
    }

    @Override
    public void pause() {
        
    }

    
}



