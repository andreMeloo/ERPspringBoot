package com.educandoweb.coursespringboot.repositories;

import com.educandoweb.coursespringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
