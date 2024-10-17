package aula13;
public class PjYtb {
    public static void main(String[] args) throws Exception {
        
        Video v[] = new Video[3];

        v[0] = new Video("POO");
        v[1] = new Video("Java");
        v[2] = new Video("HTML");

        Frank f[] = new Frank[2];

        f[0] = new Frank("Platao", 28, "M", "Republica");
        f[1] = new Frank("Homero", 27, "M", "Odisseia");


        Vizualizacao vz[] = new Vizualizacao[3];
        vz[0] = new Vizualizacao(f[0], v[2]);
        vz[0].avaliar();
        System.out.println(vz[0].toString());


        vz[1] = new Vizualizacao(f[0], v[1]);
        vz[0].avaliar(87.0f);
        System.out.println(vz[1].toString());

        //System.out.println(vz.toString());
        //System.out.println(f[0].toString());
        //System.out.println(v[0].toString());

    }
    
}
