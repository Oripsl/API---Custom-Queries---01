package com.example.demo.repositories;

import com.example.demo.entities.Flight;
import com.example.demo.entities.FlightStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightResporitory extends JpaRepository<Flight, Long> {
    List<Flight> findByStatus(FlightStatus flightStatus);
}
