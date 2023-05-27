package com.restaurante.spring.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurante.spring.login.models.Reserva;

/* Classe de persistencia do banco de dados, essas classes são responsaveis por todas as query feitas
após uma requisição vinda do front 
*/
public interface ReservaRepository extends JpaRepository<Reserva, Long>{

}
