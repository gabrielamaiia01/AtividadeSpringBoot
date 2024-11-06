package gabriela.maia.atividadejava.controller;

import gabriela.maia.atividadejava.model.Aluno;
import gabriela.maia.atividadejava.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @PostMapping("/add")
    public ResponseEntity<String> addAluno(@RequestBody Aluno aluno) {
        alunoRepository.save(aluno);
        return ResponseEntity.ok("Aluno cadastrado com sucesso!");
    }

    @GetMapping("/list")
    public ResponseEntity<List<Aluno>> getAlunos(){
        List<Aluno> alunos = alunoRepository.findAll();
        return ResponseEntity.ok(alunos);
    }
}
