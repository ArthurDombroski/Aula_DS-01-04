package herança;

public class Moto extends Veiculo {
    int motor;

    public Moto(){
        super();
    }

    

    public Moto(String cor, String velocimetro, String modelo, int motor) {
        super(cor, velocimetro, modelo);
        this.motor = motor;
    }



    public Moto(int motor) {
        this.motor = motor;
    }



    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    
}
