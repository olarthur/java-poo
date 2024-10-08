package ContaBanco;
public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Conta(int nc, String t, String d, float s) {
        this.saldo = 0;
        this.status = false;
    }

    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
    }

    public void fecharConta() {
        this.status = false;
    }

    public void depositar() {

    }

    public void sacar() {

    }

    public void pagarMensal() {

    }

    public void setNumConta(int nc) {
        this.numConta = nc;
    }
    public int getNumConta() {
        return this.numConta;
    }
    
    public void setTipo(String t) {
        this.tipo = t;
    }
    public String getTipo() {
        return this.tipo;
    }

    public void setDono(String d) {
        this.dono = d;
    }
    public String getDono() {
        return this.dono;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }
    public float getSaldo() {
        return this.saldo;
    }

    public void setStatus(Boolean s) {
        this.status = s;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public void mostrar() {
        System.out.println("CONTA CORRENTE:");
        System.out.println("Numero da Conta: " + this.getNumConta());
        System.out.println("Tipo da Conta: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo da Conta e: " + this.getSaldo());
        System.out.println("Status da Conta: " + this.status);
    }
}   
