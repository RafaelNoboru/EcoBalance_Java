package br.com.fiap.globalsolution.energia;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProducaoEnergiaRepository extends JpaRepository<ProducaoEnergia, Long>{
    List<ProducaoEnergia> findByEmpresaId(Long empresaId);
}
