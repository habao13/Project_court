package com.court_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.court_system.model.users;

public interface UserRepository extends JpaRepository<users,Long> {

}
