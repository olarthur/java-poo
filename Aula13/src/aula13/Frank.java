package aula13;

public class Frank extends Pessoa{

    private String login;
    private double totAssistido;
    
    
    public Frank(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    

    public void viuMaisUm() {

    }


    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public double getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(double totAssistido) {
        this.totAssistido = totAssistido;
    }


    @Override
    public String toString() {
        return "Frank [" + super.toString() + "\n[login = " + login + ", totAssistido = " + totAssistido + "]";
    }

}
