package revisão;
public class Aluno {
    private int rm;
    private String nome;
    private String email;

    public Aluno(){}

    public Aluno (String nome, int rm, String email){
        this.email = email;
        this.rm = rm;
        this.nome = nome;
        
    }
    public int getRm() {
        return rm;
    }
    public void setRm(int rm) {
        this.rm = rm;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}