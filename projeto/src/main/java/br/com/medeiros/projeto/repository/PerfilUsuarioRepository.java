package br.com.medeiros.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.medeiros.projeto.entity.PerfilUsuarioEntity;

public interface PerfilUsuarioRepository extends JpaRepository<PerfilUsuarioEntity, Long> {

}
