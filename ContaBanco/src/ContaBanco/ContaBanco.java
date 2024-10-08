package ContaBanco;
public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Conta cc = new Conta(2, "CC", "Arthur", 500.00f);
        cc.mostrar();
    }
}
