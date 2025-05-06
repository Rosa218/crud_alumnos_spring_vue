package com.rosa.alumnos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rosa.alumnos.model.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
    // Por ejemplo, para buscar alumnos por nombre o carrera
   

}
