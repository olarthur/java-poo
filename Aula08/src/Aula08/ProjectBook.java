package aula08;

public class ProjectBook {
    public static void main(String[] args) throws Exception {
        Pesooa[] p = new Pesooa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pesooa("Pedro", 22, "M");
        p[1] = new Pesooa("Maria", 25, "F");

        l[0] = new Livro("Retorica", "Aristoteles", 288, p[0]);
        l[1] = new Livro("A Divina Comedia", "Dante Alighieri", 896, p[1]);
        l[2] = new Livro("A Republica", "Platao", 467, p[1]);

        l[0].abrir();
        l[0].folhear(188);
        l[0].avancarPag();
        l[0].fechar();
        l[0].abrir();
        System.out.println(l[0].detalhes());

        System.out.println(l[1].detalhes());
    }
}
