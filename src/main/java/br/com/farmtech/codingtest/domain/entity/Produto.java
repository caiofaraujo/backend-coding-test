package br.com.farmtech.codingtest.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_PRODUTOS")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ID")
    private UUID id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "DT_CRIACAO")
    private LocalDateTime dtCriacao;

    @Column(name = "DT_ATUALIZACAO")
    private LocalDateTime dtAtualizacao;
}
