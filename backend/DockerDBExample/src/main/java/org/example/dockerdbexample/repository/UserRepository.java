package org.example.dockerdbexample.repository;


import org.example.dockerdbexample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}