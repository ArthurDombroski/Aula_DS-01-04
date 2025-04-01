package herança;

public class Veiculo {
    private String cor;
    private String velocimetro;
    private String modelo;

    
    public Veiculo(String cor, String velocimetro, String modelo) {
        this.cor = cor;
        this.velocimetro = velocimetro;
        this.modelo = modelo;
    }
    public Veiculo (){}

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getVelocimetro() {
        return velocimetro;
    }
    public void setVelocimetro(String velocimetro) {
        this.velocimetro = velocimetro;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void buzinar(){
        System.out.println("bibi");
    }
}
