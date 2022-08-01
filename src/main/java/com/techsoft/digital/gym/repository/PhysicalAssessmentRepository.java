package com.techsoft.digital.gym.repository;

import com.techsoft.digital.gym.entity.PhysicalAssessment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicalAssessmentRepository extends JpaRepository<PhysicalAssessment, Long> {

}
