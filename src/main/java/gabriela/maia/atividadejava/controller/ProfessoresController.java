package gabriela.maia.atividadejava.controller;

import gabriela.maia.atividadejava.model.Professores;
import gabriela.maia.atividadejava.repository.ProfessoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/professores")
public class ProfessoresController {

    @Autowired
    private ProfessoresRepository professoresRepository;

    @PostMapping("/add")
    public ResponseEntity<String> addProfessores(@RequestBody Professores professores) {
        professoresRepository.save(professores);
        return ResponseEntity.ok("Professor cadastrado com sucesso!");
    }

    @GetMapping("/list")
    public ResponseEntity<List<Professores>> getProfessores(){
        List<Professores> Professores = professoresRepository.findAll();
        return ResponseEntity.ok(Professores);
    }

}

