package com.tripandora.Tripandora.repository;

import com.tripandora.Tripandora.entity.FuelValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuelValueRepository extends JpaRepository<FuelValue, Long> {
}
