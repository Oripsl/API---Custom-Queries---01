package com.example.demo.repositories;

import com.example.demo.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightResporitory extends JpaRepository<Flight, Long> {
}
