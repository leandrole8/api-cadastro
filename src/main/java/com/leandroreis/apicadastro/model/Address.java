package com.leandroreis.apicadastro.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tb_enderecos")
@Data @AllArgsConstructor @NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "logradouro", nullable = false)
    private String place;

    @Column(name = "numero", nullable = false)
    private Integer number;

    @Column(name = "complemento", nullable = false)
    private String complement;

    @Column(name = "bairro", nullable = false)
    private String district;

    @Column(name = "cidade", nullable = false)
    private String city;

    @Column(name = "estado", nullable = false)
    private String state;

    @Column(name = "cep", nullable = false)
    private String zipCode;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
