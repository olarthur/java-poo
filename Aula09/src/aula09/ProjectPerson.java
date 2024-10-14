package aula09;
public class ProjectPerson {
    public static void main(String[] args) throws Exception {
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Aristoteles");
        p2.setNome("Platao");
        p3.setNome("Kafka");
        p4.setNome("Bauman");

        p1.setSexo("M");
        p2.setSexo("F");
        p2.setIdade(18);
        
        p2.setCurso("Filosofia");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());


        
    }
}
