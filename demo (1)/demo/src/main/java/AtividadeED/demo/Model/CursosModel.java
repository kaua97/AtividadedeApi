package AtividadeED.demo.Model;


import jakarta.persistence.*;

@Entity
@Table(name= "table_TI")


public class CursosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false,unique = true, length = 100)
    private String Curso;

    @Column(nullable = false)
    private double materia;

    public CursosModel(Long id, String curso, double materia, double sala, double turno, double modalidade) {
        this.Id = id;
        this.Curso = curso;
        this.materia = materia;
        this.Sala = sala;
        this.Turno = turno;
        this.modalidade = modalidade;
    }

    @Column(nullable = false)
    private double Sala;

    @Column(nullable = false)
    private double Turno;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

    public double getMateria() {
        return materia;
    }

    public void setMateria(double materia) {
        this.materia = materia;
    }

    public double getSala() {
        return Sala;
    }

    public void setSala(double sala) {
        Sala = sala;
    }

    public double getTurno() {
        return Turno;
    }

    public void setTurno(double turno) {
        Turno = turno;
    }

    public double getModalidade() {
        return modalidade;
    }

    public void setModalidade(double modalidade) {
        this.modalidade = modalidade;
    }

    @Column(nullable = false)
    private double modalidade;

}
