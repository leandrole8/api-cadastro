package com.leandroreis.apicadastro.repository;

import com.leandroreis.apicadastro.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
