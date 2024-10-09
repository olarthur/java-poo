package Aula06;
public class Controle {
    private int volume;
    private boolean ligado;
    private boolean tocando;
}

public Controle() {
    this.volume = 50;
    this.ligado = false;
    this.tocando = false;
}

private int getVolume() {
    return volume;
}

private Boolean getLigado() {
    return ligado;
}

private Boolean getTocando() {
    return tocando;
}

private void setVolume(int v) {
    this.volume = v;
}

private void setLigado(Boolean l) {
    this.ligado = l;
}

private void setTocando(Boolean t) {
    this.tocando = t;
}

