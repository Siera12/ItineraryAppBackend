package com.iris.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iris.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
