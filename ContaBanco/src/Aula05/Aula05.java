package Aula05;
public class Aula05 {
    public static void main(String[] args) throws Exception {
       ContaBanco p1 = new ContaBanco();
       p1.setNumConta(1111);
       p1.setDono("Arthur");
       p1.abrirConta("CC");
       p1.mostrar();
    }
}
