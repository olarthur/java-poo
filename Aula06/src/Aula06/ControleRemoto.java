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
        
    }

    @Override
    public void desligar() {
        
    }

    @Override
    public void abrirMenu() {
        
    }

    @Override
    public void fecharMenu() {
        
    }

    @Override
    public void maisVolume() {
       
    }

    @Override
    public void menosVolume() {
        
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



