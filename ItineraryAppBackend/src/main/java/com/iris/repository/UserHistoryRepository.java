package com.iris.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iris.entity.UserHistory;

@Repository
public interface UserHistoryRepository extends JpaRepository<UserHistory, Integer> {

}
