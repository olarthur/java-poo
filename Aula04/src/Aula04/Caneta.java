package Aula04;
public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public Caneta(String m, String c, float p) { // Método CONSTRUCT
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }
    
    public String getModelo() { // Método GETTERS
        return this.modelo;
    }
    public void setModelo(String m) { // Método SETTERS
        this.modelo = m;
    }

    public float getPonta() { // Método GETTERS
        return this.ponta;
    }
    public void setPonta(float p) { // Método SETTERS
        this.ponta = p;
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
    

    public void status() {
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
