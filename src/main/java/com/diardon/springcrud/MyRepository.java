package com.diardon.springcrud;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositorio para realizar las operaciones CRUD. Extiende de JpaRepository.
 */
public interface MyRepository extends JpaRepository<MyProduct, Long>
{
    // Se pueden agregar métodos personalizados
}
