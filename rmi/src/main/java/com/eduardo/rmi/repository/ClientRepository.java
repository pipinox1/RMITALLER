package com.eduardo.rmi.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduardo.rmi.entity.Client;

@Repository("clientRepository")
public interface ClientRepository extends JpaRepository<Client, Long> {

		Optional<Client> findById(Long id);
}
