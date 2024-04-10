package br.com.medeiros.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.medeiros.projeto.entity.UsuarioEntity;

public interface UsuarioReposiory extends JpaRepository<UsuarioEntity, Long> {
	
}
