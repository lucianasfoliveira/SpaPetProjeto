package com.ada.SpaPetProjeto.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Where;

import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "PETS")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String tipo;

    @Column(name = "datanascimento")
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    @Column(name = "genero")
    private String genero;

    @Column(name = "raca")
    private String raca;

    @Column(name = "peso", nullable = false)
    private double peso;

    @ManyToOne
    @JoinColumn(name = "dono_id")
    private Customer dono;

}

