package aula10;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    
    public void PagarMensalidade() {

    }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matr) {
        this.matricula = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
