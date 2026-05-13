package AtividadeED.demo.dto;

public class CursosResponse {
    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getSala() {
        return Sala;
    }

    public void setSala(String sala) {
        Sala = sala;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    private String Curso;
    private String materia;

    public CursosResponse(String curso, String materia, String sala, String turno, String modalidade) {
        Curso = curso;
        this.materia = materia;
        Sala = sala;
        this.turno = turno;
        this.modalidade = modalidade;
    }

    private  String Sala;
    private String turno;
    private String modalidade;

}
