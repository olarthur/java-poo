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
        if(t == "CC") {
            this.saldo = 50;
        }
        if (t == "CP") {
            this.saldo = 150;
        }
    }

    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("Conta possui saldo, nao e possivel fechar");
        }
        if (this.saldo < 0) {
            System.out.println("Conta em debito, nao e possivel fechar");
        } 
        else {
            setStatus(false);
        }
    }

    public void depositar(float v) {
        if (this.status == true) {
            setSaldo(getSaldo() + v);
        } else {
            System.out.println("Impossivel depositar");
        }
    }

    public void sacar(float v) {
        if (getStatus() == true) {
            if (getSaldo() > v) {
                setSaldo(getSaldo() - v);
            } else {
               System.out.println("Saldo insuficiente"); 
            }
        } else {
            System.out.println("Impossivel sacar");
        }
    }

    public void pagarMensal() {
        float v = 0;
        if (this.tipo.equals("CC") ) {
            v = 12;
        } else if (this.tipo.equals("CP") ) {
            v = 20;
        }
        if (this.status == true) {
            if (this.saldo > v){
                setSaldo(getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel pagar");
        }
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
