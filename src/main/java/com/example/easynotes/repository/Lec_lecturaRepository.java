package com.example.easynotes.repository;
import com.example.easynotes.model.Lec_lectura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Lec_lecturaRepository extends JpaRepository<Lec_lectura, Long> {
}
