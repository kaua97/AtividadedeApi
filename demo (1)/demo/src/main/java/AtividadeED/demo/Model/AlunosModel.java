package AtividadeED.demo.Model;


import jakarta.persistence.*;
import org.yaml.snakeyaml.events.Event;

@Entity
@Table(name= "table_Aluno")

public class AlunosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true,length = 100)
    private String Sexo;

    @Column(nullable = false)
    private double idade;

    @Column(nullable = false)
    private double semestre;

    public AlunosModel(Long id, String sexo, double idade, double semestre, String curso, double matricula) {
        this.id = id;
        this.Sexo = sexo;
        this.idade = idade;
        this.semestre = semestre;
        this.curso = curso;
        this.Matricula = matricula;
    }

    @Column(nullable = false)
    private String curso;

    public AlunosModel() {
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public double getSemestre() {
        return semestre;
    }

    public void setSemestre(double semestre) {
        this.semestre = semestre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getMatricula() {
        return Matricula;
    }

    public void setMatricula(double matricula) {
        Matricula = matricula;
    }

    @Column(nullable = false)
    private double Matricula;

}
