package br.edu.fatecfranca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.model.Medico;
import br.edu.fatecfranca.model.repositories.MedicoRepository;

@RestController
@RequestMapping("/medico")
public class MedicoController {
	
	@Autowired
	MedicoRepository injecao;
	
	@PostMapping
	public String add(@RequestBody Medico medico) {
		injecao.save(medico);
		return "Médico inserido com sucesso";
	}
	
	@GetMapping
	public List<Medico> get(){
		return injecao.findAll();
	}

	@DeleteMapping("/{id}")
	public String remove(@PathVariable Long id) {
		injecao.deleteById(id);
		return "Médico removido com sucesso";
	}
	
	@PutMapping
	public String update(@RequestBody Medico medico) {
		injecao.save(medico);
		return "Médico atualizado com sucesso";
		
	}
}
