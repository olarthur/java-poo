package Aula06;
public class Controle{
    public static void main(String[] args) throws Exception {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.play();
        c.ligarMudo();
        c.desligarMudo();
        c.pause();
        c.play();
        c.abrirMenu();
        
    }
}
