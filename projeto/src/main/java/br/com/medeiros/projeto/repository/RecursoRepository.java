package br.com.medeiros.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.medeiros.projeto.entity.RecursoEntity;

public interface RecursoRepository extends JpaRepository<RecursoEntity, Long>{
	
}
