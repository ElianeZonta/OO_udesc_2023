package domain;

public class TestaPacote {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();


        //p.nome = "Zé da Silva";

        p.setNome("Zé da Silva");
        System.out.println("Nome"+ p.getNome());

        //System.out.printf("Nome:" + p.nome);

    }
}
