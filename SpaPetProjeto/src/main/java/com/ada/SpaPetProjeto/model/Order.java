package com.ada.SpaPetProjeto.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "ORDERS")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "datahora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHora;

    @Column(name = "totalprice", nullable = false)
    private Double totalPrice;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customerId;

    @ManyToMany
    @JoinTable(
            name = "ORDER_TYPE",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "type_id")
    )
    private List<Type> servicoId;

}
