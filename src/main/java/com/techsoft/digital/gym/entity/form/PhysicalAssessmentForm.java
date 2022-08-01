package com.techsoft.digital.gym.entity.form;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhysicalAssessmentForm {

  //@Positive(message = "O Id do aluno precisa ser positivo.")
  private Long studentId;

  //@NotNull(message = "Preencha o campo corretamente.")
  //@Positive(message = "${validatedValue}' precisa ser positivo.")
  private double weight;

  //@NotNull(message = "Preencha o campo corretamente.")
  //@Positive(message = "${validatedValue}' precisa ser positivo.")
  //@DecimalMin(value = "150", message = "'${validatedValue}' precisa ser no mínimo {value}.")
  private double altura;
}
