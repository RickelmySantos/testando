package com.restaurante.spring.login.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurante.spring.login.models.ERole;
import com.restaurante.spring.login.models.Role;

/* Classe de persistencia do banco de dados, essas classes são responsaveis por todas as query feitas
após uma requisição vinda do front 
*/

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
