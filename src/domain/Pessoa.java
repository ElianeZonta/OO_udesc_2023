package domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pessoa {
   public String nome;
    public String endereço;
    public LocalDate nascimento;
    public BigDecimal salario;

    public void apresentarse(){

        System.out.println(this.nome);
        System.out.println(this.endereço);
        System.out.println(this.nascimento);
        System.out.println(this.salario);


    }
}
