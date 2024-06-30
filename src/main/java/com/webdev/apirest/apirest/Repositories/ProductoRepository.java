package com.webdev.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webdev.apirest.apirest.Entities.Productos;

public interface ProductoRepository extends JpaRepository<Productos, Long> {

}
