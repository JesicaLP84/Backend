package com.bosonit.formacion.Cliente.Repository;

import com.bosonit.formacion.Cliente.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
