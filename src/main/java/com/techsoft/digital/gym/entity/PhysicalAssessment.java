package com.techsoft.digital.gym.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PhysicalAssessment {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "student_id")
  private Student student;

  private LocalDateTime assessmentDate = LocalDateTime.now();

  @Column(name="current_weight")
  private double weight;

  @Column(name="current_height")
  private double height;

}
