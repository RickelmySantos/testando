package com.restaurante.spring.login.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurante.spring.login.models.User;


/* Classe de persistencia do banco de dados, essas classes são responsaveis por todas as query feitas
após uma requisição vinda do front 
*/

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  Optional<User> findByUsername(String username);

  Boolean existsByUsername(String username);

  Boolean existsByEmail(String email);
}
