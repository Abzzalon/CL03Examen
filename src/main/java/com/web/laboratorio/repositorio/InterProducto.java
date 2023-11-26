package com.web.laboratorio.repositorio;

import com.web.laboratorio.entidad.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterProducto extends JpaRepository<Producto, Integer> {
}
