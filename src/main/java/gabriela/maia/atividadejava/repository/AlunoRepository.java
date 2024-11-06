package gabriela.maia.atividadejava.repository;

import gabriela.maia.atividadejava.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository <Aluno, Integer> {


}
