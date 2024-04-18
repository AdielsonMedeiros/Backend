package br.com.medeiros.projeto.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.medeiros.projeto.entity.PerfilEntity;

public interface PerfilRepository extends JpaRepository<PerfilEntity, Long>{

}