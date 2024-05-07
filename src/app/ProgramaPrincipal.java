package app;

import domain.Pessoa;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Pessoa fulano = new Pessoa ();

        fulano.setNome("Zé da Silva");
        fulano.setEndereço("Rua dos programadores");
        fulano.setNascimento( LocalDate.of(1990,10,13));
        fulano.setSalario(new BigDecimal("10000.99"));


        System.out.println(fulano.nome);
        System.out.println(fulano.endereço);
        System.out.println(fulano.nascimento);
        System.out.println(fulano.salario);

        fulano.apresentarse();
    }
}
