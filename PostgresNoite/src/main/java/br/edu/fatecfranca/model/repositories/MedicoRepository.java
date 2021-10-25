package br.edu.fatecfranca.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecfranca.model.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

}
