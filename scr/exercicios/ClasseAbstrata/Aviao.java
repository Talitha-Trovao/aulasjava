package ClasseAbstrata;

public class Aviao extends Veiculo {
    //herdando obrigatoriamente a classe abstrata de veiculo
    @Override
    public void acelerar(){
        this.setVel(getVel()+100);
    }
    
}