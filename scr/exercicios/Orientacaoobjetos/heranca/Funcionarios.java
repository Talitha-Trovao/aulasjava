package Orientacaoobjetos.heranca;

public class Funcionarios {
    private String nome;
    private String cpf;
    private double salario;

//classe construtora
    public Funcionarios(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
//get e set
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getcpf(){
        return cpf;
    }
    public void setcpf(String cpf){
        this.cpf = cpf;
    }

    public double getsalario(){
        return salario;
    }
    public void setsalario(double salario){
        this.salario = salario;
    }


    
}