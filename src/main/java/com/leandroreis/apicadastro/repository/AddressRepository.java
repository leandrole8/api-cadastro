package com.leandroreis.apicadastro.repository;

import com.leandroreis.apicadastro.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
