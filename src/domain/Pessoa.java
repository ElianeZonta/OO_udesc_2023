package domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pessoa {
   private String nome;
    private String endereço;
    private LocalDate nascimento;
    private BigDecimal salario;

    public Pessoa() {

    }

    public Pessoa(String nome, String endereço, LocalDate nascimento, BigDecimal salario) {
        this.nome = nome;
        this.endereço = endereço;
        this.nascimento = nascimento;
        this.salario = salario;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void apresentarse(){

        System.out.println(this.nome);
        System.out.println(this.endereço);
        System.out.println(this.nascimento);
        System.out.println(this.salario);


    }
}
