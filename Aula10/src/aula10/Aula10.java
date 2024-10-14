package aula10;

public class Aula10 {
    public static void main(String[] args) throws Exception {
        /* 
        Visitante v1 = new Visitante();

        v1.setNome("Froid");
        v1.setIdade(30);
        v1.setSexo("M");
        System.out.println(v1.toString());
        */

        Aluno a1 = new Aluno();

        a1.setNome("Platao");
        a1.setMatricula(1111);
        a1.setIdade(16);
        a1.setCurso("Filosofia");
        a1.setSexo("M");
        a1.PagarMensalidade();
        System.out.println(a1.toString());

    }
}
