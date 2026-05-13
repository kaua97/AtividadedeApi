package AtividadeED.demo.repository;

import AtividadeED.demo.Model.AlunosModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunosRepository extends JpaRepository<AlunosModel,Long> {
}
