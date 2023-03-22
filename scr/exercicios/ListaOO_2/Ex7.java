package ListaOO_2;

public class Ex7 {
    public class Pessoa{

        private String nome;
        private String endereco;
        private double telefone;
         

    public Pessoa(String nome, String endereco, Double telefone){
        this.nome=nome;
        this.endereco=endereco;
        this.telefone = telefone;
    }
    
    public void setNome(String nome){
    this.nome = nome;
    }
        
    public String getNome(){
       return nome;
    }
        
    public void setEndereco(String endereco){
         this.endereco = endereco;
    }
    
    public String getEndereco(){
    return endereco;
    }
        
    public void getTelefone(Double telefone){
       this.telefone = telefone;
    }
    
    public double setTelefone(Double telefone){
        return telefone;
    }

    
}}