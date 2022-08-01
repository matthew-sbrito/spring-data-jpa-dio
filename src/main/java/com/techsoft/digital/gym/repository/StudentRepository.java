package com.techsoft.digital.gym.repository;

import com.techsoft.digital.gym.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

  /**
   *
   * @param birthDate: data de nascimento dos alunos
   * @return lista com todos os alunos com a data de nascimento passada como parâmetro da função
   */
  List<Student> findByBirthDate(LocalDate birthDate);

}
