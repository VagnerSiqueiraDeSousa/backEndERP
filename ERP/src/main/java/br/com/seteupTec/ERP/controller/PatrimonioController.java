package br.com.seteupTec.ERP.controller;

import br.com.seteupTec.ERP.entities.Patrimonio;
import br.com.seteupTec.ERP.service.PatrimonioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/patrimonio")
public class PatrimonioController {


    private final PatrimonioService patrimonioService;

    @Autowired
    public PatrimonioController(PatrimonioService patrimonioService) {
        this.patrimonioService = patrimonioService;
    }

    @GetMapping
    public ResponseEntity<List<Patrimonio>> listaPatrimonio() {
        return ResponseEntity.status(200).body(patrimonioService.ListarPatrimonio());
    }

    @PostMapping
    public ResponseEntity<Patrimonio> criarPatrimonio(@RequestBody Patrimonio patrimonio) {
        return ResponseEntity.status(201).body(patrimonioService.criarPatrimonio(patrimonio));
    }

    @PutMapping
    public ResponseEntity<Patrimonio> editarUsuario(@RequestBody Patrimonio patrimonio) {
        return ResponseEntity.status(200).body(patrimonioService.editarPatrimonio(patrimonio));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirUsuario(@PathVariable Integer id) {
        patrimonioService.excluirPatrimonio(id);
        return ResponseEntity.status(204).build();
    }
}
