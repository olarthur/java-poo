package Aula03;
public class Aula03 {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        // c1.ponta = 0.5f;
        c1.carga = 80;
        // c1.tampada = false;
        c1.tampar();
        c1.status();
        c1.rabiscar();

    }
}
