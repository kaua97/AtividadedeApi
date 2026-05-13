package AtividadeED.demo.dto;

public class AlunoResponse {
    private String sexo;
    private double idade;
    private double semestre;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }

    public AlunoResponse(String sexo, double idade, double semestre, String curso, double matricula) {
        this.sexo = sexo;
        this.idade = idade;
        this.semestre = semestre;
        this.curso = curso;
        this.matricula = matricula;
    }

    private String curso;
    private double matricula;
}
