package ClasseAbstrata;

// classe abstrataa não recebe classe = new classe
public abstract class Veiculo {
    private int vel;
    private boolean status;

    public void ligar(){
        this.status = true;
    }

    public void desligar(){
        this.status = false;
    }

    public void viewStatus(){
        System.out.println("status "+ isStatus());
    }
    public abstract void acelerar();

//gets and sets
    public int getVel(){
        return vel;
    }
    public void setVel(int vel){
        this.vel = vel;
    }
//get and set em um booleano pode ser is nolugar de get
    public boolean isStatus(){
        return status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }

}