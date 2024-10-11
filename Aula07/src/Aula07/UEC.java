package aula07;

public class UEC {
    public static void main(String[] args) throws Exception {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("PB", "France", 31, 1.75f, 68.9f, 11, 2, 1);
        
        l[1] = new Lutador("PS", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);

        l[2] = new Lutador("SnS", "Germany", 27, 1.65f, 80.9f, 17, 1, 4);

        l[3] = new Lutador("DC", "USA", 39, 1.93f, 81.6f, 12, 3, 3);

        l[4] = new Lutador("Jonh", "Mexican", 23, 1.70f, 119.3f, 13, 3, 5);

        l[5] = new Lutador("Shin", "Japanese", 24, 1.81f, 105.7f, 15, 4, 3);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[4], l[5]);
        UEC01.lutar();
        
    }
}
