package AtividadeED.demo.Model;


import jakarta.persistence.*;

@Entity
@Table(name="table_Professor")

public class ProfessorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true,length = 100)
    private double Id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private double Salario;

    @Column(nullable = false)
    private String email;

    public ProfessorModel(Long id, double id1, String nome, double salario, String email, double idade, double telefone) {
        this.id = id;
        this.Id = id1;
        this.nome = nome;
        this.Salario = salario;
        this.email = email;
        this.idade = idade;
        this.telefone = telefone;
    }

    @Column(nullable = false)
    private double idade;

    public Long getId() {
        return id;
    }

    public void setId(double id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public void setId(Long id) {
        this.id = id;
    }

    @Column(nullable = false)
    private double telefone;
}
