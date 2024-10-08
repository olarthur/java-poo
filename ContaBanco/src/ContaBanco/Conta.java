package ContaBanco;
public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Conta(int nc, String t, String d, float s) {
        this.numConta = nc;
        this.tipo = t;
        this.dono = d;
        this.saldo = s;
        this.abrir();
    }

    public void abrir() {
        this.status = true;
    }

    public void fechar() {
        this.status = false;
    }

    public void depositar() {

    }

    public void sacar() {

    }

    public void pagarMensal() {

    }

    public int getNumConta() {
        return this.numConta;
    }
    public void setNumConta(int nc) {
        this.numConta = nc;
    }

    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return this.dono;
    }
    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return this.saldo;
    }
    public void setSaldo(float s) {
        this.saldo = s;
    }


    public void mostrar() {
        System.out.println("CONTA CORRENTE:");
        System.out.println("Numero da Conta: " + this.numConta);
        System.out.println("Tipo da Conta: " + this.tipo);
        System.out.println("Dono: " + this.dono);
        System.out.println("Saldo da Conta e: " + this.saldo);
        System.out.println("Status da Conta: " + this.status);
    }

}   
