package aula09;

public class Professor extends Pessoa{

    private String especialidade;
    private float salario;


    public void receberAum() {

    }


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String espec) {
        this.especialidade = espec;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
