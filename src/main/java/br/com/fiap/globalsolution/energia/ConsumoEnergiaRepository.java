package br.com.fiap.globalsolution.energia;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsumoEnergiaRepository extends JpaRepository<ConsumoEnergia, Long> {
    List<ConsumoEnergia> findByEmpresaId(Long empresaId);
}
