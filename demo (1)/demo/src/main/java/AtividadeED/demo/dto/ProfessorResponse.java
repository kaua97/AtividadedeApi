package AtividadeED.demo.dto;

public class ProfessorResponse {
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public double getTelefone() {
        return telefone;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ProfessorResponse(String nome, double salario, double idade, double telefone, String email) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
        this.telefone = telefone;
        this.email = email;
    }

    private double idade;
    private double telefone;
    private String email;
}
