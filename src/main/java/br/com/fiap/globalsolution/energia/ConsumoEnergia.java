package br.com.fiap.globalsolution.energia;

import br.com.fiap.globalsolution.empresa.Empresa;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "consumos")
public class ConsumoEnergia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime data;

    private Double valor;

    @ManyToOne
    private Empresa empresa;
}
