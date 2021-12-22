package com.leandroreis.apicadastro.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@Table(name = "tb_users", uniqueConstraints = {@UniqueConstraint(columnNames = {"cpf", "email"})})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Campo nome deve ser preenchido")
    @Column(name = "nome")
    private String name;

    @NotBlank(message = "Campo e-mail deve ser preenchido")
    @Email
    private String email;

    @NotBlank(message = "Campo cpf deve ser preenchido")
    private String cpf;

    @NotBlank(message = "Campo data de nascimento deve ser preenchido")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "data_de_nascimento")
    private LocalDate birthDate;

    @OneToMany(mappedBy = "user")
    private List<Address> addresses;
}
