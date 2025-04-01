package herança;

public class Carro extends Veiculo{

    int numeroPortas;

    public Carro(){
        super();
    }

    

    public Carro(String cor, String velocimetro, String modelo, int numeroPortas) {
        super(cor, velocimetro, modelo);
        this.numeroPortas = numeroPortas;
    }



    public Carro(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }



    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

}
