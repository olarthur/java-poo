package aula10;

public class Bolsista extends Aluno{
    private float bolsa;
    

    public void RenovarBolsa() {
        System.out.println("Renovando bolsa de, " + this.getNome() + ".");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }


    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " e bolsista! Pagamento facilitado.");
    }
}
