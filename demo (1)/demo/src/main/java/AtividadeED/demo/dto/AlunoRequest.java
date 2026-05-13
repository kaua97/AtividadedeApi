package AtividadeED.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class AlunoRequest {

    @NotBlank(message = "Informe o curso")
    @Size(max = 100, message = "O curso deve conter no máximo 100 caracteres")
    private String curso;

    public @NotBlank(message = "Informe o semestre") @Size(max = 100, message = "o semestre deve conter no máximo 100 caracteres") String getSemestre() {
        return semestre;
    }

    public void setSemestre(@NotBlank(message = "Informe o semestre") @Size(max = 100, message = "o semestre deve conter no máximo 100 caracteres") String semestre) {
        this.semestre = semestre;
    }

    public @NotBlank(message = "Informe o curso") @Size(max = 100, message = "O curso deve conter no máximo 100 caracteres") String getCurso() {
        return curso;
    }

    public void setCurso(@NotBlank(message = "Informe o curso") @Size(max = 100, message = "O curso deve conter no máximo 100 caracteres") String curso) {
        this.curso = curso;
    }

    public @NotBlank(message = "Informe o sexo do aluno, exemplo: (feminino ou masculino)") String getSexo() {
        return sexo;
    }

    public void setSexo(@NotBlank(message = "Informe o sexo do aluno, exemplo: (feminino ou masculino)") String sexo) {
        this.sexo = sexo;
    }

    @NotBlank(message = "Informe a matricula do aluno, exemplo: ('1312432, 4241314...)")
    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(@NotBlank(message = "Informe a matricula do aluno, exemplo: ('1312432, 4241314...)") double matricula) {
        this.matricula = matricula;
    }

    @NotBlank(message = "Informe a idade desse aluno(a),exemplo: (13,14,15....)")
    public double getIdade() {
        return idade;
    }

    public void setIdade(@NotBlank(message = "Informe a idade desse aluno(a),exemplo: (13,14,15....)") double idade) {
        this.idade = idade;
    }

    @NotBlank(message = "Informe o semestre")
    @Size(max = 100, message = "o semestre deve conter no máximo 100 caracteres")
    private String semestre;

    public AlunoRequest() {
    }

    public AlunoRequest(String curso, String semestre, String sexo, double matricula, double idade) {
        this.curso = curso;
        this.semestre = semestre;
        this.sexo = sexo;
        this.matricula = matricula;
        this.idade = idade;
    }

    @NotBlank(message = "Informe o sexo do aluno, exemplo: (feminino ou masculino)")
    private String sexo;

    @NotBlank(message = "Informe a matricula do aluno, exemplo: ('1312432, 4241314...)")
    private double matricula;

    @NotBlank(message = "Informe a idade desse aluno(a),exemplo: (13,14,15....)")
    private double idade;



}
