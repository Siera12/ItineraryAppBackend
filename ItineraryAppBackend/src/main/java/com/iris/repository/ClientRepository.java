package com.iris.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iris.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
