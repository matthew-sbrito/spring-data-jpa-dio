package com.techsoft.digital.gym.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentUpdateForm {
  private String name;
  private String district;
  private LocalDate birthDate;
}
