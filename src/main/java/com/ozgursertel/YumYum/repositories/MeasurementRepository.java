package com.ozgursertel.YumYum.repositories;

import com.ozgursertel.YumYum.entities.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeasurementRepository extends JpaRepository<Measurement,Long> {
}
