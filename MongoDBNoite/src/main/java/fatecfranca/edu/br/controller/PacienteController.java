package fatecfranca.edu.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fatecfranca.edu.br.model.Paciente;
import fatecfranca.edu.br.model.repositories.PacienteRepository;

// classe será responsável por responder as requisições restful
// essa API permite o cliente acessar o banco de dados MongoDB
@RestController
public class PacienteController {

	// Spring tem como recurso principal a injeção de dependência
	// permite declarar um objeto do tipo de uma classe interface
	// e esse objeto pode utilizar os métodos da interface sem
	// precisar intanciá-la
	
	@Autowired
	PacienteRepository injecao;
	
	// retorna todos os pacientes cadastrados no banco de dados
	@GetMapping("/paciente")
	public List<Paciente> get() {
		
		return injecao.findAll();
	}
	@PostMapping("/paciente")
	public String post(@RequestBody Paciente paciente) {
		
		injecao.save(paciente);
		
		return "Paciente inserido com sucesso";
	}
	
}
