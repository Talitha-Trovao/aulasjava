package ClasseAbstrata;

public class Automovel extends Veiculo{
//herdando obrigatoriamente a classe abstrata de veiculo
    @Override
    public void acelerar(){
        this.setVel(getVel()+10);
    }
    
}