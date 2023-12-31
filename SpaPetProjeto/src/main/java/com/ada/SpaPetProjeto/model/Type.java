package com.ada.SpaPetProjeto.model;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "SERVICOS")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nomeservico", nullable = false)
    private String nomeServico;

    @Column(name = "descricaoservico", nullable = false)
    private String descricaoServico;

    @Column(name = "precoservico", nullable = false)
    private double precoServico;

    public void setActive(boolean b) {
    }
}

