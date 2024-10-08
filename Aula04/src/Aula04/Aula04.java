package Aula04;
public class Aula04 {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta("Faber", "Vermelha", 0.8f);
        c1.status();
        Caneta c2 = new Caneta("Taber", "Preta", 0.3f);
        c2.status();



        /* 
        c1.setModelo("Bic");
        c1.modelo = "Bic";

        c1.setPonta(0.5f);
        c1.ponta = 0.5f;
        
        System.out.println("Tenho uma Caneta: " + c1.getModelo() + " de ponta " + c1.getPonta());
        */
    }
}
