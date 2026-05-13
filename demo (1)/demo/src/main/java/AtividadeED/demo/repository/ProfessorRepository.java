package AtividadeED.demo.repository;

import AtividadeED.demo.Model.ProfessorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<ProfessorModel,Long> {
}
