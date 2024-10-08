package Aula05;
public class Aula05 {
    public static void main(String[] args) throws Exception {
       ContaBanco p1 = new ContaBanco();
       p1.setNumConta(1111);
       p1.setDono("Arthur");
       p1.abrirConta("CC");
       
       ContaBanco p2 = new ContaBanco();
       p2.setNumConta(2222);
       p2.setDono("Oliveira"); 
       p2.abrirConta("CP");

        
       p1.depositar(300);
       p2.depositar(500);
       p2.sacar(100);

       p1.fecharConta();
       p1.sacar(350);
       p1.fecharConta();

       p1.mostrar();
       p2.mostrar();
    }
}
